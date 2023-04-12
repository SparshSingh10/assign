import java.util.*;
public class Main {
    public static void main(String[] args) {
   
        Scanner sc1 = new Scanner(System.in);
   
        String str = sc1.next();
        ArrayList<String> ll = new ArrayList<>();
   

     
        po(str, "", str, ll);
       
        Collections.sort(ll);


        for(int l=0; l < ll.size(); l++){
    

            System.out.println(ll.get(l));
     
        }
	}
	

	public static void po(String aa, String sna, String xxxx, ArrayList<String>ll) {
	
    	if (aa.length() == 0) {
			if(sna.compareTo(xxxx) < 0){
     

                ll.add(sna);
     
            }
	
    		return;
	
    	}

	for (int i = 0; i < aa.length(); i++) {
		
        	char ch = aa.charAt(i);
		
        	String ro = aa.substring( 0, i)+aa.substring(i + 1);
          
            po(ro, sna + ch, xxxx, ll);
		}

	}
}