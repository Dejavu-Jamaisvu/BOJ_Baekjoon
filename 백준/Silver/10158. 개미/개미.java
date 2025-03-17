
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int w = Integer.parseInt(input[0]); //공간크기
        int h = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int p = Integer.parseInt(input[0]); //초기 위치
        int q = Integer.parseInt(input[1]);

        int t = Integer.parseInt(br.readLine()); //몇번 움직이는가

        int x;
        int y;

        if(t<(w-p))
            x=p+t;
        else if(((t-(w-p))/w)%2==0)
            x=w-(t-(w-p))%w;
        else
            x=(t-(w-p))%w;

        if(t<(h-q))
            y=q+t;
        else if(((t-(h-q))/h)%2==0)
            y=h-(t-(h-q))%h;
        else
            y=(t-(h-q))%h;

        System.out.println(x + " " + y);
    }
}