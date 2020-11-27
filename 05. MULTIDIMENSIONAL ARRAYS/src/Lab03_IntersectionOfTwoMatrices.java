import java.util.Scanner;

public class Lab03_IntersectionOfTwoMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = getMatrixOfChars(rows, cols, scanner);
        char[][] secondMatrix = getMatrixOfChars(rows, cols, scanner);
        char[][] outputMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    outputMatrix[row][col] = '*';
                } else {
                    outputMatrix[row][col] = firstMatrix[row][col];
                }
            }
        }

        printMatrix(outputMatrix);

    }

    private static char[][] getMatrixOfChars(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            String[] input = readArray(scanner);
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input[col].charAt(0);
            }
        }
        return matrix;
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char currentChar : chars) {
                System.out.print(currentChar + " ");
            }
            System.out.println();
        }
    }

}
