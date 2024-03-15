package Demo;

import java.util.Iterator;
import java.util.Vector;

public class CollectionTreeset {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>(5);
		v.add("Tamil");
		v.add("English");
		v.add("Maths");
		v.add("Science");
		v.add("Social Science");
		Iterator<String> r= v.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}	
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add("PET");
		System.out.println(v.size());
		System.out.println(v.capacity());
	}

}
