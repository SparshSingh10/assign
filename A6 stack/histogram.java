Histogram

import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner rubix_scan = new Scanner(System.in);
		
		int n = rubix_scan.nextInt();
		int[] rra = new int[n];
		
		for(int i = 0;i < n;i++)
		    rra[i] = rubix_scan.nextInt();
    		Main mainobj = new Main();
    		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    		System.out.println(largestRectangle(rra, stack));
		}
	

	public static long largestRectangle(int[] rra, StacksUsingArrays st) throws Exception {
		long sna = 0;
		for (int i = 0; i < rra.length; i++) {
            while (!st.isEmpty() && rra[st.top()] > rra[i]) {
                int x = st.pop();
                if (st.isEmpty()) {
                    sna = Math.max(sna, (long)rra[x] * (long)i);
                } else {
                    sna = Math.max(sna, (long)rra[x] * (long)((long)i - (long)st.top() - 1));
                }
            }
            st.push(i);
        }
        int i = rra.length;
        while (!st.isEmpty()) {
            int x = st.pop();
            if (st.isEmpty()) {
                sna = Math.max(sna, (long)rra[x] * (long)i);
            } else {
                sna = Math.max(sna, (long)rra[x] * (long)((long)i - (long)st.top() - 1));
            }
        }
        return sna;
	    
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

