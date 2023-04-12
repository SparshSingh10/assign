Playing with cards (In stack)

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner rubix_scan = new Scanner(System.in);
		int N = rubix_scan.nextInt();
		int Q = rubix_scan.nextInt();
		Stack<Integer> st = new Stack<>();
		while(st.size() < N){
			st.push(rubix_scan.nextInt());
		}
		PrintAftrQuery(N, Q, st);

    }

	public static void PrintAftrQuery(int N, int Q, Stack<Integer> st){
		ArrayList<Integer> l = PrimeSieve(Q);
		Stack<Integer> A = new Stack<>();
		A = st;
		for(int q = 1; q <= Q; q++){
			A = Operation(A, q, l);
		}
		while(!A.isEmpty()){
			System.out.println(A.pop());
		}
	}

	public static Stack<Integer> Operation(Stack<Integer> st, int q, ArrayList<Integer> l){
		Stack<Integer> A = new Stack<>();
		Stack<Integer> B = new Stack<>();
		while(!st.isEmpty()){
			int x = st.pop();
			int y = l.get(q-1);
			if( x % y == 0 ){
				B.push(x);
			}
			else{
				A.push(x);
			}
		}
		while(!B.isEmpty()){
			System.out.println(B.pop());
		}
		return A;
	}

	public static ArrayList<Integer> PrimeSieve(int n) {
		ArrayList<Integer> list = new ArrayList<>();
        int i = 2;
        while(n > 0){
            if(isPrime(i)){
                list.add(i);
                n--;
            }
            i++;    
        }
		return list;
    }

	public static boolean isPrime(int n) {
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }


}
