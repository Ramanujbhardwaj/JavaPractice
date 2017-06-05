package com.macys.blobreader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BlobReader  {
	

	
  static String url = "jdbc:db2://ibm80p49:60004/mcyprdst:";
  static String username = "mcyread";
  static String password = "only4read";
  public static void main(String[] args) throws Exception {
    Class.forName("com.ibm.db2.jcc.DB2Driver");
    Connection conn = DriverManager.getConnection(url, username, password);
     FileWritersA ab = new FileWritersA();
    String sql = "select Order.RESERVATION_ID AS Reservation_ID, Order.USER_ID AS User_ID, Order_Attributes.ORDER_NUMBER AS Order_Number, Order_Attributes.ATTR_NAME AS Delivery_Rep_Name, "
    		+ " Order_Attributes.ATTR_VALUE AS Delivery_Rep_Date, Order_Attributes.CREATED AS Order_Placed_Date,DECODE(Shipment_Status.SHIP_METHOD_CODE,'G', 'Standard','2', 'Premium','0', 'Express',Shipment_Status.SHIP_METHOD_CODE) AS Shipping_Method_Type "
    		+ " from"
    		+ " Order_Attributes, Order, Order_Confirmation_Message, Shipment, Shipment_Status,"
    		+ "(select distinct shipment_id as shipment_id from shipment_item "
    		+ "where shipment_id in "
    		+ "(select shipment_id  from shipment_item "
    		+ "where  (created between timestamp('2016-02-11-00.00.00.000000') and timestamp('2016-02-12-00.00.00.000000')) group by shipment_id  having count(*)=1)) shipment_item "
    		+ "where "
    		+ "Order.created > timestamp('2016-02-11-00.00.00.000000') "
    		+ "and "
    		+ "Order_Confirmation_Message.created > timestamp('2016-02-11-00.00.00.000000') "
    		+ "and "
    		+ "Shipment.created > timestamp('2016-02-11-00.00.00.000000') "
    		+ "and "
    		+ "Shipment_Status.created > timestamp('2016-02-11-00.00.00.000000') "
    		+ "and "
    		+ "Order_Attributes.created > timestamp('2016-02-11-00.00.00.000000') "
    		+ "and "
    		+ "Order.ORDER_NUMBER = Order_Attributes.ORDER_NUMBER "
    		+ "and "
    		+ "Order_Attributes.ATTR_NAME = 'DEL_REP_DT' "
    		+ "and "
    		+ "Order_Confirmation_Message.USER_ID = Order.USER_ID "
    		+ "and "
    		+ "Shipment.ORDER_NUMBER = Order.ORDER_NUMBER "
    		+ "and "
    		+ "Shipment.SHIPMENT_ID = Shipment_Status.SHIPMENT_ID "
    		+ "and "
    		+ "Shipment.SHIPMENT_ID = Shipment_Item.SHIPMENT_ID "
    		+ "and "
    		+ "Shipment_Item.SHIPMENT_ID = Shipment_Status.SHIPMENT_ID "
    		+ "GROUP BY Order_Attributes.ORDER_NUMBER,Order_Attributes.ATTR_VALUE,Order_Attributes.ATTR_NAME, "
    		+ "Order.USER_ID,Order.RESERVATION_ID,Shipment_Status.SHIP_METHOD_CODE,Order_Attributes.CREATED "
    		+ "ORDER BY Order_Attributes.ORDER_NUMBER DESC";
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet resultSet = stmt.executeQuery();
    List<DataResultVO> arrayLst = new ArrayList<DataResultVO>();
    while(resultSet.next()){
    	DataResultVO vo = new DataResultVO();
    	vo.setReservationID(resultSet.getString(1));
    	vo.setUserID(resultSet.getString(2));
    	vo.setOrderNumber(resultSet.getString(3));
    	vo.setDeliveryRepName(resultSet.getString(4));
    	vo.setDeliveryRepDate(resultSet.getString(5));
    	vo.setOrderPlacedDate(resultSet.getString(6));
    	vo.setShippingMethodType(resultSet.getString(7));
    	arrayLst.add(vo);
    	System.out.println(resultSet.getString(3));
    }

    conn.close();
    ab.fileWriter(arrayLst);
  }
}