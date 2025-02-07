import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 자리개수
        int m = sc.nextInt(); // 종료되는 받은 횟수
        int l = sc.nextInt(); // 좌우 몇번째 옆사람에게 줄 것인가

        int[] arr = new int[n];
        int index = 0;
        int count = -1;


        while(true){

            if(count==-1){
                arr[index]++;//맨처음엔 첫번째에 앉은 사람이 공을 받음
                count++;// 0이 되며 첫번째 사람이 받은건 count 수에 포함되지 않음
            } else if(arr[index]%2==0){//짝수면
                //n-l 반시계방향 왼쪽으로 가는 횟수와 시계방향으로 증가하는 인덱스와 관계식
                index += n-l;
                index %= n; //배열 인덱스가 n을 넘지 않도록함
                arr[index]++;
                count++;
            }else{//홀수면
                index += l;
                index %= n;
                arr[index]++;
                count++;
            }

            //System.out.println(count+": arr["+index+"] = "+arr[index]);

            if(arr[index]==m){
                break;
            }

        }

        System.out.println(count);

    }
}