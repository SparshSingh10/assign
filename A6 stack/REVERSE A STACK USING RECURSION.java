REVERSE A STACK USING RECURSION


import java.util.*;
public class Main {

	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner rubix_scan = new Scanner(System.in);
		int N= rubix_scan.nextInt();
		Main mainobj = new Main();
		StacksUsingArrays obj = mainobj.new StacksUsingArrays(N);
		// StacksUsingArrays helper=mainobj.new StacksUsingArrays(N);
		for(int i=1;i<=N;i++){
			obj.push(rubix_scan.nextInt());
		}
		reverseStack(obj);
		obj.display();
	}

	public static void reverseStack(StacksUsingArrays s) throws Exception{
		if(s.isEmpty()){
			return;
		}
		int item = s.pop();
		reverseStack(s);
		InsertElementDown(s, item);
	}

	public static void InsertElementDown(StacksUsingArrays ts, int element) throws Exception{
		if(ts.isEmpty()){
			ts.push(element);
			return;
		}
		int item = ts.pop();
		InsertElementDown(ts, element);
		ts.push(item);
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

		public void reverseStack(StacksUsingArrays stack, StacksUsingArrays helper, int idx) throws Exception {
			
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
