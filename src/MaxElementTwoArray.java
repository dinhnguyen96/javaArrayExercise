import java.util.Scanner;

public class MaxElementTwoArray
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
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[] maxElementSearch(double[][] array, int row, int column)
    {
        double max = Double.MIN_VALUE;
        int x = 0, y = 0;
        for (int i = 0; i < row;i++)
        {
            for (int j = 0; j < column;j++)
            {
                if (array[i][j] > max)
                {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        return new double[]{max,x,y};

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = input.nextInt();
        System.out.print("Nhập số cột: ");
        int column = input.nextInt();

        double[][] array = new double[row][column];
        arrayInput(array,row,column);
        arrayOutput(array,row,column);
        double[] result = maxElementSearch(array,row,column);
        System.out.printf("Phần tử lớn nhất là %f với toa độ là %f %f", result[0],result[1],result[2]);

    }
}
