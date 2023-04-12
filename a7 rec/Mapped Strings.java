import java.util.*;
public class Main {
  static String[] aarr={"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    public static void main(String args[]) {
 
        // Your Code Here
        Scanner nncc=new Scanner(System.in);
  
   
        String srr=nncc.next();
   
  
        ccdde(srr,"");
    }
 
    public static void ccdde(String qqees,String ans){
  
        if(qqees.length()==0){
   
    
	        System.out.println(ans);
    
	        return;
        }

char ch=qqees.charAt(0);

	String s=aarr[ch-'0'];

		ccdde(qqees.substring(1),ans+s);

		if(qqees.length()>=2){
  
  	 String s1=qqees.substring(0,2);
  
    	int n=Integer.parseInt(s1);
  
   	 if(n<=27){


  
    ccdde(qqees.substring(2),ans+aarr[n]);
   
    }
}
    }
}