
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //배달할 설탕의 양
        br.close();

        int count = findMin(n);


        System.out.println(count);
    }
    public static int findMin(int n){
        int count = -1;
        for(int five = n/5 ; five >= 0 ; five--) {
            int three = (n - 5 * five) / 3;
            if (5 * five + 3 * three==n)
                return five+three;
        }
        return count;
    }
}