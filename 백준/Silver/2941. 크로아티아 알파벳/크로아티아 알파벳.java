
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayList<Character> list = new ArrayList<Character>();

        int num=0;
        for (int i = 0; i < input.length();) {
            char ch = input.charAt(i); //문자하나
            char ch2='0';
            char ch3='0';
            if(i+1<input.length()) { //문자열 초과 방지 //StringIndexOutOfBoundsException
                ch2 = input.charAt(i + 1);
            }
            if(i+2<input.length())
                ch3 = input.charAt(i+2);

            if(ch=='c' && ch2=='=' || ch=='c' && ch2=='-'
                    ||ch=='d' && ch2=='-'
                    ||ch=='l' && ch2=='j' || ch=='n' && ch2=='j'
                    ||ch=='s' && ch2=='=' || ch=='z' && ch2=='=' ){

                i+=2;

            }else if(ch=='d' && ch2=='z' && ch3=='=' ){

                i+=3;

            }else{

                i++;

            }
            num++;


        }
        System.out.println(num);
    }
}