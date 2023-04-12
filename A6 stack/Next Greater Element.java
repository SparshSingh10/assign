Next Greater Element

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner rubix_scan = new Scanner(System.in);
		int t = rubix_scan.nextInt();
		while (t > 0) {
			int n = rubix_scan.nextInt();
			int[] rra = new int[n];
			for (int i = 0; i < rra.length; i++){
				rra[i] = rubix_scan.nextInt();
			}
			nextLargerElement(rra);
			t--;
		}

	}
	public static void nextLargerElement(int[] rra) {
		int[] sna = new int[rra.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < sna.length; i++) {
            while (!st.isEmpty() && rra[i] > rra[st.peek()]) {
                sna[st.pop()] = rra[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            sna[st.pop()] = -1;
        }
        for (int i = 0; i < sna.length; i++) {
            System.out.println(rra[i] + "," + sna[i]);
        }
	}
}
