package Demo;



import java.util.ArrayList;

public class CollectionArray {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList <String>();

		a.add("Tamil");
		a.add("English");
		a.add("Maths");
		a.add("Science");
		a.add("Social science");
		a.add("PTE");
		System.out.println("\t"+a);
		System.out.println(a.get(4));
		System.out.println(a.contains("Maths"));
		a.remove(5);

		a.add("Biology");
		System.out.println("\t"+a);

		

	}

}
