
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        // Your Code Here
		Scanner rubix_scan = new Scanner(System.in);
		int input = rubix_scan.nextInt();
		Main s = new Main(input);
		for(int l = 0; l < input; l++){
			s.Enqueue(l);
		}
		while(!s.isEmpty()){
			System.out.print(s.Dequeue() + " ");
		}
    }

	protected int[] arr;
    protected int front;
    private int size;

    public Main() {
        arr = new int[5];
        front = 0;
        size = 0;
    }

    public Main(int n) {
        arr = new int[n];
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isfull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public void Enqueue(int item) throws Exception {
        if (isfull()) {
            throw new Exception("Queue is full");
        }
        int index = (front + size) % arr.length;
        arr[index] = item;
        size++;
    }

    public int Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int rv = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return rv;
    }
}
