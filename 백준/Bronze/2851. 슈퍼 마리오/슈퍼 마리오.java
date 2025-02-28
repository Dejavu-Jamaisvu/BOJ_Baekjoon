import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int n=0 ; n<arr.length ; n++){
            arr[n]=sc.nextInt();
        }

        int sum=0;
        int best=0;
        for(int num: arr){
            sum += num;
            if(Math.abs(100-sum)<=Math.abs(100-best)){

                best = sum;

                //System.out.println("best " + best + ", sum " +sum);
            }
        }


        System.out.println(best);
    }
}