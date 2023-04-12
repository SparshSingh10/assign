First negative integer in every window of size k

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner rubix_scan = new Scanner(System.in);
		int test = rubix_scan.nextInt();
		while(test > 0){
			int input = rubix_scan.nextInt();
			int k = rubix_scan.nextInt();
			int[] rra = new int[input];
			for(int l = 0; l < rra.length; l++){
				rra[l] = rubix_scan.nextInt();
			}
			printFirstNegative(rra, input, k);
			test--;
		}
    }
	public static void printFirstNegative(int rra[], int n, int k){
		boolean t;
		for (int i = 0; i<(n-k+1); i++){
			t = false;
			for (int j = 0; j < k; j++){
				if (rra[i+j] < 0){
					System.out.print((rra[i+j])+" ");
					t = true;
					break;
				}
			}
			if (!t){
				System.out.print("0"+" ");
			}
		}
		System.out.println();
	}
}