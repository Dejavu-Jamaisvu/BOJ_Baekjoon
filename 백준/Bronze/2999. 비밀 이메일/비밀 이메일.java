
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();//throws IOException 예외처리 필요

        int N = input.length();//글자수
        int R = 0;//행
        int C = 0;//열

        for(int i=0 ; i < N ; i++){
            R = N-i; //R이 큰게 우선이니 R부터 정함
            C = N/R;
            // System.out.println(R+" "+C);
            if(R<=C && R*C==N)
                break;
        }

        char[][] arr = new char[R][C];

        int index = 0; //
        for(int j=0; j<C ; j++) {
            for(int i=0; i<R ; i++){
                arr[i][j] = input.charAt(index++);
            }
        }

        for (char[] row : arr) {
            System.out.print(String.valueOf(row));
        }
    }
}