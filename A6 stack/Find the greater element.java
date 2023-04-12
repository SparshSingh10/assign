Find the greater element

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner rubix_Scan = new Scanner(System.in);
        int test = rubix_Scan.nextInt();
        int[] rra = new int[test];
        for(int l = 0; l < test; l++){
            rra[l] = rubix_Scan.nextInt();
        }
        int[] ans = nextGreaterElementInCircularArray(rra);
        for(int l = 0; l < ans.length; l++){
            System.out.print(ans[l]+" ");
        }
    }
    public static int[] nextGreaterElementInCircularArray(int[] rra){
        int len = rra.length;
        int[] ans = new int[len];
        Arrays.fill(ans,-1);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < 2 * len; i++){
            int n = rra[i%len];
            while (!st.isEmpty() && rra[st.peek()] < n){
                ans[st.pop()] = n;
            }
            if(i < len){
                st.push(i);
            }
        }
        return ans;
    }
}
