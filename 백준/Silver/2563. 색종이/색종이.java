import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//색종이가 몇개인가
        int[][] background = new int[100][100];
        int area=0;
        for(int i=0 ; i<n ; i++) { 
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = 0 ; j<10 ; j++){
                for(int k = 0 ; k<10 ; k++){
                    background[x+j][y+k]++;
                    if(background[x+j][y+k]==1)
                        area++;
                }
            }
        }
            System.out.println(area);
    }
}