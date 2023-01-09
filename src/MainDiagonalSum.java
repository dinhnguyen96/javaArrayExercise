import java.util.Scanner;

public class MainDiagonalSum
{
    public static void arrayInput(double[][] array, int row, int column)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column;j++)
            {
                System.out.print("array["+i+"]["+j+"] = ");
                array[i][j] = input.nextDouble();
            }

        }
    }
    public static void arrayOutput(double[][] array, int row, int column)
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

    public static double mainDiagonalSum(double[][] array, int row)
    {
        double sum = 0;
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

        double[][] array = new double[row][column];
        arrayInput(array, row,column);
        arrayOutput(array, row, column);

        double mainDiagonalSum = mainDiagonalSum(array,row);
        System.out.printf("Tổng đường chéo chính : %f", mainDiagonalSum);


    }
}
