package Arrays_Strings.Ques7;

public class RotateMatrix {
    public static boolean rotate(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length)    return false;
        int n = matrix.length;

        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n-1-layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                // left -> top
                matrix[first][i] = matrix[last-offset][first];
                // bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];
                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{7,8,9,1,3},{3,1,2,3,5},{2,4,5,6,4},{6,7,8,9,2},{1,7,8,5,6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(rotate(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
