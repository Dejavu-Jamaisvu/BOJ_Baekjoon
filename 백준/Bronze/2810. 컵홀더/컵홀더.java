
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//문자열 개수
        ArrayList<Character> list = new ArrayList<Character>();

        sc.nextLine();
        String input = sc.nextLine();

        for (int i = 0; i < input.length();) {
            char ch = input.charAt(i); //문자하나
            
            if(ch=='S'){
                //마지막인덱스를 확인해야하기에 비어있지 않음을 먼저 체크 해야함!
                if(!list.isEmpty() && list.get(list.size() - 1)=='*') { //비어있지 않고 마지막이 *이면 //getLast()를 사용해도 되지만 백준 컴파일에러 뜸.
                    list.add('S');
                    list.add('*');
                }else{ //비어있거나 마지막이 *이 아니면
                    list.add('*');
                    list.add('S');
                }
                i++;

            }else{
                if(!list.isEmpty() && list.get(list.size() - 1)=='*') {
                    list.add('L');
                    list.add('L');
                    list.add('*');
                }else{
                    list.add('*');
                    list.add('L');
                    list.add('L');
                    list.add('*');
                }
                i += 2;
            }
        }

        //System.out.println(list.toString());

        int num=0;
        for(char c : list)
            if(c=='*')
                num++;

        System.out.println(num);
    }
}