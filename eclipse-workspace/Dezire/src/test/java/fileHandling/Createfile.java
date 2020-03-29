package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Createfile {

	public static void main (String args[]) throws IOException {
		//String path = System.getProperty("user.dir");
		String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"demo.txt";
		System.out.println(path);
	File f = new File(path);
	if(!f.exists()){ 
		
		f.createNewFile();
		System.out.println("file created!");
		
	}else {
		System.out.println("file exists!");
	}
	Writer w = new FileWriter(f);
	BufferedWriter bw = new BufferedWriter(w);
	bw.write("hello selenium");
	bw.flush();
	bw.close();
	}

	
	 
}
