package my.collection.list;

public class MyArrayListTest {

	public static void main(String[] args) {
		Test();
	}
	
	//@Test
	public static void Test(){
		MyArrayList list = new MyArrayList(5);
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println("abcd get(3):" + list.get(3));
		System.out.println("abcd size:" + list.size());
		
		list.remove(2);
		System.out.println("abd:");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("");
		System.out.println("abd size:" + list.size());
		
		list.add(2, "e");
		
		System.out.println("abed:");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("");
		list.add("f");
		list.add("g");
		
		System.out.println("abedfg:");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("");
		list.add(2, "h");
		list.remove(0);
		System.out.println("bhedfg:");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("");
		
		System.out.println("bhedfg get(3):" + list.get(3));
		
	}

}
