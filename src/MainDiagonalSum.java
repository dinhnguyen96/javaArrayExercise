import java.util.Scanner;

public class MainDiagonalSum
{
    public static void arrayInput(int[][] array, int row, int column)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column;j++)
            {
                System.out.print("array["+i+"]["+j+"] = ");
                array[i][j] = input.nextInt();
            }

        }
    }
    public static void arrayOutput(int[][] array, int row, int column)
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column;j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int mainDiagonalSum(int[][] array, int row)
    {
        int sum = 0;
        for (int i = 0; i < row;i++)
        {
            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = input.nextInt();
        System.out.print("Nhập số cột: ");
        int column = input.nextInt();

        int[][] array = new int[row][column];
        arrayInput(array, row,column);
        arrayOutput(array, row, column);

        int mainDiagonalSum = mainDiagonalSum(array,row);
        System.out.printf("Tổng đường chéo chính : %d", mainDiagonalSum);


    }
}
