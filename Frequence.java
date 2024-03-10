
public class Frequence {
	
	    public static void main(String[] args) {
	        String name = "Sekar";
	        char [] ch = name.toCharArray();
	        for (int i = 0;i<ch.length;i++){
	            char c = ch[i];
	            if(Character.isUpperCase(c)){
	                ch[i] = Character.toLowerCase(c);
	            } else if(Character.isLowerCase(c)){
	                ch[i] = Character.toUpperCase(c);
	            }
	            System.out.print(ch[i] + " ");
	        }

	    }


	}

