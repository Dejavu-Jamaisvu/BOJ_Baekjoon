
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        input += '\n';//\n은 Scanner.nextLine()을 통해 입력받을 때 실제로 들어오지 않아 문자열끝 체크

        for (int i = 0; i < input.length(); i++) {

            StringBuilder target = new StringBuilder();
            char ch = input.charAt(i);

            if(ch =='<'){
                System.out.print(ch);
                do {
                    ch = input.charAt(++i);
                    System.out.print(ch);
                } while (ch != '>');

            }else{
                while (ch != ' ' && ch != '\n' ) {
                        target.append(ch);
                        ch = input.charAt(++i);
                        if(ch == '<') {
                            --i; //while 도중에 '<' 만나면 < 다음 문자가 for문에서 읽혀서 < 탐지 불가
                            break;
                        }
                }

                System.out.print(target.reverse());
                if (ch == ' ' || ch == '\n' )
                    System.out.print(ch);// 공백 줄바꿈 일때만 출력 해야함. < 일 때 출력됨 하지 않게 하기 위함
            }

        }

    }
}
