Mapped Strings

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner rubix_scan = new Scanner(System.in);
        String n = rubix_scan.next();
        print(n, "");
    }

    public static void print(String s, String sna) {
        if (s.length() == 0) {
            System.out.println(sna);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(0, i + 1);
            char c = (char) ((Integer.parseInt(ch)) + 64);
            if (c > 90) {
                return;
            }
            print(s.substring(i + 1), sna + c);
        }
    }
}
