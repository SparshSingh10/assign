import java.util.*;
public class Main {
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    String sa = sc1.next();
    ArrayList<String> ll=new ArrayList<>();
	po(sa,"",sa,ll);
    Collections.sort(ll);
    for(int i=0;i<ll.size();i++){
        System.out.println(ll.get(i));
    }
	}
	
	public static void po(String aaaaa, String ss1,String goo,ArrayList<String>ll) {
		if (aaaaa.length() == 0) {
			if(ss1.compareTo(goo)>0){
                ll.add(ss1);
            }
			return;
		}
		for (int i = 0; i < aaaaa.length(); i++) {
			char ch = aaaaa.charAt(i);
			String roooop=aaaaa.substring(0,i)+aaaaa.substring(i+1);
            po(roooop,ss1+ch,goo,ll);
		}

	}
}