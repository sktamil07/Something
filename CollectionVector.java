package Demo;
import java.util.Vector;

public class CollectionVector {
	    public static void main(String[] args) {
	        Vector<String> vector = new Vector<>();
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");
	        System.out.println("Vector: " + vector);
	        System.out.println("Element at index 1: " + vector.get(1));
	        vector.remove(2);
	        System.out.println("Vector after removing element at index 2: " + vector);
	        System.out.println("Does 'Banana' exist in the Vector? " + vector.contains("Banana"));
	        System.out.println("Size of Vector: " + vector.size());
	        System.out.print("Iterating over the Vector: ");
	        for (String fruit : vector) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();
	        vector.clear();
	        System.out.println("Vector after clearing: " + vector);
	    
	}

}

	