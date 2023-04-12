Recycling

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        int input = rubix_scan.nextInt();
        int[] rra = new int[input];
        for(int l = 0; l < rra.length; l++){
            rra[l] = rubix_scan.nextInt();
        }
        System.out.print(LargestRectangle(rra));
    }

    public static int LargestRectangle(int[] rra) {
        int sna = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < rra.length; i++) {
            while (!st.isEmpty() && rra[st.peek()] > rra[i]) {
                int x = st.pop();
                if (st.isEmpty()) {
                    sna = Math.max(sna, rra[x] * i);
                } else {
                    sna = Math.max(sna, rra[x] * (i - st.peek() - 1));
                }
            }
            st.push(i);
        }
        int i = rra.length;
        while (!st.isEmpty()) {
            int x = st.pop();
            if (st.isEmpty()) {
                sna = Math.max(sna, rra[x] * i);
            } else {
                sna = Math.max(sna, rra[x] * (i - st.peek() - 1));
            }
        }
        return sna;
    }
}