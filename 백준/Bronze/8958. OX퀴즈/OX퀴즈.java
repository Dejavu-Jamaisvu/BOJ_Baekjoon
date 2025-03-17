
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); //가지고 있는 변의 길이가 1인 정사각형 개수

        for(int i=0;i<num;i++){
            String testCase = br.readLine();
            System.out.println(score(testCase));
        }

    }
    public static int score(String testCase){
        int sum=0;
        int n=0;
        for(int i=0;i<testCase.length();i++) {
            if (testCase.charAt(i) == 'O')
                sum += ++n;
            else n = 0;//0으로 초기화
        }
        return sum;
    }
}