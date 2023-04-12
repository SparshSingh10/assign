The Queue Game

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        int test = rubix_scan.nextInt();
        while(test > 0){
            int len = rubix_scan.nextInt();
            int[] rra = new int[len];
            for(int i = 0; i<rra.length; i++){
                rra[i] = rubix_scan.nextInt();
            }
            CheckOperations(rra);
            test--;
        }
    }

    public static void CheckOperations(int[] rra){
        int push = 0;
        for(int i = 0; i<rra.length; i++){
            if(rra[i] == 1){
                push++;
            }
            else if(rra[i] == 0){
                if(push>0){
                    push--;
                }
                else{
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        System.out.println("Valid");
    }
}