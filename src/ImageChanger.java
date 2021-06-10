
public class ImageChanger {
	
	private Pixel[][] pixels;
	private int w = 0;
	private int h = 0;
	private int d = 0;
	
	public ImageChanger(Pixel[][] imgArray, int w, int h, int d, PPMreader read) {
		pixels = imgArray;
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	public void deleteRed() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				pixels[i][j].setRed(0);
			}
		}
	}
	public void deleteGreen() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				pixels[i][j].setGreen(0);
			}
		}
	}
	
	public void deleteBlue() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				pixels[i][j].setBlue(0);
			}
		}
	}
	
	public void onlyRed() {
		this.deleteBlue();
		this.deleteGreen();
	}
	public void onlyGreen() {
		this.deleteBlue();
		this.deleteRed();
	}
	public void onlyBlue() {
		this.deleteGreen();
		this.deleteRed();
	}
	public void invertRed() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int g = pixels[i][j].getRed();
				pixels[i][j].setRed(d-g);
			}
	}
	}
	public void invertGreen() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int g = pixels[i][j].getGreen();
				pixels[i][j].setGreen(d-g);
			}
	}
	}
	public void invertBlue() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int g = pixels[i][j].getBlue();
				pixels[i][j].setBlue(d-g);
			}
		}
	}

	public void invertAll() {
		this.invertRed();
		this.invertGreen();
		this.invertBlue();
	}
	
	public void lessRed(int x) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				double y = x;
				double r = pixels[i][j].getRed();
				pixels[i][j].setRed((int)(r*(y/100)));
			}
		}
	}
	public void lessGreen(int x) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				double y = x;
				double g = pixels[i][j].getGreen();
				pixels[i][j].setGreen((int)(g*(y/100)));
			}
		}
	}
	public void lessBlue(int x) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				double y = x;
				double b = pixels[i][j].getBlue();
				pixels[i][j].setBlue((int)(b*(y/100)));
			}
		}
	}
	public void lessAll(int x) {
		this.lessRed(x);
		this.lessGreen(x);
		this.lessBlue(x);
	}
	public void grey() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int b = (pixels[i][j].getRed() + pixels[i][j].getGreen() + pixels[i][j].getBlue())/3;
				pixels[i][j].changeColors(b,b,b);
			}
		}
	}
	public void black() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				double b = (pixels[i][j].getRed() + pixels[i][j].getGreen() + pixels[i][j].getBlue())/3;
				double d = this.d;
				if(b>((d*3)/2)) {
					pixels[i][j].changeColors(this.d,this.d,this.d);
				}
				if(b<((d*3)/2)) {
					pixels[i][j].changeColors(0,0,0);
				}
				
			}
		}
	}
	
	
}
