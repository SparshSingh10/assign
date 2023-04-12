Smart Keypad - I


import java.util.*;
public class Main {
    static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void main(String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        String input = rubix_scan.next();
        keypadCombinations(input, "");
    }
    
    public static void keypadCombinations(String input, String ans){
        if(input.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = input.charAt(0);
        String ar = table[ch - '0'];
        for(int i = 0; i < ar.length(); i++){
            keypadCombinations(input.substring(1), ans + ar.charAt(i));
        }
    }
}