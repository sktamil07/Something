package Demo;
import java.util.ArrayList; 
import java.util.Iterator; 
public class VectorObject {
			public static void main(String[] args) 
		{ 
			ArrayList<Integer> arr = new ArrayList<>(); 
			arr.add(1); 
			arr.add(2); 
			arr.add(3); 
			arr.add(4); 
			arr.add(5); 
			Iterator<Integer> it = arr.iterator(); 
			while (it.hasNext()) { 
				if (it.next() == 2) { 
					it.remove(); 
				} 
			} 
			System.out.println(arr); 
			it = arr.iterator(); 
			while (it.hasNext()) { 
				if (it.next() == 3) { 
					arr.remove(3); 
			} 
		} 
	} 
}


