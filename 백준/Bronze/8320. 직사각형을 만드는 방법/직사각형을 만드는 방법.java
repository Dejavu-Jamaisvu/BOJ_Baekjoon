
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); //가지고 있는 변의 길이가 1인 정사각형 개수
        int count = 0;

        for(int i=1;i<=num;i++){
            count += divisor(i);
        }

        System.out.println(count);

    }
    public static int divisor(int rectangleNum){
        int n=0;
        for(int i=1;i*i<=rectangleNum;i++){
            if(rectangleNum%i==0)
                n++;
        }
        return n;
    }
}