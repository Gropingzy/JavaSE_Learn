package my.collection.list;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.add("a");
		mll.add("b");
		mll.add("c");
		mll.add(1, "o");
		mll.remove(2);
		mll.addFirst("x");
		//mll.addLast("y");
		//mll.removeFirst();
		mll.removeLast();
		
		System.out.println(mll.size());
		for(int i=0; i<mll.size(); i++){
			System.out.print(mll.get(i) + "\t");
		}

	}

}
