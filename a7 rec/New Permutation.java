import java.util.*;
public class Main {
    public static void main (String args[]) {

	Scanner ncc=new Scanner(System.in);
	String ssrr=ncc.next();

	String ass="";

	List<String> lt=new ArrayList<>();


		pp(ssrr,"",lt);

	for(int i=lt.size()-1;i>=0;i--){

		System.out.print(lt.get(i)+" ");

	}

}
public static void pp(String ssrr,String ass,List<String> lt){

		if(ssrr.length()==0){
	
	
			lt.add(ass);
			return;
		}
	
			if(ssrr.charAt(0)>=97&&ssrr.charAt(0)<=122){	

			pp(ssrr.substring(1), ass+(char)(ssrr.charAt(0)-32),lt);
	

			}
			else if(ssrr.charAt(0) >= 65 && ssrr.charAt(0) <= 90)
			{
	
			pp(ssrr.substring(1), ass+(char)(ssrr.charAt(0)+32),lt);
			}

		pp(ssrr.substring(1),ass+ssrr.charAt(0),lt);
			
		
	}
}