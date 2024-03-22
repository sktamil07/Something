
public class RomantToNumber {

	public static int roman(String s) {
		int num=0;
		int sum=0;
		for(int i=s.length()-1;i>=0;i--) {
			switch(s.charAt(i)) {
			case 'I': num=1;break;
			case 'V':num=5;break;
			case 'X':num=10;break;
			
			}
			if(4*num<0) {
				sum=sum-num;
			}else {
				sum=sum+num;

			}

		}
		return sum;
		
		
	}
	
     public static void main (String args[]) {
    	 String t="III";
    	 System.out.println(roman(t));
	}

}
