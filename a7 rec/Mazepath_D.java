import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc2 = new Scanner(System.in);
    int xx = sc2.nextInt();
        int yy = sc2.nextInt();
      int[][] aarr = new int[xx][yy];
        System.out.print("\n"+ pp(aarr, 0, 0, ""));
    }
  public static int pp(int[][] aarr, int mm, int n, String aass) {
    if (mm == aarr.length - 1 && n == aarr[0].length - 1) {
            System.out.print(aass + " ");
           return 1;
        }
      if (mm > aarr.length - 1 || n > aarr[0].length - 1) {
        return 0;
        }
        int a = pp(aarr, mm + 1, n, aass + "V");
      int b = pp(aarr, mm, n + 1, aass + "H");
    int c = pp(aarr, mm+1, n+1, aass + "D");
        return a+b+c;
    }
}