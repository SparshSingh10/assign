import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc2 = new Scanner(System.in);
        int x = sc2.nextInt();
    int y = sc2.nextInt();
    int[][] aaarr = new int[x][y];
      System.out.print("\n"+ pp(aaarr, 0, 0, ""));
    }

    public static int pp(int[][] aaarr, int m, int n, String aannss) {
      if (m == aaarr.length - 1 && n == aaarr[0].length - 1) {
            System.out.print(aannss + " ");
        return 1;
       }
        if (m > aaarr.length - 1 || n > aaarr[0].length - 1) {
        return 0;
      }
       int a = pp(aaarr, m + 1, n, aannss + "V");
      int b = pp(aaarr, m, n + 1, aannss + "H");
      return a+b;
    }
}