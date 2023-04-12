Search Word in Monu Bhaiya's Board

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        int m = rubix_scan.nextInt();
        int n = rubix_scan.nextInt();
        int k = rubix_scan.nextInt();
        char[][] rra = new char[m][n];
        for(int i=0;i<m;i++)
        {
            String temporary1 = rubix_scan.next();
            for(int j=0;j<n;j++)
            {
                rra[i][j]=temporary1.charAt(j);
            }
        }
        List<String>list = new ArrayList<>();
        for(int l=0;l<k;l++)
        {
            String temporary2 = rubix_scan.next();
            list.add(temporary2);
        }
        List<String>sna = new ArrayList<>();
        for(int tt = 0; tt < list.size(); tt++){
            if(acurr_colept(rra,list.get(tt))){
                sna.add(list.get(tt));
            }
        }
        Collections.sort(sna);
        for(int y = 0; y < sna.size(); y++){
            System.out.print(sna.get(y)+" ");
        }
    }
    public static boolean acurr_colept(char [][]rra, String drow)
    {
        for(int i = 0; i < rra.length; i++){
            for(int j = 0; j < rra[0].length; j++){
                if(rra[i][j] == drow.charAt(0)){
                    boolean ans=check(rra, drow, i, j, 0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean check(char [][]rra , String drow, int curr_row,int curr_col,int arrayIndex){
        if(arrayIndex==drow.length()){
            return true;
        }
        if(curr_row<0 || curr_col<0 || curr_row>= rra.length || curr_col >= rra[0].length || rra[curr_row][curr_col] != drow.charAt(arrayIndex)){
            return false;
        }
        int [] r  = {-1, 0, 1, 0};
        int [] c  = {0, 1, 0, -1};
        rra[curr_row][curr_col] = '*';
        for(int i=0; i < r.length ; i++){
            boolean ans=check( rra ,drow,curr_row+r[i],curr_col+c[i],arrayIndex+1);
            if(ans){
                rra[curr_row][curr_col] = drow.charAt(arrayIndex);
                return true;
            }
        }
        rra[curr_row][curr_col] = drow.charAt(arrayIndex);
        return false;
    }
    
}