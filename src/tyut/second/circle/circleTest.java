package tyut.second.circle;

public class circleTest {

	public static void main(String[] args) {
		Point o = new Point(3,5);
		double r = 3;
		Circle c = new Circle(o,r);
		
		System.out.println("周长是：" + c.getC());
		System.out.println("面积是：" + c.getArea());
		
		Point o1 = new Point(6,8);
		System.out.println("点(" + o.getX() + "," + o.getY() + ")在圆内：" +  c.isInner(o));
		System.out.println("点(" + o1.getX() + "," + o1.getY() + ")在圆内：" +  c.isInner(o1));

	}

}
