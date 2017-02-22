package zy.collection.list;

import java.util.Arrays;

public class ArrayList {
	//实际容量指针
	private int size = 0;
	//容量常量
	private int CAPACITY = 10;
	//list本身
	private Object[] elementData = new Object[CAPACITY];
	//constructor
	public ArrayList(int len){
		this.elementData = new Object[len];
	}
	
	public void add(Object obj){
		if(size < elementData.length){
			elementData[size ++] = obj;
		}else{
			int oldSize = elementData.length;
			this.elementData = grow(CAPACITY);
			this.elementData[oldSize ++] = obj;
		}
	}
	
	public void add(int index, Object obj){
		if(index < 0){
			System.out.println("插入位置不合法");
		}else{
			//长度未超
			if(index + 1 < elementData.length){
				Object[] newElementData = new Object[CAPACITY];
				for(int i=0; i<index; i++){
					newElementData[i] = elementData[i];
				}
				newElementData[index] = obj;
				for(int i=index + 1; i<elementData.length+1; i++){
					newElementData[i] = elementData[i-1];
				}
				this.elementData = newElementData;
			//长度已超，先扩容，再插入	
			}else{
				Object[] newElementData = Arrays.copyOf(elementData, elementData.length + CAPACITY);
				newElementData[index] = obj;
				System.arraycopy(elementData, index, newElementData, index, elementData.length - index);
			}
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
