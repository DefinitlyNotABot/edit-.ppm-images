import java.util.*;

public class Image_start {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		PPMimage img = new PPMimage();
		ImageChanger change = img.getChanger();
		
		System.out.println("What do you want to do with that image?");
		System.out.println("	1: No red");
		System.out.println("	2: No green");
		System.out.println("	3: No blue");
		System.out.println("	4: Invert red");
		System.out.println("	5: Invert green");
		System.out.println("	6: Invert blue");
		System.out.println("	7: Invert all");
		System.out.println("	8: Less red");
		System.out.println("	9: Less green");
		System.out.println("	10: Less blue");
		System.out.println("	11: Less all");
		System.out.println("	12: Grey");
		System.out.println("	13: Black/White");
		
		int in = read.nextInt();
		
		if(in == 1) {
			change.deleteRed();
		}else if(in == 2) {
			change.deleteGreen();
		}else if(in == 3) {
			change.deleteBlue();
		}else if(in == 4) {
			change.invertRed();
		}else if(in == 5) {
			change.invertGreen();
		}else if(in == 6) {
			change.invertBlue();
		}else if(in == 7) {
			change.invertAll();
		}else if(in == 8) {
			System.out.println("How strong shall it be? 0-100");
			change.lessRed(read.nextInt());
		}else if(in == 9) {
			System.out.println("How strong shall it be? 0-100");
			change.lessGreen(read.nextInt());
		}else if(in == 10) {
			System.out.println("How strong shall it be? 0-100");
			change.lessBlue(read.nextInt());
		}else if(in == 11) {
			System.out.println("How strong shall it be? 0-100");
			change.lessAll(read.nextInt());
		}else if(in == 12) {
			change.grey();
		}else if(in == 13) {
			change.black();
		}else {
			
		}
		
		img.convert();

	}

}
