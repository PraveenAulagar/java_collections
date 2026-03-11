package in.pa.list;

import java.util.ArrayList;
import java.util.ListIterator;


public class Array_List {
	
	public static void main(String[] args) {
		
		//we can use either list or arraylist
		//List<String> fruits= new ArrayList<String>();
		ArrayList<String> fruits= new ArrayList<String>();
		
		// we use add method to add elements in array list
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("gauva");
		fruits.add("watermelon");
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("chickoo");
		fruits.add("cherry");
		fruits.add("muskmelon");
		fruits.add("kiwi");
		
		System.out.println(fruits);
		
		//size() method gives size of the arrayList
		System.out.println("\n"+fruits.size());
		
		//get() returns the value at the given index number;
		System.out.println("\n"+fruits.get(5));
		
		//we can add the elments in the arrayList using index number
		fruits.add(3, "mango");
		System.out.println("\n"+fruits);
		
		//remove() deletes the element from the arrayList at given index number
		fruits.remove(4);
		System.out.println("\n"+fruits);
		
		//contains method return true if the element is present false if not present
		System.out.println("\n"+fruits.contains("mango")+"\n");
		
		// we can iterate elements of the arrayList using for loop
		System.out.println("iterating using for loop");
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		System.out.println("====================================================");
		//iterating arrayList using for each loop
		System.out.println("iterating using for each loop");
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("====================================================");
		System.out.println("iterating using ListIterator()");
		// iterating using listIterator
		ListIterator<String> iterator=fruits.listIterator();
		//this will iterator while their is next element
		while(iterator.hasNext())
		{
			// next() will print the element
			System.out.println(iterator.next());
		}
	}

}
