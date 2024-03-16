
public class Testing {
	    public static void main(String[] args) {
	    	  String str = "GeeksForGeeks";
	 	     int temp=0;
	 	     int index=0;
	 	     char ch[]=str.toCharArray();
	 	     if(str.length()>2) 
	 	    	 temp=ch[0];
	 	    	 ch[0]=ch[index-1];
	 	    	 ch[index-1]=(char)temp;
	 	    	 index++;
	 	    	System.out.println((str));
	 	     }
	        }
	    
	    	


