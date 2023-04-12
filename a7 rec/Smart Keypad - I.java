import java.util.*;
public class Main {
   static String[] kk = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
	public static void main(String[] args) {
		
        Scanner nncc=new Scanner(System.in);
               List<String> ll=new ArrayList<>();

 String ques=nncc.next();

                  ph(ques,"",ll);



	 }

public static void ph(String ques,String aannss,List<String> ll) {

 	if(ques.length()==0) {
 
         System.out.println(aannss+" ");
	 	ll.add(aannss);
 
		return;

	}

 	char cchh=ques.charAt(0);

	String prr=kk[cchh - '0'];
 
 	for(int i=0;i<prr.length();i++) {
		ph(ques.substring(1),aannss + prr.charAt(i),ll);
	 
	}
}
}