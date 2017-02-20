package tyut.second.rectangle.book;

public class Point {
	double x,y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public static Point origin = new Point(0,0);
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	//通过get、set方法来获取对象属性
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
}
