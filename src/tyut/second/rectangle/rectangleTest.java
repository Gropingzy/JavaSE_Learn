package tyut.second.rectangle;

public class rectangleTest {
	public static void main(String args[]){
		Point p1 = new Point(2,4);
		Point p2 = new Point(8,12);
		Rectangle rec = new Rectangle(p1,p2);
		//System.out.println("面积是：" + rec.getArea());
		//System.out.println("周长是：" + rec.getLength());
		//System.out.println("对角线长：" + rec.getCrossLength());
		System.out.println("面积是：" + rec.getArea(p1,p2));
		System.out.println("周长是：" + rec.getLength(p1,p2));
		System.out.println("对角线长：" + rec.getCrossLength(p1,p2));

		Point p3 = new Point(6,6);
		Point p4 = new Point(11,1);

		System.out.println("p3(6,6) in Rectangle(p1(2,4),p2(8,12)) is ：" + String.valueOf(rec.ifInRectangle(p3)));
		System.out.println("p4(11,1) in Rectangle(p1(2,4),p2(8,12)) is ：" + String.valueOf(rec.ifInRectangle(p4)));
		
	}
}
