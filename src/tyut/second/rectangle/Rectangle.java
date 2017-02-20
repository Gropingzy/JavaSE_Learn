package tyut.second.rectangle;

public class Rectangle {
	
	//public Point p1 = new Point(x,y);
	//public Point p2 = new Point(x,y);		成员变量用的时候再初始化
	public Point p1;
	public Point p2;
	
	public Rectangle(Point p1,Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}

	public Rectangle(int x1,int y1, int x2, int y2){
		//this.p1.x1 = x1;
		//this.p1.y1 = y1;
		//this.p2.x2 = x2;
		//this.p2.y2 = y2;
		this.p1.x = x1;
		this.p1.y = y1;
		this.p2.x = x2;
		this.p2.y = y2;
	}

	public int getArea(Point p1,Point p2){
		return (p2.x - p1.x) * (p2.y - p1.y);
	}

	public int getLength(Point p1,Point p2){
		return ((p2.x - p1.x) + (p2.y - p1.y)) * 2;
	}

	public double getCrossLength(Point p1,Point p2){
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}

	public boolean ifInRectangle(Point p){
		boolean flag = false;
		//Rectangle rec = new Rectangle(p1,p2);			没用
		if((p.x > p1.x && p.x < p2.x) && (p.y > p1.y && p.y < p2.y)){
			flag = true;
		}
		return flag;
	}
}
