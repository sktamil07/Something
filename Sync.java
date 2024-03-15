package Demo;
import java.io.*; 
import java.util.*; 
public class Sync {
		public static void main(String[] args) 
		{ 
			List<String> list = new ArrayList<String>(); 
			list.add("Eat"); 
			list.add("Coffee"); 
			list.add("Code"); 
			list.add("Sleep"); 
			list.add("Repeat"); 
			list = Collections.synchronizedList(list); 
			synchronized (list) 
			{ 
				Iterator<String> it = list.iterator(); 
				while (it.hasNext()) { 
					System.out.println(it.next()); 
				} 
			} 
		} 
	}



