import java.util.Scanner;

public class MinElement {

    public static void arrayInput(int[] array, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = input.nextInt();
        }
    }
    public static void arrayOutput(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i] + " ");
        }
    }
    public static int minElementSearch(int[] array, int n)
    {
        int min = array[0];
        for (int i = 1; i < array.length;i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int[] array = new int[n];
        arrayInput(array,n);
        arrayOutput(array,n);
        int minElement = minElementSearch(array, n);
        System.out.printf("Giá trị nhỏ nhất trong mảng : %d", minElement);
    }
}
