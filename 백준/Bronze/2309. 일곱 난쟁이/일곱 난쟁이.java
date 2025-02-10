import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int total=0;
        for(int i=0 ; i<9 ; i++) {
            int number = sc.nextInt();
            total += number;
            list.add(number);

        }

        Collections.sort(list); // 오름차순 정렬
        //System.out.println(list.toString());

        find(total, list);

        for(int n :list)
            System.out.println(n);

    }
    public static void find(int total, List<Integer> list) {
        for(int i=0;i<list.size();i++) {
            for (int j=i+1;j<list.size();j++) {
                if(total - list.get(i) - list.get(j)==100) {
                    //System.out.println("list.get("+i+") : "+list.get(i)+" | list.get("+j+") : "+list.get(j));
                    list.remove(j);
                    list.remove(i);
                    return;
                }
            }
        }
    }

}