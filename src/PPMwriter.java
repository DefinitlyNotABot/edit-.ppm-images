import java.io.*;
import java.util.*;

public class PPMwriter {
	
	private PrintWriter printing;
	private PPMreader read;
	
	public PPMwriter(String file, PPMreader read) {
		this.read = read;
		try {
			printing = new PrintWriter(file + ".ppm");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		printing.println(read.firstin());
	}

	public void write(int w, int w2, int w3) {
		printing.print("" + w + " " + w2 + " " + w3 + " ");
	}
	public void writeln(int w, int w2, int w3) {
		printing.println("" + w + " " + w2 + " " + w3 + " ");
	}
	
	

}
