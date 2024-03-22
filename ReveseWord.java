
public class ReveseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String name = "java program";
	        String [] words = name.split(" ");
	        String rev = "";
	        for (int i = 0;i<words.length;i++){
	            String wordssss = words[i];
	            String revWord = "";
	            for (int j = wordssss.length()-1;j>=0;j--){
	                revWord = revWord + wordssss.charAt(j);
	            }
	            rev = rev + revWord+ " ";
	        }
	        System.out.println(rev);
	    }
	}