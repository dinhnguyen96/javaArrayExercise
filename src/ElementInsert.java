import java.util.Scanner;

public class ElementInsert {

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

    public static void arrayElementInsert(int[] array, int n, int k, int position)
    {
        if (position <= -1 || position >= array.length-1)
        {
            System.out.println("Không chèn được phần tử vào mảng");
            return;
        }
        for (int i = n; i > position;i--)
        {
            array[i] = array[i-1];
        }
        array[position] = k;

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int[] array = new int[10];
        arrayInput(array,n);
        arrayOutput(array,n);
        System.out.print("Enter value :");
        int value = input.nextInt();;
        System.out.print("Enter position :");
        int position = input.nextInt();;
        arrayElementInsert(array, n, value ,position);
        if (position > -1)
        {
            System.out.println("Sau khi thêm phần tử trong mảng");
            arrayOutput(array, ++n);
        }

    }
}