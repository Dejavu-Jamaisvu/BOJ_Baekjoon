import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 6;//육각형
        int n = sc.nextInt(); // 1m2의 넓이에 자라는 참외의 개수

        int[] directions = new int[num];
        int[] length = new int[num];

        for(int i=0 ; i<num ; i++){
            directions[i] = sc.nextInt();
            length[i] = sc.nextInt();
        }


//        System.out.println(length.toString());


        //1. 큰 사각형 찾기
        //가장 긴값 찾기 //가장 큰 사각형 한변 인덱스 찾기
        int maxIndex=0;
        for (int i=maxIndex ; i<num ; i++) {
            if(length[i]>length[maxIndex]){
                maxIndex=i;
            }
        }


//        System.out.println("maxIndex : "+maxIndex);

        int findIndex=maxIndex;//다른 한변 인덱스 찾기 //초기값 그냥 넣어줌

        int otherIndex1=(maxIndex+num-1)%num; // 가장 큰변 기준 좌우 인덱스
        int otherIndex2=(maxIndex+num+1)%num;

        int miniRectangleIndex1=maxIndex; // 작은 사각형 한변 인덱스1 // 초기값 그냥 넣어줌
        int miniRectangleIndex2=maxIndex; // 작은 사각형 한변 인덱스2 // 초기값 그냥 넣어줌

        if(length[otherIndex1]>length[otherIndex2]) {
            findIndex = otherIndex1;
            miniRectangleIndex1 = (maxIndex+num+2)%num;
            miniRectangleIndex2 = (findIndex+num-2)%num;
        }
        else {
            findIndex = otherIndex2;
            miniRectangleIndex1 = (maxIndex+num-2)%num;
            miniRectangleIndex2 = (findIndex+num+2)%num;
        }


//        System.out.println("findIndex : "+findIndex);

        int area = length[maxIndex]*length[findIndex] - length[miniRectangleIndex1]*length[miniRectangleIndex2];


        System.out.println(area * n);
        sc.close();
    }
}