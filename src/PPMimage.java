import java.util.Scanner;

public class PPMimage {
	

	private Pixel pixels[][];
	
	private ImageChanger img;
	
	private int w = 0;
	private int h = 0;
	private int d = 0;
	
	private int ft;
	
	private PPMreader read;
	private PPMwriter write;
	
	public PPMimage() {

		firstAction();
	}
	
	private void firstAction() {
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Welches Bild soll bearbeitet werden?");
		read = new PPMreader(scn.nextLine());
		
		
		
		if(read.readable()) {
			w = read.getRead();
		}
		if(read.readable()) {
			h = read.getRead();
		}
		if(read.readable()) {
			d = read.getRead();
		}
		
		pixels = new Pixel[h][w];
		
		int r = 0;
		int g = 0;
		int b = 0;
		
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(read.readable()) {
					r = read.getRead();
				}
				if(read.readable()) {
					g = read.getRead();
				}
				if(read.readable()) {
					b = read.getRead();
				}
				pixels[i][j] = new Pixel(r,g,b);
			}
		}
		
		img = new ImageChanger(pixels, w, h, d, read);
		
		System.out.println("Image Created");
	}
	
	public int getHeight() {
		return h;
	}
	public int getWidth() {
		return w;
	}
	public int getDepth() {
		return d;
	}
	
	public Pixel[][] imageArray(){
		return pixels;
	}
	public ImageChanger getChanger() {
		return img;
	}
	
	public void convert() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Wie soll dieses Bild heißen?");
		write = new PPMwriter(scn.nextLine(), read);

		write.write(w, h, d);

		int x = 1;
		
		
		for(int i = 0; i < h; i++) {		
			for(int j = 0; j < w; j++) {
				
				if(x == 70) {
					write.writeln(pixels[i][j].getRed(), pixels[i][j].getBlue(), pixels[i][j].getGreen());
				}else {
					write.write(pixels[i][j].getRed(), pixels[i][j].getBlue(), pixels[i][j].getGreen());
					x = 1;
				}
				x++;
				System.out.println(pixels[i][j].getRed());
			}
		}
		write.exit();
		System.out.println("Done :)");
		
		
	}
	
	
	
	

}




