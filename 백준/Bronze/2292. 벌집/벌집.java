import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 숫자

        // 중앙으로부터 떨어질 수 록 가장 큰 수
        // 1, 7, 19, 37, 61
        // 1+6*0, 1+6*(0+1), 1+6*(0+1+2), 1+6*(0+1+2+3), 1+6*(0+1+2+3+4)

        int number = 1; // 비교값. 1+6*0에서의 1을 초기에 넣어줌
        int count = 1; // 몇개의 방을 지나는가. 1에서 N번방 까지 세어야함. 입력값 n이 1일때 1출력 가능.
        for(int i = 1 ; n > number ; i++){ // 두번째 수부터 체크 // 입력값이 비교값보다 작을떄만 루프를 돎
            number += 6*i;
            count++;
            // System.out.println(count+":"+number);
        }
        System.out.println(count);

    }
}