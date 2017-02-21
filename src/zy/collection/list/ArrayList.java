package zy.collection.list;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[10];
	
	public void add(Object obj){
		
	}
	
	public void add(int index, Object obj){
		
	}
	
	public Object get(int index){
		if(index > -1){
			return elementData[index];
		}else{
			return null;
		}
	} 
	
	public Object remove(int index){
		return null;
	}
	
	public int size(){
		return size; 
	}
	
}
