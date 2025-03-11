
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        HashSet<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10 ; i++) {
            int input = Integer.parseInt(br.readLine());//throws IOException 예외처리 필요
            set.add(input % 42);

        }

        System.out.println(set.size());
    }
}