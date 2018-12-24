package com.tool;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;

import java.io.IOException;

public class SqoopOrcaleTest {
    public static void main(String[] args) throws IOException {
        System.out.println(" begin test sqoop");
        String[] argument = new String[]{
                "--connect", "jdbc:oracle:thin:@localhost:1521:orcale",
                "--username", "system",
                "--password", "huang",
                "--table", "CDR_OUT_VISIT",
//                "--columns", "*",
                "-m","1",
                "--target-dir","user/CDR_OUT_VISIT"
        };
        //jdbc:mysql://192.168.210.1:3306/bbs?useUnicode=yes&characterEncoding=UTF-8&useSSL=false
        com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool)SqoopTool.getTool("import");
        Configuration conf= new Configuration();
        conf.set("fs.default.name","hdfs://192.168.159.160:9000/");
        Sqoop sqoop = new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf) );
        int res = Sqoop.runSqoop(sqoop,argument);
        System.out.println(res);
        System.out.println("执行sqoop结束");
    }
}
