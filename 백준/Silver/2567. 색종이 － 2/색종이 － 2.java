import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//색종이가 몇개인가
        int[][] background = new int[100][100];
        int length=0;
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = 0 ; j<10 ; j++){
                for(int k = 0 ; k<10 ; k++){
                    if(background[x+j][y+k]==0)
                        background[x+j][y+k]++;
                }
            }
        }

        for(int a=0 ; a<100 ; a++){
            for(int b=0 ; b<100 ; b++){
                // 세로 끝줄 탐구
                if(a==0) {//인덱스 넘지 않기 위해 if와 else if 사용
                    if (background[a][b] != 0)//0부터 색종이가 있어서 도화지끝에 선이 있을 때
                        length++;
                }else if( a==99 ){
                    if (background[a-1][b] + background[a][b] == 1)//98과 99사이 선이 있을 때
                        length++;
                    else if(background[a][b] != 0)//99까지 차서 맨끝까지 색종이 면일 때
                        length++;
                }
                else if(background[a-1][b] + background[a][b] == 1)// 그외 중간에 색종이가 있다 없어져서 선이 있는 부분일 때
                    length++;

                // 가로 끝줄 탐구
                if( b==0 ) {
                    if (background[a][b] != 0)
                        length++;

                }else if( b==99 ){
                    if (background[a][b-1] + background[a][b] == 1)
                        length++;
                    else if(background[a][b] != 0)
                        length++;

                }else if(background[a][b-1] + background[a][b] == 1)
                    length++;
            }
        }
        System.out.println(length);
    }
}