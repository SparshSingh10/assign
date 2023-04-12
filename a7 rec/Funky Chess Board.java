import java.util.*;
public class Main {
public static void main(String[] args) {

	Scanner nc=new Scanner(System.in);


	int n=nc.nextInt();

	int[][] arr=new int[n][n];


	for(int i=0;i<arr.length;i++){

		for(int j=0;j<arr[0].length;j++){								


			arr[i][j]=nc.nextInt();
 
        }
    }
	int aa = ff(arr,n,0,0);




	System.out.println(aa);
 }
public static int ff(int[][] bt,int n,int r,int cl){

	if(r<0 || r>=n || cl<0 || cl>=n || bt[r][cl]==-1 || bt[r][cl]==0){

		int tt=0;		

		for(int i=0;i<bt.length;i++){

			for(int j=0;j<bt[0].length;j++){

				if(bt[i][j]==1){

					tt++;
				}

			}

		}		
		return tt;

	}

	int[] kn = new int[8];

	bt[r][cl]=-1;
	kn[0] = ff(bt, n , r-2, cl+1);

	kn[1] = ff(bt, n , r-2, cl-1);


	kn[2] = ff(bt, n , r-1, cl+2);

	kn[3] = ff(bt, n , r+1, cl+2);


	kn[4] = ff(bt, n , r+2, cl+1);
	kn[5] = ff(bt, n , r+2, cl-1);

	kn[6] = ff(bt, n , r-1, cl-2);

	kn[7] = ff(bt, n , r+1, cl-2);

	bt[r][cl]=1;

	int mn=Integer.MAX_VALUE;

	for(int i=0;i<kn.length;i++){

		if(kn[i]<mn)

			mn=kn[i];
	}
	return mn;
}
}