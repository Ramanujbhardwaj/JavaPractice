package com.macys.blobreader;

import java.sql.Clob;

public class DataResultVO {

	String reservationID;
	
	String userID;
	
	String orderNumber;
	
	String deliveryRepName;
	
	String deliveryRepDate;
	
	String orderPlacedDate;
	
	String shippingMethodType;
	

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDeliveryRepName() {
		return deliveryRepName;
	}

	public void setDeliveryRepName(String deliveryRepName) {
		this.deliveryRepName = deliveryRepName;
	}

	public String getDeliveryRepDate() {
		return deliveryRepDate;
	}

	public void setDeliveryRepDate(String deliveryRepDate) {
		this.deliveryRepDate = deliveryRepDate;
	}

	public String getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(String orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

	public String getShippingMethodType() {
		return shippingMethodType;
	}

	public void setShippingMethodType(String shippingMethodType) {
		this.shippingMethodType = shippingMethodType;
	}
	
	
}
