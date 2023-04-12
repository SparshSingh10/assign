import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        int nn = sc2.nextInt();

        cc(0, nn);

    }


    public static void cc(int curr, int nn) {
        if (curr > nn) {

            return;

        }

        System.out.print(curr+" ");
        int i = 0;

        if (curr == 0)
         {

            i = 1;
        }

        for (; i <= 9; i++)
         {
           
            cc(curr * 10 + i, nn);

        }
    }
}