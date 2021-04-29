
public class Point 
{
	private int x; 
	private int y;
	private static int counter;
	
	public int getX() {
		return x;
	}
/*	public void setX(int x) {
		this.x = x;
	}*/
	public int getY() {
		return y;
	}
/*	public void setY(int y) {
		this.y = y;
	}*/
	public Point()
	{
		x = -99999999;
		y = -99999999;	
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		++counter;
		System.out.println("Counter is " + counter);
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
