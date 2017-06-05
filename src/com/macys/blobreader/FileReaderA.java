package com.macys.blobreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class FileReaderA {
	public static void main(String[] args) throws Exception{
		FileReaderA a = new FileReaderA();
		a.readFile();
		
	}

		public void readFile() throws Exception{
			
				ClobReader a = new ClobReader();
				// The name of the file to open.
			    String fileName = "orderNumber.txt";
			
			    // This will reference one line at a time
			    String line = null;
			    
			    try {
			        // FileReader reads text files in the default encoding.
			        FileReader fileReader = 
			            new FileReader(fileName);

			  	  FileWriter fileWriter = new FileWriter("clob.csv"); 
				  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				  
			        // Always wrap FileReader in BufferedReader.
			        BufferedReader bufferedReader = 
			            new BufferedReader(fileReader);
			        bufferedWriter.write("Reservation Id"+", ");
			        bufferedWriter.write("User Id"+", ");
			        bufferedWriter.write("Order Number"+", ");
			        bufferedWriter.write("XML Data"+", ");
			        bufferedWriter.newLine();
			        while((line = bufferedReader.readLine()) != null) {
			        	int i=0;
			        	for (String retval: line.split(",")){
			        		if(i!=0){
			        			a.GetClobFromDb(bufferedWriter, retval);
			        		}else{
			        			bufferedWriter.write(retval+", ");
			        		}
			        			
			                i++;
			             }
			        	
			        }   
				    bufferedWriter.close();

			
			        // Always close files.
			        bufferedReader.close();         
			    }
			    catch(FileNotFoundException exs) {
			        System.out.println(
			            "Unable to open file '" + 
			            fileName + "'");                
			    }
			    catch(IOException exa) {
			        System.out.println(
			            "Error reading file '" 
			            + fileName + "'");                  
			        // Or we could just do this: 
			        // ex.printStackTrace();
			    }
			    
			}
}

