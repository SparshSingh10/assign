import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
      
        int n = s1.nextInt();
     
        int[] aa = new int[n];
       
        for(int l = 0; l<aa.length; l++){
       
            aa[l] = s1.nextInt();
     
        }
     
        int m = s1.nextInt();
      
        System.out.print(fo(aa, m, 0));
    }
    public static int fo(int[] aa, int tt, int z){
      
        if(z==aa.length){
      
            return -1;
     
        }
     
        if(aa[z]==tt){
      
            return z;
     
        }
     
        return fo(aa, tt, z+1);
    }
}