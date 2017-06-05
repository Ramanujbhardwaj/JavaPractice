package com.macys.reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHCommandExecutorV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String host = null;
	//	 host = "11.168.110.64"; //qa11 macys
	//	 host = "11.168.113.23"; //qa14 macys
		 host = "11.168.112.158"; //qa13 bloomingdales
	//	 host = "11.168.112.218"; //qa7 bloomingdales
	//	 host = "11.168.110.64"; //qa11 macys
		String grepKeyword = "Null";		
		String pathForGrep = "cd /www/logs/";
		String specificPathForGrep =  "WebSphere70";
		String filenametoStoreGrep = "test";	
		String user = "labuser";
		String password = "labuser";
		try {
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected  to the Server:::::  " + host);
			System.out.println("Going to grep for the Keyword:::" + grepKeyword + ":::in the path:::" +pathForGrep);
			System.out.println("Grep data will be stored in the filename:::::  " + filenametoStoreGrep);
			executeCommands(session, grepKeyword,pathForGrep,filenametoStoreGrep,specificPathForGrep);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param command1
	 * @param session
	 * @return
	 * @throws JSchException
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	private static void executeCommands(Session session, String grepKeyword,String pathForGrep,String filenameForGrep,String specificPathForGrep)
			throws JSchException, IOException, InterruptedException {
			String grepCommand = "grep -R \"" + grepKeyword + "\" "+specificPathForGrep+ " --exclude=lost+found";
			
		System.out.println("Grep command to be executed:::" + grepCommand);
		Channel channel = session.openChannel("shell");
		OutputStream ops = channel.getOutputStream();
		PrintStream ps = new PrintStream(ops, true);
		channel.connect();
		InputStream in = channel.getInputStream();
		ps.println("pwd");
		ps.println(pathForGrep);
		ps.println("pwd");
		ps.println("ls -ltr");		
		ps.println(grepCommand);		
		//ps.println("exit");
		ps.close();

		printResult(channel, in,filenameForGrep);
		channel.disconnect();
		session.disconnect();
		System.out.println("DONE");

	}

	/**
	 * @param channel
	 * @param in
	 * @throws IOException
	 */
	private static void printResult(Channel channel, InputStream in,String filenameForGrep)
			throws IOException {
		byte[] tmp = new byte[1024];
		FileOutputStream fileOuputStream = new FileOutputStream(
				".\\"+filenameForGrep+".log");

		while (true) {
			while (in.available() > 0) {
				int i = in.read(tmp, 0, 1024);
				if (i < 0)
					break;
				System.out.print(new String(tmp, 0, i));
				fileOuputStream.write(tmp);

			}
			if (channel.isClosed()) {
				System.out.println("exit-status: " + channel.getExitStatus());
				fileOuputStream.close();
				break;
			}
			try {
				Thread.sleep(2000);
			} catch (Exception ee) {
			}
		}

	}

}