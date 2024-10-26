package CH1_String.Q02;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        char[] strArray = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(strArray[i]>=97){
                strArray[i]-=32;
            }
            else{
                strArray[i]+=32;
            }
        }
        // answer+=Character.isLowerCase(x)
        String result;
        result=new String(strArray);
        return result;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(M.solution(str));
    }
}
