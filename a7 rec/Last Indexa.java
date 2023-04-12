import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s21 = new Scanner(System.in);
       
       
        int n = s21.nextInt();
       
        int[] aaa = new int[n];
        
        for(int l = 0; l<aaa.length; l++){
        
            aaa[l] = s21.nextInt();
        }
       
        int m = s21.nextInt();
      
        System.out.print(fo(aaa, m, aaa.length-1));
    }
    public static int fo(int[] aaa, int tt, int z){
      
        if(z<0 || aaa[z]==tt){
      
            return z;
      
        }
      
        return fo(aaa, tt, z-1);
    }
}