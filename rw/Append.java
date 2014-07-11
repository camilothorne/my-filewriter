package rw;

import java.io.*;

public class Append {

	//Fields:
	String path;
	String data;
	PrintWriter output;
	FileWriter file;
	
	//Constructor:
	public Append(String path, String data){
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
		file = new FileWriter(path,true);
		//output = new PrintWriter(file,true);
		file.write(data);
		//output.close();
		file.close();
	}
	
}
