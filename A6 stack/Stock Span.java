Stock Span

import java.util.*;
public class Main {

	public static void Span_Stack_function(int[] rra) {
        int[] sna = new int[rra.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < rra.length; i++) {
            while (!st.isEmpty() && rra[i] >= rra[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                sna[i] = i + 1;
            } else {
                sna[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < sna.length; i++) {
            System.out.print(sna[i] + " ");
        }
		System.out.print("END");
    }

	public static void main(String args[])  {
		Scanner rubix_scan = new Scanner(System.in);
		int ele = rubix_scan.nextInt();
		int[] rra = new int[ele];
		for(int i = 0; i<rra.length; i++){
			rra[i] = rubix_scan.nextInt();
		}
		Span_Stack_function(rra);
	}

}

