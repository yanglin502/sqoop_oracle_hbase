package com.example.demo;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(" begin test sqoop");
		String[] argument = new String[]{
				"--connect", "jdbc:oracle:thin:@192.168.210.1:1521:orcale",
				"--username", "system",
				"--password", "huang",
				"--table", "TBNAME",
//				"--hbase-table", "flume",
//				"--column-family", "f",
//				"--hbase-row-key", "ROWKEY",
				"-m", "1",
				"--target-dir", "/user/hadoop1"

		};
		com.cloudera.sqoop.tool.SqoopTool sqoopTool=(com.cloudera.sqoop.tool.SqoopTool) SqoopTool.getTool("import");
		Configuration conf= new Configuration();
		conf.set("fs.default.name","hdfs://192.168.159.160:9000/");
		Sqoop sqoop = new Sqoop(sqoopTool,SqoopTool.loadPlugins(conf) );
		int res = Sqoop.runSqoop(sqoop,argument);
		System.out.println(res);
		System.out.println("执行sqoop结束");
	}

}

