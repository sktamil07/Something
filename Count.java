
public class Count {
		    public static void main(String[] args) {
	        String name = "sekar@@gmail..com";
	        int count = 0;
	        char [] ch = name.toCharArray();
	        for (int i = 0;i<ch.length;i++){
	            if(ch[i]>=97 == ch[i]<=122){
	                count++;
	            }
	        }
	        System.out.println("number of punctuation characters: " + count);
	    }
	}

