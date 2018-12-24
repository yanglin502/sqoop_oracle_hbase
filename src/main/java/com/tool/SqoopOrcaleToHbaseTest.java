package com.tool;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;

import java.io.IOException;

/**
 * Created by huangweicheng on 2018/12/14.
 */
public class SqoopOrcaleToHbaseTest {
    public static void main(String[] args) throws IOException {
        System.out.println(" begin test sqoop");
        String[] argument = new String[]{
                "--connect", "jdbc:oracle:thin:@localhost:1521:orcale",
                "--username", "system",
                "--password", "huang",
                "--query", "select * from CDR_OUT_VISIT where $CONDITIONS",
//                "--table", "CDR_OUT_VISIT",
                "--hbase-row-key", "ROWKEY",
                "--column-family", "info",
                "--hbase-table", "flume",
//                "--columns", "*",
                "-m","1"
//                "--target-dir","user/CDR_OUT_VISIT"
        };
        com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool) SqoopTool.getTool("import");
        Configuration conf= new Configuration();
        conf.set("hbase.zookeeper.quorum", "192.168.159.160");
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        Sqoop sqoop = new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf) );
        int res = Sqoop.runSqoop(sqoop,argument);
        System.out.println(res);
        System.out.println("执行sqoop结束");
    }
}
