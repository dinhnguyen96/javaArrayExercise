import java.util.Scanner;

public class ColumnSum {

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
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double columnSum(double[][] array,int row,int k)
    {
        double sum = 0;
        for (int i = 0; i < row; i++)
        {
            sum+= array[i][k];
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

        System.out.print("Nhập cột: ");
        int k = input.nextInt();
        double sum = columnSum(array,row, k);
        System.out.printf("Tổng phần tử ở cột %d : %f",k, sum);
    }
}
