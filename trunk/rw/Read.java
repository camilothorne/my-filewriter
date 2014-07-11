package rw;

import java.io.*;

public class Read {
	
	//Fields:
	String path;
	String mydata = "";
	FileInputStream file;
	StreamReader output;
	
	//Constructor:
	public Read(String path){
		this.path=path;
		
		try{
			this.read();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	//Reads file
	public void read() throws Exception{
		file = new FileInputStream(path);
		output = new StreamReader(file);
		file.close();
	}
	
	//Returns file content
	public String fileSt(){
		return mydata;
	}
	
    public class StreamReader{
    	InputStream is;
    	public StreamReader(InputStream is){
    		this.is = is;
    		this.run();
    	}
    	public void run(){
    		//String mydata = "";
    		String data;
    		try{
    			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    			while((data = reader.readLine()) != null){
    				mydata = mydata + data + "\n";
    				//System.out.print(mydata);
    			}

    		}
    		catch(IOException ex){
    			 //ex.printStackTrace();
    		}
    	}
    }

}
