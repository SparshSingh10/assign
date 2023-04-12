Kartik Bhaiya And The Kartik Bhaiya And The Celebrity Problem

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        int input = rubix_scan.nextInt();
        int[][] rra = new int[input][input];
        Stack<Integer> st = new Stack<>();
        for(int m = 0; m < rra.length; m++){
            st.push(m);
            for(int n = 0 ; n < rra.length; n++){
                rra[m][n]= rubix_scan.nextInt();
            }
        }
        int ans = Celebrity(rra, st);
        if (ans == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println(ans);
        }
    }

    public static int Celebrity(int[][] rra, Stack<Integer> st) {
        while(st.size() >= 2){
            int first=st.pop();
            int second=st.pop();
            if(rra[first][second]==1){
                st.push(second);
            }
            else{
                st.push(first);
            }
        }
        int ans = st.pop();
        for(int i=0;i<rra.length;i++){
            if(i!=ans){
                if(rra[ans][i]==1 || rra[i][ans]==0){
                    return -1;
                }
            }
        }
		return ans;
	}
}