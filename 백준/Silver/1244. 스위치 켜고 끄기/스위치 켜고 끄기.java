import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열개수

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int studentNum = sc.nextInt(); // 학생 명수
        for(int i = 0; i < studentNum; i++){
            int gender = sc.nextInt();
            int number = sc.nextInt(); //기준 숫자 (남자면 배수, 여자면 대칭 중앙 인덱스(1부터 시작))

            if(gender==1){//남자면
                for(int j = number - 1 ; j <= n - 1 ; j = j + number){ // 숫자는 1번째부터 시작(배열은 0부터 시작)
                    //arr[i] = (arr[i] == 0) ? 1 : 0;
                    arr[j] ^= 1;
                }

            }else {//여자면 = 숫자2
                number--; // 숫자는 1번째부터 시작(배열은 0부터 시작)
                arr[number] ^= 1;

                int leftIndex = number - 1;
                int rightIndex = number + 1;

                while ( leftIndex >= 0 && rightIndex <= n - 1 && arr[leftIndex] == arr[rightIndex]) {
                    arr[leftIndex] ^= 1;
                    arr[rightIndex] ^= 1;
                    leftIndex--;
                    rightIndex++;
                }

            }

//            System.out.println();
//            for(int elem : arr)
//                System.out.print(elem + " ");
//            //버퍼 문제인지 중간에 엔터 쳐줘야 출력 제대로 됨. 확인 필요,
        }

//        System.out.println();//보기 좋게
        int numCount = 1;
        for(int elem : arr){
            System.out.print(elem);
            if(numCount % 20 == 0){
                System.out.println();
            } else {
                System.out.print(" ");
            }
            numCount++;
        }
    }
}