import java.util.Arrays;
import java.util.Scanner;

public class Lab01_CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = readArray(scanner);
        int[][] firstMatrix = fillRowsOfMatrix(scanner, matrixSize[0], matrixSize[1]);
        matrixSize = readArray(scanner);
        int[][] secondMatrix = fillRowsOfMatrix(scanner, matrixSize[0], matrixSize[1]);
        boolean areMatricesEqual = areMatricesEqual(firstMatrix, secondMatrix);

        System.out.println(areMatricesEqual ? "equal" : "not equal");
    }

    private static boolean areMatricesEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] fillRowsOfMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

}
