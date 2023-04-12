import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        int t = sc1.nextInt();
        while(t-- > 0){
           
            int n = sc1.nextInt();
           
         
            int[] aa = new int[n];
             for(int i = 0; i<aa.length; i++){
         
                aa[i] = sc1.nextInt();
         
         
            }
             System.out.println(ag(aa, 0, n-1));
        }
    }
    public static int ag(int[]aa, int ii, int ll){
      
        for(int ddd = ii; ddd < ll; ddd++){
       
            int s1 = 0;
             for(int i = ii; i<= ddd; i++){
         
                s1 += aa[i];
             }
         
            int s2 = 0;
         
            for(int i = ddd + 1; i <= ll; i++){
                 s2 += aa[i];
         
            }
            if(s1 == s2){
          
                int l = ag(aa, ii, ddd);
                 int r = ag(aa, ddd + 1, ll);
          
                return Math.max(l, r) + 1;
             }
      
        }
       return 0;
    }
}