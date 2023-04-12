import java.util.*;
public class Main {
     static class minStack {
     private int[] aarr;
    int sssxx;

    public minStack(){
        aarr = new int[5];
        sssxx = -1;
        }

        public int sssxx(){
            return sssxx + 1;
        }

        public boolean isfull(){
            return sssxx==aarr.length - 1;
        }

        public boolean isempty(){
            return sssxx==-1;
        }

        public void push(int n){
            if(isfull()){
            int[] a = new int[2 * aarr.length];
             for(int i = 0; i < aarr.length; i++){
                   a[i] = aarr[i];
            }
            aarr = a;
            }
            sssxx++;
            aarr[sssxx] = n;
        }

        public int pop(){
            sssxx--;
            return aarr[sssxx+1];
        }

        public int peek(){
            return aarr[sssxx];
        }

        public int min(){
            int tt = aarr[0];
            for(int i = 1; i <= sssxx; i++){
                if(aarr[i] < tt){
                    tt = aarr[i];
                }
            }
            return tt;
        }
    }
    public static void main (String args[]) throws Exception{
Scanner nc=new Scanner(System.in);
int n=nc.nextInt();
minStack ss = new minStack();
String[] aarr=new String[n];
for(int i=0;i<aarr.length;i++){
    aarr[i]=nc.next();
}
for(int i = 0; i <aarr.length; i++){
        if(aarr[i].equals("push")){
             int tp = nc.nextInt();
             ss.push(tp);
    }else if(aarr[i].equals("pop")){
                ss.pop();
    }else if(aarr[i].equals("top")){
                System.out.print(ss.peek()+" ");
     }else{
         System.out.print(ss.min()+" ");
                // s.pop();
            }
        }
    }
}