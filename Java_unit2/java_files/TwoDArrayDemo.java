public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20}, {30, 40}, {50, 60}};
        System.out.println("Matrix Elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Element at [1][0]: " + matrix[1][0]);
    }
}
