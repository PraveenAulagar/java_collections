package in.pa.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {
	
	public static void main(String[] args) {
		
		LinkedList<String> colors= new LinkedList<String>();
		
		colors.add("black");
		colors.add("blue");
		colors.add("red");
		colors.add("green");
		colors.add("pink");
		colors.add("voilet");
		colors.add("maroon");
		colors.add("yellow");
		colors.add("brown");
		colors.add("navy blue");
		
		System.out.println("after adding colors to linked list"+"\n"+colors);
		System.out.println("================================================================================================");
		
		//will add the color the given index position
		colors.add(4, "silver");
		System.out.println("after adding color at index no. 4"+"\n"+colors);
		System.out.println("================================================================================================");
		
		//addFirst() will add color at the first position
		colors.addFirst("white");
		System.out.println("after adding white color at first position"+"\n"+colors);
		System.out.println("================================================================================================");
		
		//addLast() will add color at the last position
		colors.addLast("beige");
		System.out.println("after adding beige color at last position"+"\n"+colors);
		System.out.println("================================================================================================");
		
		//get() will return the color at given index
		System.out.println("the color present at index no. 6 is"+"\n"+colors.get(6));
		System.out.println("================================================================================================");
		
		//contains() returns true if color is present else false
		System.out.println("the given color is present"+"\n"+colors.contains("cyan"));
		System.out.println("================================================================================================");
		
		//listIterator will iterator the colors 
		System.out.println("iterating linkedList in forward order");
		ListIterator<String> lt=colors.listIterator();
		//while color is present it will enter inside the loop
		while(lt.hasNext())
		{
			//next() will print the colors in forward direction(first color to last color)
			System.out.print(lt.next()+",");
		}
		System.out.println("\n"+"================================================================================================");
		
		//listIteraor(3) will print color starting from the given index to last color
		System.out.println("iterating linkedList in forward order from the given index no. to the end");
		ListIterator<String> lisItr=colors.listIterator(3);
		
		while(lisItr.hasNext())
		{
			System.out.print(lisItr.next()+",");
		}
		System.out.println("\n"+"================================================================================================");
		
		//hasPrevious() will check and previous() will iterator the colors present in reverse direction(last color to first color)
		System.out.println("iterating linkedList in reverse order");
		ListIterator<String> listItr=colors.listIterator();
		//while their will be element present in reverse it will enter the loop
		while(lisItr.hasPrevious())
		{
			//previous() will print the colors in reverse direction
			System.out.print(lisItr.previous()+",");
		}
		System.out.println("\n"+"================================================================================================");
		
		//listIterator(5) will iterate in reverse order from the given index of the color in the below case from index no.5
		System.out.println("iterating the linkedList upto given index in reverse order starting from last element");
		ListIterator<String> listItor=colors.listIterator(5);
		while(listItor.hasPrevious())
		{
			System.out.print(listItor.previous()+",");
		}
		System.out.println("\n"+"================================================================================================");
		
		//using size() we get no. of elements in the linkedList
		System.out.println("no. of elements present in the linkedList"+"\n"+colors.size());
		System.out.println("================================================================================================");
		
		//new linked list
		LinkedList<String> colors2=new LinkedList<String>();
		
		colors2.add("gold");
		colors2.add("bronze");
		
		//add all() adds one list into another
		colors.addAll(colors2);
		
		System.out.println("after adding another list"+"\n"+colors);
		System.out.println("================================================================================================");
		
		//iterating the linkedList using for loop
		System.out.println("iterating using for loop");
		for(int i=0;i<colors.size();i++)
		{
			System.out.print(colors.get(i)+",");
		}
		System.out.println("\n"+"================================================================================================");
		
		//iterating linkedList using for each loop
		System.out.println("iterating using for each loop");
		for(String color:colors)
		{
			System.out.print(color+",");
		}
		System.out.println("\n"+"================================================================================================");
		
		//will give sublist of the given linkedList form index no. to mentioned index no. in this case(from 3 to 9)
		System.out.println("sublist of the given list using index numbers"+"\n"+colors.subList(3, 9));
		System.out.println("================================================================================================");
		
		//removeFirst() will delete the first element
		colors.removeFirst();
		System.out.print("after deleting the first element"+"\n"+colors);
		System.out.println("\n"+"================================================================================================");
		
		//removeLast() will delete the last element
		colors.removeLast();
		System.out.print("after deleting the last element"+"\n"+colors);
		System.out.println("\n"+"================================================================================================");
		
		//remove() will delete the color at the given index
		colors.remove(4);
		System.out.println("after deleting color at index no. 4"+"\n"+colors);
		System.out.println("================================================================================================");
		
		
	}

}
