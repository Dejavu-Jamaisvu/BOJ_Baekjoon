
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] paper = new int[n];
        int[][] paperXY = new int[n][6];

        int xMin = 9999;
        int yMin = 9999;
        int xMax = 0;
        int yMax = 0;

        for(int i=0;i<n;i++) {
            String s = br.readLine();
            String[] onePaperSize = s.split(" ");
            for(int j = 0;j<onePaperSize.length;j++)
               paperXY[i][j]  = Integer.parseInt(onePaperSize[j]);
            paperXY[i][4] = paperXY[i][0] + paperXY[i][2];
            paperXY[i][5] = paperXY[i][1] + paperXY[i][3];

            if(paperXY[i][0]<xMin)
                xMin=paperXY[i][0];
            if(paperXY[i][1]<yMin)
                yMin=paperXY[i][1];
            if(paperXY[i][4]>xMax)
                xMax=paperXY[i][4];
            if(paperXY[i][5]>yMax)
                yMax=paperXY[i][5];
        }
        br.close();

//        System.out.println(xMin+" "+yMin);
//        System.out.println(xMax+" "+yMax);

        int[][] ground = new int[xMax][yMax];

        countPaper(paper, paperXY, ground);

        for (int j : paper) {
            System.out.println(j);
        }
    }
    public static void countPaper(int[] paper, int[][] paperXY, int[][] ground){
        for(int index = paper.length-1 ; index>=0; index--){
            for(int i=paperXY[index][0];i<paperXY[index][4];i++){
                for(int j=paperXY[index][1];j<paperXY[index][5];j++){
                    if(ground[i][j]==0) {
                        ground[i][j] = index;
                        paper[index]++;
                    }
                }
            }
        }
    }

}