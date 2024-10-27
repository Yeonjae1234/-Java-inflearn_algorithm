package CH1_String.Q03;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String[] strArr = str.split(" ");
        String result="";
        for(String i:strArr){
            if(result.length()<i.length()){
                result=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(M.solution(str));
    }
}
