Form minimum number from given Sequence


import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner rubix_scan = new Scanner(System.in);
		int input = rubix_scan.nextInt();
		String[] rra = new String[input];
		for(int l = 0; l < rra.length; l++){
			rra[l] = rubix_scan.next();
		}
		for(int l = 0; l < rra.length; l++){
			printSequence(rra[l]);
		}
    }
	public static void printSequence(String s){
		int[] arr = new int[s.length()+1];
        int count = 1;
        int j = 0;
        for(int i = 0; i<=s.length(); i++){
            if(i==s.length() || s.charAt(i)=='I'){
                arr[i] = count++;
                j = i-1;
                while(j>=0 && s.charAt(j)=='D'){
                    arr[j] = count++;
                    j--;
                }
            }
        }
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"");
		}
		System.out.println();
	}
}