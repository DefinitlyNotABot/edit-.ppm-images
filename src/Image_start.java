import java.util.*;

public class Image_start {
	
	public static void main(String[] args) {
		
		
		PPMimage img = new PPMimage();
		ImageChanger change = img.getChanger();
		
		change.onlyRed();
		change.invertRed();
		
		img.convert();

	}

}
