import java.util.Scanner;

public class MaxElement {

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
    public static int[] maxElementSearch(int[] array, int n)
    {
        int max = array[0], position = 0;
        for (int i = 1; i < n; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                position = i;
            }
        }
        return new int[]{max, position};
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int[] array = new int[20];
        arrayInput(array,n);
        arrayOutput(array,n);
        int[] maxElement = maxElementSearch(array, n);
        System.out.printf("Tài sản lớn nhất  : %d \n", maxElement[0]);
        System.out.printf("Vị trí  : %d \n", maxElement[1]);
    }
}
