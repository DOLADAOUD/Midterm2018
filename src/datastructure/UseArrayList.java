package datastructure;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Integer> l = new ArrayList<Integer>();
		l.add(14);
		l.add(350);
		l.add(10);
		l.add(85);
		l.add(7);


		for (Integer i : l) {
			System.out.println("This is the ArrayList value " + " " + i);
		}
		System.out.println("This is for using while loop ");
		Iterator it = l.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());


		}

	}
}