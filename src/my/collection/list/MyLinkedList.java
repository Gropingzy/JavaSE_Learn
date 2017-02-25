package my.collection.list;

public class MyLinkedList implements MyList {
	
	private Node head;
	
	private int size = 0;
	
	public void add(Object obj) {
		Node addEle = new Node(obj);
		if(head == null){
			head = addEle;
		}else{
			Node curEle = head;
			while(curEle.next != null){
				curEle = curEle.next;
			}
			curEle.next = addEle;
		}
		size++;
	}

	public void add(int index, Object obj) {
		Node addEle = new Node(obj);
		Node curEle = head;
		if(index == 0){
			head = addEle;
		}else{
			for(int i=0; i<index-1; i++){
				curEle = curEle.next;
			}
			addEle.next = curEle.next;
			addEle = curEle.next;
		}
		size++;
	}

	public Object get(int index) {
		if(index == 0){
			return head.data;
		}else{
			Node getEle = head;
			String tmpEleStr = "";
			for(int i=0; i<index; i++){
				tmpEleStr = getEle.data.toString();
				getEle = getEle.next;
			}
			return tmpEleStr;
		}
	}

	public Object remove(int index) {
		if(index == 0){
			head.next = null;
			return head;
		}else{
			Node curEle = head;
			for(int i=0; i<index-1; i++){
				curEle = curEle.next;
			}
			curEle.next = curEle.next.next;
		}
		size--;
		return null;
	}

	public int size() {
		return size;
	}
	
	public void addFirst(Object obj){
		Node addEle = new Node(obj);
		this.head = addEle;
		this.head.next = head;
		size++;
	}
	
	public void addLast(Object obj){
		Node addEle = new Node(obj);
		Node curEle = head;
		while(curEle.next != null){
			curEle = curEle.next;
		}
		curEle.next = addEle;
		size++;
	}
	
	public Object removeFirst(){
		head.next = null;
		size--;
		return head;
	}
	
	public Object removeLast(){
		Node curNode = head;
		for(int i=0; i<size-1-1; i++){
			curNode = curNode.next;
		}
		Object tmpLast = curNode.next;
		curNode.next = null;
		size--;
		return tmpLast;
	}
	
	/*public MyIterator iterator(){
		return null;
	}*/

	private static class Node{
		Object data;
		Node next;
		
		private Node(){
		}
		
		private Node(Object obj){
			this.data = obj;
			this.next = null;
		}
	}
	
	/*private class LinkedListIterator implements MyIterator{
		Node curNode = new Node();
		
		public boolean hasNext() {
			if(curNode.next != null){
				return true;
			}else{
				return false;
			}
		}

		public Object next() {
			if(curNode.next != null){
				return curNode.next;
			}else{
				return null;
			}
		}
	}*/
}
