import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc2 = new Scanner(System.in);
        String aa = sc2.next();
        tr(aa, 0);
    }
    public static void tr(String aa, int ff) {
   
        if(aa.length()==2) {
      
            System.out.println(ff);
     
            return;
        }
    
        char ch1=aa.charAt(0);
   
        char ch2=aa.charAt(2);
    
        if(ch1==ch2) {
    
            ff++;
   
        }
    
        tr(aa.substring(1),ff);
    
    }
}