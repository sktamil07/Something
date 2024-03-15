package Demo;
import java.util.LinkedHashSet;
public class CollectionLinkedHashSet {
	    public static void main(String[] args) {
	        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add("Apple");
	        linkedHashSet.add("Banana");
	        linkedHashSet.add("Orange");
	        System.out.println("LinkedHashSet: " + linkedHashSet);
	        linkedHashSet.add("Banana");
	        System.out.println("LinkedHashSet after adding duplicate element: " + linkedHashSet);
	        linkedHashSet.remove("Orange");
	        System.out.println("LinkedHashSet after removing element: " + linkedHashSet);
	        System.out.println("Does 'Apple' exist in the LinkedHashSet? " + linkedHashSet.contains("Apple"));
	        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
	        linkedHashSet.clear();
	        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
	  }
}

	
