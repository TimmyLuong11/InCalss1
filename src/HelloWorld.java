import java.util.GregorianCalendar;

public class HelloWorld 
{
	private static final int big = 5;
	public static int main()
	{
		return 7;
	}
	public static void main(String[] args)
	{
		//HelloWorld hw = new HelloWorld();
		//System.out.println(HelloWorld.main());
		//hw.main();

		Point[] points =  new Point[2];
		//int x;
		//System.out.println(x);
		points[0] = new Point();
		for(int index = 0; index < big; ++index)
		{
			/*
			boolean correct = true;
			if(correct)
			{
				System.out.println("What just happened");
			}
			*/
			int testIndex = index;
			float pi = 3.14_7f;
			System.out.println(++testIndex + " " + testIndex++);
			System.out.println(big);
			Point point;// = new Point(1,2);
			System.out.println(points[0]);
		}
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
	
		Point p1 = new Point(2,2);
		Point p2 = new Point(3,3);
	}
}
