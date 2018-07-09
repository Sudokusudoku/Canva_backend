package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//实现数据库的连接，返回数据库连接对象
public class DBHelper {

	private static final String driver = "com.mysql.jdbc.Driver";//数据库驱动
	private static final String url = "jdbc:mysql://localhost:3306/shopping?useUnicode=true&characterEncoding=UTF-8";
	private static final String username = "root";//数据库的用户名
	private static final String password = "root";//数据库的密码
	
	private static Connection conn = null;
	
	//静态代码块负责加载驱动
	static{
		try{
			Class.forName(driver);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//单例模式返回数据库连接对象
	public static Connection getConnection() throws SQLException{
		if(conn==null){
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
}
