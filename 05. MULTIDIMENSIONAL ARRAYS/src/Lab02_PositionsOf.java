import java.util.Arrays;
import java.util.Scanner;

public class Lab02_PositionsOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = readArray(scanner);
        int[][] matrix = fillRowsOfArray(scanner, matrixSize[0]);
        int numberForSearch = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberForSearch) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] fillRowsOfArray(Scanner scanner, int rows) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

}
