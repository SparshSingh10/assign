Hoodies At Coding Blocks

import java.util.*;

public class Main {

	protected int size;

	protected int front;
	protected int[] data;

	public Main() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Main(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void operation(Main queue_one,Main queue_two,Main queue_three,Main queue_four,Main order_hoodie,int n) throws Exception{ 
	boolean one=false;
	boolean second=false;
	boolean third=false;
	boolean fourth=false;
	for(int i = 0; i < n; i++){
		char ch = rubix_scan.next().charAt(0);
		if(ch=='E'){
			int x = rubix_scan.nextInt();
			int y = rubix_scan.nextInt();
			if(x==1){
				queue_one.enqueue(y);
				if(!one){
					order_hoodie.enqueue(x);
					one=true;
				}
			}
			else if(x==3){
				queue_three.enqueue(y);
				if(!third){
					order_hoodie.enqueue(x);
					third=true;
				}
			}
			else if(x==2){
				queue_two.enqueue(y);
				if(!second){
					order_hoodie.enqueue(x);
					second=true;
				}
			}
			else{
				queue_four.enqueue(y);
				if(!fourth){
					order_hoodie.enqueue(x);
					fourth=true;
				}
			}
		}
		else{
			int front_element=order_hoodie.getFront();
			if(front_element==1){
				if(queue_one.size()!=0){
					System.out.println("1"+" "+queue_one.getFront());
					queue_one.dequeue();
				}
				if(queue_one.size==0){
					order_hoodie.dequeue();
					one=false;
				}
			}
			else if(front_element==2){
				if(queue_two.size()!=0){
					System.out.println("2"+" "+queue_two.getFront());
					queue_two.dequeue();
				}
				if(queue_two.size==0){
					order_hoodie.dequeue();
					second=false;
				}
			}
			else if(front_element==3){
				if(queue_three.size()!=0){
					System.out.println("3"+" "+queue_three.getFront());
					queue_three.dequeue();
				}
				if(queue_three.size==0){
					order_hoodie.dequeue();
					third=false;
				}
			}
			else{
				if(queue_four.size()!=0){
					System.out.println("4"+" "+queue_four.getFront());
					queue_four.dequeue();
				}
				if(queue_four.size==0){
					order_hoodie.dequeue();
					fourth=false;
				}
			}
		}
	}	
} 
	static Scanner rubix_scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Main order_hoodie = new Main();
		Main queue_one = new Main();
		Main queue_two = new Main();
		Main queue_three = new Main();
		Main queue_four = new Main();
        int n = rubix_scan.nextInt();
        operation(queue_one,queue_two,queue_three,queue_four,order_hoodie,n);
	}
}