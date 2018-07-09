package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//ʵ�����ݿ�����ӣ��������ݿ����Ӷ���
public class DBHelper {

	private static final String driver = "com.mysql.jdbc.Driver";//���ݿ�����
	private static final String url = "jdbc:mysql://localhost:3306/shopping?useUnicode=true&characterEncoding=UTF-8";
	private static final String username = "root";//���ݿ���û���
	private static final String password = "root";//���ݿ������
	
	private static Connection conn = null;
	
	//��̬����鸺���������
	static{
		try{
			Class.forName(driver);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//����ģʽ�������ݿ����Ӷ���
	public static Connection getConnection() throws SQLException{
		if(conn==null){
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
}
