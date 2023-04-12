import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner nc=new Scanner(System.in);
        int ttr=nc.nextInt();

        while(ttr>0){
     
	 
	        int nn=nc.nextInt();
     
	        int k=nc.nextInt();
    
	        int[]aaarr=new int[nn];
     
	        for(int i=0;i<aaarr.length;i++){
     
	            aaarr[i]=nc.nextInt();
     
	        }
     
	        ff(aaarr,nn,k);
     
	        System.out.println();
            ttr--;
        }
    }
public static void ff(int aaarr[],int n,int k){
  
    LinkedList<Integer> ll = new LinkedList<>();
  
    for (int i=0;i<k;i++){
        if (aaarr[i]<0){
  
            ll.add(i);
        }
  
    }
    for (int i=k;i<n;i++){
  
        if (!ll.isEmpty()){
            System.out.print(aaarr[ll.peek()]+" ");
   
        }
        else{
  
            System.out.print("0"+" ");
   
        }
   
        while ((!ll.isEmpty())&&ll.peek()<(i-k+1)){
   
            ll.remove(); 
        }
   
   
        if (aaarr[i]<0){
            ll.add(i);
	
		}
   
    	}
  
    if (!ll.isEmpty()){
        System.out.print(aaarr[ll.peek()]+" ");

	}
  
    else{
        System.out.print("0"+" ");
	}  
}
}