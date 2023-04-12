import java.util.*;
public class Main {
    public static void main (String args[]) {
Scanner nc=new Scanner(System.in);
int m=nc.nextInt();
    System.out.println(ass(m));
    }
    public static int ass(int m){
    
           if(m==1){
   
               return 0;
           }
   
              if(m==2){
  
  
            return 1;
        }
  
           int[]aaa=new int[m+1];
  
    aaa[0]=0;
 
 
        aaa[1]=0;
  
        aaa[2]=1;
  
    for(int i=3;i<aaa.length;i++)
    {
  
    aaa[i]=(i-1)*(aaa[i-1]+aaa[i-2]);
}
return aaa[m];
    
    }
}