
public class Pixel {
	
	private int r;
	private int g;
	private int b;
	
	
	public Pixel(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void changeColors(int rc, int gc, int bc) {
		r = rc;
		g = gc;
		b = bc;
	}
	
	public int getRed() {
		return r;
	}
	public int getGreen() {
		return g;
	}
	public int getBlue() {
		return b;
	}
	public void setRed(int in) {
		r = in;
	}
	public void setGreen(int in) {
		g = in;
	}
	public void setBlue(int in) {
		b = in;
	}

	
	
	
	

}
