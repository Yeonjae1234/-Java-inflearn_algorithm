package CH1_String.Q01;
import java.util.*;
public class Main {

    public int solution(String str, char x){
        int result=0;
        str = str.toUpperCase();
        char[] strArray = str.toCharArray();
        if(x>=97){
            x=(char)((int)x-32);
        }
        // t=Character.toUpperCase(t);
        for(char i:strArray){
            if(i==x){
                result++;
            }
        }
        // str.charAt(i)
        return result;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char x = sc.next().charAt(0);
        System.out.print(M.solution(str,x));
    }
}
