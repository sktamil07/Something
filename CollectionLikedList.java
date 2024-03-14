package Demo;

import java.util.LinkedList;

public class CollectionLikedList {

	public static void main(String[] args) {
		LinkedList <String> a=new LinkedList<String>();

		a.add("Tamil");
		a.add("English");
		a.add("Maths");
		a.add("Science");
		a.add("Social science");
		System.out.println("\t"+a);

		a.addFirst("PTE");
		System.out.println("\t"+a);

		a.addLast("PTE");
		System.out.println("\t"+a);

		a.removeFirst();
		System.out.println("\t"+a);

		a.removeLast();
		System.out.println("\t"+a);

		
		System.out.println(a.getFirst());

		System.out.println(		a.getLast());


		


	}

}
