package arraylist;

import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hi");
		al1.add("How are you");
		al1.add("Good Morning");
		al1.add("bye");
		al1.add("Good night");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Howdy");
		al2.add("bye");
		al2.add("Good night");
		al2.add("Good Evening");
		

		ArrayList<String> al3 = new ArrayList<String>();
		for (String temp : al1) {
			al3.add(al2.contains(temp) ? "Yes" : "No");
		}
		System.out.println(al3);
		
	}

}
