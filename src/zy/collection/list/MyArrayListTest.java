package zy.collection.list;

public class ArrayListTest {

	public static void main(String[] args) {
		Test();
	}
	
	//@Test
	public static void Test(){
		ArrayList list = new ArrayList(5);
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//System.out.println("下标为3的元素为：" + list.get(3));
		//System.out.println("数组size：" + list.size());
		
		list.remove(2);
		//System.out.println("删除c之后的list：");
		//for(int i=0; i<list.size(); i++){
		//	System.out.print(list.get(i) + "\t");
		//}
		//System.out.println("");
		//System.out.println("remove后的数组size：" + list.size());
		
		list.add(2, "e");
		
		//System.out.println("插入e之后的list：");
		//for(int i=0; i<list.size(); i++){
		//	System.out.print(list.get(i) + "\t");
		//}
		//System.out.println("");
		list.add("f");
		list.add("g");
		
		//System.out.println("插入f、g之后的list：");
		//for(int i=0; i<list.size(); i++){
		//	System.out.print(list.get(i) + "\t");
		//}
		//System.out.println("");
		list.add(2, "h");
		list.remove(0);
		//System.out.println("插入h之后的list：");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + "\t");
		}
		//System.out.println("");
		
		//System.out.println("下标为3的元素为：" + list.get(3));
		
	}

}
