package read;

import java.io.*;

public class Keyboard {
	
	//One property:
	
	static BufferedReader r = new BufferedReader
	(new InputStreamReader(System.in));
	
	//Method 1
	
	public static String read_string(){
		String k = "";
		try{
		k = r.readLine();
			}
		catch(IOException ex){
			  System.out.println(ex);
			  System.exit(1);
			}
		return k;
	}

	//Method 2
	
	public static int read_int(){
		String s = "";
		int k = 0;
		try{
		s = r.readLine();
		k = Integer.parseInt(s);
			}
		catch(IOException ex){
			  System.out.println(ex);
			  System.exit(1);
			}
		return k;
	}
}
