
public class RemoveStringinDigit {
	static String RemoveDigit(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				result=result+str.charAt(i);
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		String str="tamil30sk";
		System.out.println(RemoveDigit(str));
	}

}
