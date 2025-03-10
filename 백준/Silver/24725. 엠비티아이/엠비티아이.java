import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//배열 행
        int m = sc.nextInt();//배열 열
        sc.nextLine();
        char[][] arr = new char[n][];


        for(int i=0;i<n;i++){
            String input = sc.nextLine();
            arr[i] = input.toCharArray();// char로 입력
        }

        //System.out.println(Arrays.deepToString(arr));

        //8가지 방향으로 가는 경우의 수
        int[] x = {0,1,1,1,0,-1,-1,-1};
        int[] y = {1,1,0,-1,-1,-1,0,1};

        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

//                System.out.println("i:"+i+" j:"+j);

                char c1 = arr[i][j];

                if( c1=='I' || c1=='E' ){

//                    System.out.println("외향내향찾음");

                    for(int index = 0; index<x.length ; index++){ //8가지 방향 경우의 수를 전부 확인하기 위한 인덱스
                        if(i+x[index]*3 >= 0 && j+y[index]*3 >= 0 && i+x[index]*3 < n && j+y[index]*3 < m) { //방향별로 4개 문자를 추출할 때 배열밖을 넘어가지 않는지 확인 //인덱스가 음수로 가지않게 0이상인지도 체크필요!
                            char c2 = arr[i + x[index]][j + y[index]];
                            char c3 = arr[i + x[index]*2][j + y[index]*2];
                            char c4 = arr[i + x[index]*3][j + y[index]*3];
                            if ((c2 == 'N' || c2 == 'S') && (c3 == 'T' || c3 == 'F') && (c4 == 'J' || c4 == 'P'))
                                count++;

//                            System.out.print(c1);
//                            System.out.print(c2);
//                            System.out.print(c3);
//                            System.out.print(c4);
//                            System.out.print(" - count: " + count);
//                            System.out.println();
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}