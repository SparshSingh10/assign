import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        int n=sc1.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc1.nextInt();
        }
        int iitt = sc1.nextInt();
        ttrr(arr,0,iitt,0,"");
        System.out.println();
        System.out.println(ttgg(arr,0,iitt,0,""));
    }
    public static void ttrr(int[]arr,int stt,int iitt,int m,String xxyyzz){
        if(stt==arr.length){
            if(iitt==0){
                m++;
                System.out.print(xxyyzz+" ");
            }
            return ;
        }
    ttrr(arr,stt+1,iitt-arr[stt],m,xxyyzz+arr[stt]+" ");
    ttrr(arr,stt+1,iitt,m,xxyyzz+"");
       
    }
    public static int ttgg(int[]arr,int stt,int iitt,int m,String xxyyzz){
        if(stt==arr.length){
            if(iitt==0){
                m++;
            }
            return m;
        }
       m=ttgg(arr,stt+1,iitt-arr[stt],m,xxyyzz+arr[stt]+" ");
       m=ttgg(arr,stt+1,iitt,m,xxyyzz+" ");
       return m;
    }
}