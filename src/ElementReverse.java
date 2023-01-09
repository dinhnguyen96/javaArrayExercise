import java.util.Scanner;

public class ElementReverse {

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

    public static void elementReverse(int[] array, int n)
    {
        int start = 0, end = n - 1;
        while (start <= end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int[] array = new int[n];
        arrayInput(array,n);
        arrayOutput(array,n);
        System.out.println("Sau khi đảo ngược phần tử :  ");
        elementReverse(array, n);
        arrayOutput(array, n);
    }
}
