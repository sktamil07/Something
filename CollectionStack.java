package Demo;
import java.util.Stack;
public class CollectionStack {

	public static void main(String[] args) {
		        Stack<String> stack = new Stack<>();
		        stack.push("Java");
		        stack.push("Python");
		        stack.push("C++");
		        System.out.println("Stack: " + stack);
		        String poppedElement = stack.pop();
		        System.out.println("Popped Element: " + poppedElement);
		        System.out.println("Stack after pop: " + stack);
		        String topElement = stack.peek();
		        System.out.println("Top Element: " + topElement);
		        System.out.println("Is Stack empty? " + stack.isEmpty());
		        System.out.println("Size of Stack: " + stack.size());
		    }
		


	}


