package arrays.twoD;

public class SpiralMatrix2DArrays {
    static void main() {
        // 1  2  3  4  5
        //14 15  16 17  6
        //13 10 19 18  7
        // 12 11 10  9  8
         int [][] arr={{1,2,3,4,5},{14,15,16,17,6},{13,20,19,18,7},{12,11,10,9,8}};
         printSpiralMatrix(arr);
    }
    private static void printSpiralMatrix(int[][] arr) {
        int startRow=0;
        int endRow=arr.length-1;
        int endColumn =arr[0].length-1;
        int startColumn=0;
        //to print we should go for all numbers
        //hence m*n=total times we need iteration
        int total=arr.length*arr[0].length;
        while(total>0){
            for (int i = startColumn; i <= endColumn && total>0; i++) {
                System.out.print(" "+arr[startRow][i]);
                total--;
            }
            startRow++;
            System.out.println();
            for (int i = startRow; i <= endRow && total>0; i++) {
                System.out.print(" "+arr[i][endColumn]);
                total--;
            }
            System.out.println();
            endColumn--;

            for (int i = endColumn; i >=startColumn && total>0; i--) {
                System.out.print(" "+arr[endRow][i]);
                total--;
            }
    endRow--;
            System.out.println();
            for (int i = endRow; i >=startColumn && total>0; i--) {
                System.out.print(" "+arr[i][startColumn]);
                total--;
            }
            startColumn++;
            System.out.println();
        }

    }
}
