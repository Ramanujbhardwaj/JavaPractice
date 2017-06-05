package com.macys.blobreader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWritersA {
	public void fileWriter(List<DataResultVO> vos) {

        // The name of the file to open.
        String fileName = "temp1.csv";
        String OrderNumber = "orderNumber.txt";
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);
            
            FileWriter fileWriters = new FileWriter(OrderNumber); //Order Writer
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            
            BufferedWriter bufferedWriters = new BufferedWriter(fileWriters); // Order Writer
            
            // Note that write() does not automatically
            // append a newline character.
            for(DataResultVO vo : vos){
	            bufferedWriter.write(vo.getReservationID()+",");            
	            bufferedWriter.write(vo.getUserID()+",");
	            bufferedWriter.write(vo.getOrderNumber()+",");
	            bufferedWriter.write(vo.getDeliveryRepName()+",");
	            bufferedWriter.write(vo.getDeliveryRepDate()+",");
	            bufferedWriter.write(vo.getOrderPlacedDate()+",");
	            bufferedWriter.write(vo.getShippingMethodType()+",");
	            
	            bufferedWriter.newLine();
	            
	            bufferedWriters.write(vo.getReservationID()+",");
	            bufferedWriters.write(vo.getOrderNumber());
	            bufferedWriters.newLine();
            }
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
       
    }
}
