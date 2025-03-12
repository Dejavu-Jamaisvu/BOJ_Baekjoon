
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<4 ; i++) { // while(sc.hasNext()) { 는 컨트롤 D로 빠져나오지 않으면 종료 안됨
            String str = sc.nextLine();

            String[] words = str.split(" "); // 공백을 기준으로 분리

            ArrayList<Integer> list = new ArrayList<>();

            for (String word : words) {
                list.add(Integer.parseInt(word));
            }

            Integer[] array = new Integer[list.size()];
            list.toArray(array);

            //직사각형1
            //왼쪽 위 // array[0],array[3]
            //왼쪽 아래 // array[0],array[1]
            //오른쪽 위 // array[2],array[3]
            //오른쪽 아래 // array[2],array[1]

            //직사각형2
            //왼쪽 위 // array[4],array[7]
            //왼쪽 아래 // array[4],array[5]
            //오른쪽 위 // array[6],array[7]
            //오른쪽 아래 // array[6],array[5]

            if (array[0] > array[6] || array[1] > array[7] || array[2] < array[4] || array[3] < array[5] ) {
                System.out.println("d");

            } else if ((array[0].equals(array[6]) && array[1].equals(array[7])) ||
                    (array[2].equals(array[4]) && array[1].equals(array[7])) ||
                    (array[0].equals(array[6]) && array[3].equals(array[5])) ||
                    (array[2].equals(array[4]) && array[3].equals(array[5]))) {
                System.out.println("c");
            } else if(array[2].equals(array[4]) || array[3].equals(array[5]) ||
                    array[0].equals(array[6]) || array[1].equals(array[7])) {
                System.out.println("b");
            }else{
                System.out.println("a");
            }

        }

        sc.close();
    }
}