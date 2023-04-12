import java.util.*;
public class Main {
    public static void main(String args[]) {
       
        Scanner s1 = new Scanner(System.in);
 
        int t = s1.nextInt();
 
        while(t > 0){
 
            String s = s1.next();
 
            bs(s, "", 0);
 
            System.out.println();
 
            t--;
 
        }
 
    }
 
    public static void bs(String s, String aa, int i) {
    
        if (i == s.length()) {
    
            System.out.print(aa + " ");
    
            return;
    
        }
     
        if (s.charAt(i) == '?') {
     
            bs(s, aa + '0', i + 1);
     
            bs(s, aa + '1', i + 1);
      

        } 
       
        else 
        {
           
            bs(s, aa + s.charAt(i), i + 1);
        }
    }
}