import java.util.*;
public class Main {
    public static void main(String args[]) {
     
        Scanner sc1 = new Scanner(System.in);
    
        int n = sc1.nextInt();
      
        hhi(n, "A", "C", "B");
    }

    public static void hhi(int n, String aarrr, String hhh, String dd) {
  
        if (n == 0) {
   
            return;
   
        }

     
        hhi(n - 1, aarrr, dd, hhh);
     
        System.out.println("Moving ring " + n + " from " + aarrr + " to " + dd);
     
        hhi(n - 1, hhh, aarrr, dd);
    }
}