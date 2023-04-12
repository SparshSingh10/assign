Girlfriends Derangements

import java.util.*;
public class Main{
    public static void main(String []args)
    {
        Scanner rubix_scan = new Scanner(System.in);
        int n = rubix_scan.nextInt();
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        for(int i = 0; i<n; i++){
            s = s + i;
        }
        operation_permutation(s, "", list);
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            String ques=list.get(i);
            if( check(ques) == true ){
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean check(String ques){
        for(int i=0;i<ques.length();i++){
            if(i==Character.getNumericValue(ques.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void operation_permutation(String s, String sna, ArrayList<String>list){
        if(s.length()==0){
            list.add(sna);
        }
        for(int i=0;i<s.length();i++){
            char xy = s.charAt(i);
            String str1 = s.substring(0,i);
            String str2 = s.substring(i+1);
            operation_permutation(str1+str2, sna + xy , list);
        }
    }
}