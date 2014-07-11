package rw;

import java.io.*;

public class Write {

	//Fields:
	String path;
	String data;
	PrintWriter output;
	FileWriter file;
	
	//Constructor:
	public Write(String path, String data){
		this.path=path;
		this.data=data;
		try{
			this.write();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	//Writes on file
	public void write() throws Exception{
		file = new FileWriter(path);
		output = new PrintWriter(file);
		output.print(data);
		output.close();
		file.close();
	}
	
}
