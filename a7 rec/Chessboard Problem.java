import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("\n"+ pc(n, 0, 0, "{0-0}"));
    }
    public static int pc(int n, int r, int c, String ss11){
        if(n == 0){
            System.out.print("{0-0}");
            return 1;
        }
        if(r == n-1 && c == n-1){
            System.out.print(ss11 + " ");
            return 1;
        }
        if(r >= n || c >= n){
            return 0;

        }

        int x = np(n, r, c, ss11);

        int y = bp(n, r, c, ss11);

        int z = sp(n, r, c, ss11);

        return x + y + z;

    }
    public static int sp(int n, int r,int c,String ss11){

        ss11 = ss11+ "B";

		int pppp = 0;

		if(r == c ||(r+c == n-1)) 
        {

			for(int i=1; i<n; i++)

				pppp+=pc(n, r+i, c+i, ss11+String.format("{%d-%d}",r+i,c+i));
		}

		return pppp;

    }
    public static int bp(int n , int r, int c, String ss11){

        ss11 = ss11 + "R";

		int pppp=0;

		if(r==0 || r==n-1 || c==0 || c==n-1)
         {
			for(int i=1; i<n; i++)

				pppp += pc(n,r,c+i,ss11+String.format("{%d-%d}", r, c+i));
			for(int i=1;i<n;i++)

				pppp += pc(n,r+i,c,ss11+String.format("{%d-%d}", r+i, c));
		}
		return pppp;
    }
    public static int np(int n,int r, int c, String ss11){
        ss11 = ss11 + "K" ;

        int b = pc(n, r+2, c+1, ss11+String.format("{%d-%d}",r+2,c+1));

        int a = pc(n, r+1, c+2, ss11+String.format("{%d-%d}",r+1,c+2));
        
        return a + b;
    }
}