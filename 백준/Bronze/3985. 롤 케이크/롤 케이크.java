
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int rollCakeLength = Integer.parseInt(br.readLine());
        int peopleNum = Integer.parseInt(br.readLine());

        int[] rollCakeArray = new int[rollCakeLength+1];//롤케이크 배열 //인덱스0 사용안하고 1부터 사용하기 위함
        Arrays.fill(rollCakeArray, -1);//초기값을 -1로 채워줌
        int[][] arr = new int[peopleNum][3]; //입력받아 넣을 2차원배열

        int expectation = inputCheck(arr, peopleNum, rollCakeArray);//사람번호가 아니라 인덱스로 옴
        int reality = findCheck(peopleNum, rollCakeArray);

        System.out.println(expectation+1);//인덱스를 사람번호로하려면 +1 필요
        System.out.println(reality+1);
    }
    public static int inputCheck(int[][] arr, int peopleNum, int[] rollCakeArray) throws IOException {
        String[] s;
        int maxIndex=0;

        for(int i=0 ; i<peopleNum ; i++){
            s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
            arr[i][2] = arr[i][1] - arr[i][0] + 1;

            if(arr[i][2]>arr[maxIndex][2]){
                maxIndex = i;
            }

            for(int index=arr[i][0] ; index<=arr[i][1] ; index++){
                if(rollCakeArray[index]==-1){ //누가 선점하고 있지 않으면
                    rollCakeArray[index]=i;
                }
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        //System.out.println(Arrays.toString(rollCakeArray));

        return maxIndex;
    }
    public static int findCheck(int peopleNum, int[] rollCakeArray){

        int[] arr = new int[peopleNum]; //사람별로 몇개씩 가지는지 구해서 기록할 배열
        for(int i=0 ; i<rollCakeArray.length ; i++){
            if(rollCakeArray[i]!=-1)
                arr[rollCakeArray[i]]++;//롤케이크에 적힌 숫자인덱스값을 올려줌
        }

        //System.out.println(Arrays.toString(arr));

        int maxIndex=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }

        return maxIndex;
    }
}