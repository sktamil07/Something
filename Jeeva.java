
public class Jeeva {
	String name;
	int age;
	public Jeeva(String name,int age) {
		this.name=name;
		this.age=age;
	}


public static void main(String[]args) {
	Jeeva h=new Jeeva("tamil", 66);
	Jeeva j=new Jeeva("karthic",  77);
	System.out.println(h);
	System.out.println(j);
	
}
}