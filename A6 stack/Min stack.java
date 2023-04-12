Min stack


import java.util.*;
public class Main {
	static Scanner rubix_scan = new Scanner(System.in);
    public static void main (String args[]) {
        int input = rubix_scan.nextInt();
        String[] rra = new String[input];
        for(int l = 0; l < rra.length; l++){
            rra[l] = rubix_scan.next();
        }
		operation(rra);
    }
	public static void operation(String[] rra){
		Stack<Integer> st = new Stack<>();
		for(int l = 0; l < rra.length; l++){
			if(rra[l].equals("push")){
				st.push(rubix_scan.nextInt());
			}
			else if (rra[l].equals("pop")){
				st.pop();
			}
			else if (rra[l].equals("getMin")){
				System.out.print(getMin(st, Integer.MAX_VALUE) + " ");
			}
			else if (rra[l].equals("top")){
				System.out.print(st.peek() + " ");
			}
		}
	}

	public static int getMin(Stack<Integer> st, int min){
        if(st.isEmpty()){
            return min;
        }
        int x = st.pop();
        int y = getMin(st, Math.min(min, x));
        st.push(x);
        return y;
	}
}