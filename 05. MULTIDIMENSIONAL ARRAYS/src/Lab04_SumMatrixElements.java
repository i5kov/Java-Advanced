import java.util.Arrays;
import java.util.Scanner;

public class Lab04_SumMatrixElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readArray(scanner);
        int rows = input[0];
        int[][] matrix = getMatrixWithData(rows, scanner);
        int sum = getSumOfElementsInMatrix(matrix);

        System.out.println(input[0]); // print rows
        System.out.println(input[1]); // print cols
        System.out.println(sum);      // print sum
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] getMatrixWithData(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static int getSumOfElementsInMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] rowElements : matrix) {
            for (int currentElement : rowElements) {
                sum += currentElement;
            }
        }
        return sum;
    }

}
