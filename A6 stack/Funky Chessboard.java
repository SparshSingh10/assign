Funky Chessboard

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]mat = new int [n][n];
		int c = 0;
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				mat[i][j] = sc.nextInt();
				if(mat[i][j] == 1){
					c++;
				}
			}
		}

		boolean[][] visited = new boolean[n][n];
		funky(mat, 0,0,0,visited);
		System.out.println(c - total);
    }
	static int total = 0;
	public static void funky(int[][]mat, int cr, int cc, int count, boolean [][] visited){
		if(cr >= mat.length || cc >= mat[0].length || cr < 0 || cc < 0 || visited[cr][cc] || mat[cr][cc]==0){
			total = Math.max(total,count);
			return;
		}

		visited[cr][cc] = true;
		funky(mat, cr+1, cc+2, count+1, visited);
		funky(mat, cr+1, cc-2, count+1, visited);
		funky(mat, cr-1, cc+2, count+1, visited);
		funky(mat, cr-1, cc-2, count+1, visited);
		funky(mat, cr+2, cc+1, count+1, visited);
		funky(mat, cr+2, cc-1, count+1, visited);
		funky(mat, cr-2, cc+1, count+1, visited);
		funky(mat, cr-2, cc-1, count+1, visited);
		visited[cr][cc] = false;
	}

}