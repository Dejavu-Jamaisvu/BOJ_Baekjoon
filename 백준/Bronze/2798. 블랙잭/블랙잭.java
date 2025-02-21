import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//배열 개수
        int num = sc.nextInt();//세 수의 합이 가까워야하는 수

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));

       int max = find(n, num, arr);

        sc.close();
        System.out.println(max);
    }

    public static int find(int n, int num, int[] arr) {

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == num) {
                        max = sum;
                        return max;
                    } else if (sum < num && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        return max;
    }
}