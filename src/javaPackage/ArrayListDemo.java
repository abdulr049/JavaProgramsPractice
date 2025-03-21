package javaPackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> arrList=new ArrayList<Object>();
		
		arrList.add("Abdul Rahaman");
		arrList.add(1);
		arrList.add("Ahan Khan");
		arrList.add(2);
		arrList.add("Abdul Rahaman");
		System.out.println(arrList);
		
		arrList.remove(2);
		
		System.out.println("Arraylist after removing: "+arrList);
		
		arrList.add("Rihana Parveen");
		System.out.println(arrList);
		
		
		System.out.println(arrList.get(3));
		

	}

}
