import java.util.*;

public class Main {

    protected int sszz;

    protected int frnt;

    protected int[] ddd;

    public Main() {

        this.sszz = 0;

        this.frnt = 0;

        this.ddd = new int[5];

    }

    public Main(int ccpp) {

        this.sszz = 0;
    
        this.frnt = 0;

        this.ddd = new int[ccpp];

    }

    public int sszz() {

        return sszz;

    }

    public boolean isEmpty() {
        return (sszz == 0);
    }

    public void enqueue(int item) throws Exception {


    
        if (this.sszz() == this.ddd.length) {

            int[] oa = this.ddd;
            int[] na = new int[oa.length * 2];
            for (int i = 0; i < this.sszz(); i++) {

                int idxx = (i + frnt) % oa.length;

                na[i] = oa[idxx];
            }

            this.ddd = na;
            this.frnt = 0;
        }

        this.ddd[(frnt + sszz) % this.ddd.length] = item;
        sszz++;

    }


    public int dequeue() throws Exception {
        if (this.sszz == 0) {

            throw new Exception("queue is empty");

        }

        int rv = this.ddd[frnt];
        frnt = (frnt + 1) % this.ddd.length;

        sszz--;

        return rv;

    }

    public int getFront() throws Exception {

        if (this.sszz == 0) {

            throw new Exception("queue is empty");
        }

        int rv = this.ddd[frnt];

        return rv;
    }

    public void display() {

        System.out.println();

        for (int i = 0; i < sszz; i++) {
            int idxx = (i + frnt) % this.ddd.length;
            System.out.print(this.ddd[idxx] + " ");

        }
        System.out.print("END");
    }

    
  
    public static void hh(Main qq11,Main qqq22,Main q444,Main qq44,Main odd,int n) throws Exception{ 

    boolean one=false;


    boolean second=false;
    boolean third=false;    boolean fr=false;

    for(int i=0;i<n;i++)
    {

    char ch=sc.next().charAt(0);
        if(ch=='E')

        {
            int x=sc.nextInt();
        int y=sc.nextInt();

            if(x==1)
    
        {
                qq11.enqueue(y);
    
            if(!one)
                {

            
                odd.enqueue(x);

                    one=true;
                }
            }
            else if(x==2)
    

        {
                qqq22.enqueue(y);
                if(!second)
    
                {
                odd.enqueue(x);
                second=true;
                }
    
        }
            else if(x==3)
    
        {
    
            q444.enqueue(y);
                if(!third)

                {
                    odd.enqueue(x);
    
                third=true;
                }
        }

            else
    
        {
                qq44.enqueue(y);
    
            if(!fr)
                {
                    odd.enqueue(x);
    
                fr=true;
    
                }
            }
    }
    
    else
        {
    
            int fe=odd.getFront();
    
        if(fe==1)
            {
                if(qq11.sszz()!=0)
    
                {
                System.out.println("1"+" "+qq11.getFront());
                    qq11.dequeue();
                }
    

                if(qq11.sszz==0)
                {
    
                    odd.dequeue();
                one=false;
                }
    
            }
        else if(fe==2)
    

            {
        if(qqq22.sszz()!=0)
            {
                    System.out.println("2"+" "+qqq22.getFront());
                    qqq22.dequeue();
    
                }
    
                if(qqq22.sszz==0)
    
                {
                    odd.dequeue();
    
                second=false;
    
    
                }
            }

            else if(fe==3)
    
            {
    
            if(q444.sszz()!=0)
        
            {
    
                    System.out.println("3"+" "+q444.getFront());
                    q444.dequeue();
    

                }
    
                if(q444.sszz==0)
    
     
                {
                    odd.dequeue();
     

                    third=false;
                }
    
        }
        
            else{
        
            if(qq44.sszz()!=0)
        
            {
    
                    System.out.println("4"+" "+qq44.getFront());

                qq44.dequeue();
                }
            if(qq44.sszz==0)
            {
                odd.dequeue();
            fr=false;
            }
        }
        }
    

    }   
} 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    Main qq11 = new Main();
    Main qqq22 = new Main();
        Main q444 = new Main();     Main qq44 = new Main();
        Main odd = new Main();
      int n = sc.nextInt();
        hh(qq11,qqq22,q444,qq44,odd,n);
    }

}

