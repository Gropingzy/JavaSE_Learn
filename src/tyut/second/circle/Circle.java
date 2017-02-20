package tyut.second.circle;

public class Circle {
	private Point o;
	private double radius;
	
	public Circle(Point o, double r){
		this.o = new Point(o.getX(),o.getY());
		//this.o = new Point(x,y);
		this.radius = r;
	}
	
	public double getC(){
		return Math.PI * 2 * radius;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	public boolean isInner(Point p){
		//<= 改成 <		(在圆内不在圆上)
		if((p.getX() - o.getX()) * (p.getX() - o.getX())
				+ (p.getY() - o.getY()) * (p.getY() - o.getY()) < radius * radius){
			return true;
		}else{
			return false;
		}
	}
}	
