
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int a = 0; a < n; a++) {
            int lenA = sc.nextInt();
            int[] arrA = new int[lenA];
            for (int i = 0; i < lenA; i++) {
                arrA[i] = sc.nextInt();
            }

            int lenB = sc.nextInt();
            int[] arrB = new int[lenB];
            for (int i = 0; i < lenB; i++) {
                arrB[i] = sc.nextInt();
            }


            Arrays.sort(arrA);
            for (int i = 0; i < arrA.length / 2; i++) {
                int temp = arrA[i];
                arrA[i] = arrA[arrA.length - 1 - i];
                arrA[arrA.length - 1 - i] = temp;
            }
            Arrays.sort(arrB);
            for (int i = 0; i < arrB.length / 2; i++) {
                int temp = arrB[i];
                arrB[i] = arrB[arrB.length - 1 - i];
                arrB[arrB.length - 1 - i] = temp;
            }


            System.out.println(check(arrA, arrB));
        }
        sc.close();

    }

    public static String check(int[] arrA, int[] arrB) {
        int arrayLength = 0;
        boolean same = false;
        if (arrA.length > arrB.length)
            arrayLength = arrB.length * -1;
        else if (arrA.length < arrB.length) {
            arrayLength = arrA.length;
        }else {
            arrayLength = arrA.length;
            same = true;
        }

        for (int i = 0; i < Math.abs(arrayLength); i++) {
            if (arrA[i] > arrB[i])
                return "A";
            else if (arrA[i] < arrB[i]) {
                return "B";
            }
        }
            if (same)
                return "D";
            else if (arrayLength > 0)
                return "B";
            else
                return "A";
    }
}