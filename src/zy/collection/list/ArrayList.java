package zy.collection.list;

import java.util.Arrays;

public class ArrayList {

	private int size = 0;
	private int CAPACITY = 10;
	private Object[] elementData = new Object[CAPACITY];

	public ArrayList(int len){
		this.elementData = new Object[len];
	}
	
	public void add(Object obj){
		if(size < elementData.length){
			elementData[size] = obj;
		}else{
			int oldSize = elementData.length;
			this.elementData = grow(CAPACITY);
			this.elementData[oldSize] = obj;
		}
		size++;
		
	}
	
	public void add(int index, Object obj){
		if(index < 0){
			System.out.println("插入位置不合法");
		}else{
			if(index + 1 < elementData.length){
				System.arraycopy(elementData, 0, this.elementData, 0, index-1);
				System.arraycopy(elementData, index, this.elementData, index+1, elementData.length-index-1);
				elementData[index] = obj;
			}else{
				Object[] newElementData = Arrays.copyOf(elementData, elementData.length + CAPACITY);
				newElementData[index] = obj;
				System.arraycopy(elementData, index, newElementData, index+1, elementData.length - index);
				this.elementData = newElementData;
			}
			size++;
		}
	}
	
	public Object get(int index){
		if(index < 0 || index > elementData.length){
			return "下标越界";
		}else{
			return elementData[index];
		}
	} 
	
	public Object remove(int index){
		System.arraycopy(elementData, 0, this.elementData, 0, index-1);
		System.arraycopy(elementData, index + 1, this.elementData, index, elementData.length-index-1);
		size--;
		return this.elementData;
	}
	
	public int size(){
		return size;
	}
	
	private Object[] grow(int stepLen){
		Object[] largerElement = new Object[CAPACITY + stepLen];
		System.arraycopy(elementData, 0, largerElement, 0, elementData.length);
		return largerElement;
	}

}
