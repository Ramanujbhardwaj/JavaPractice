package com.macys.blobreader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClobReader  {
	
	
	
  static String url = "jdbc:db2://ibm80p49:60004/mcyprdst:";
	//static String url = "jdbc:db2://11.168.113.173:60000/MLQ10";
  static String username = "mcyread";
	//static String username = "mcyapp";
  static String password = "only4read";
 // static String password = "dbacce5s";
   
  
  public void GetClobFromDb(BufferedWriter bufferedWriter, String orderId) throws Exception {
		Class.forName("com.ibm.db2.jcc.DB2Driver");
	    Connection conn = DriverManager.getConnection(url, username, password);
	    String sql = "SELECT  USER_ID, ORDER_NUMBER, XML_DATA from ORDERLOG 	";
	    PreparedStatement stmt = conn.prepareStatement(sql);
	    stmt.setString(1, orderId);
	    ResultSet resultSet = stmt.executeQuery();
	    while(resultSet.next()){
	    	String userId = resultSet.getString(1);
	    	String orderNumber = resultSet.getString(2);
	    	Clob clob = resultSet.getClob(3);
	    	
	    	bufferedWriter.write(userId+", ");
	    	bufferedWriter.write(orderNumber+", ");
	    	String xmlData = clob.getSubString(1, (int) (clob.length()-1));
	    	
	    	bufferedWriter.write(xmlData);
	    	bufferedWriter.newLine();
	    	bufferedWriter.newLine();
	    }
	
	    conn.close();
	  
  }
  
  
  
}