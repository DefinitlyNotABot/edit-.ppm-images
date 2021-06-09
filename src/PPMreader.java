import java.io.*;
import java.util.*;

public class PPMreader {
	
	Scanner reader;
	private String x;
	
	public PPMreader(String file) {
		
		try {
			reader = new Scanner(new File(file));
			x = reader.nextLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean readable() {
		if(reader.hasNext()) {
			return true;
		}
		return false;
	}
	
	public int getRead() {
		if(reader.hasNext()) {
			return reader.nextInt();
		
		}
		return -1;
	}
	public String firstin() {
		return x;
	}
	

}
