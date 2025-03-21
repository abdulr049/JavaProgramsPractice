package javaPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add("Abdul Rahaman");
		hashSet.add("Abdul Rahaman");
		hashSet.add("Ahan Khan");
		hashSet.add("Rihana Parveeen");

		int size = hashSet.size();
		System.out.println(size);
		
		Iterator it = hashSet.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println(hashSet);

		hashSet.remove("Ahan Khan");

		System.out.println(hashSet);

		hashSet.add("Ahan Khan");

		System.out.println(hashSet);

		ArrayList<Object> arraylist = new ArrayList<Object>(hashSet);
		System.out.println(arraylist.get(2));

	}

}
