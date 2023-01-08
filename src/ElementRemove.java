import java.util.Scanner;

public class ElementRemove {

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

    public static int existElementCheck(int[] array, int n, int k)
    {
        for (int i = 0; i < n; i++)
        {
            if (array[i] == k)
            {
                return i;
            }
        }
       return -1;
    }

    public static void arrayElementRemove(int[] array, int n, int position, int k)
    {
        for (int i = position; i < n - 1; i++)
        {
            array[i] = array[i+1];
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int[] array = new int[10];
        arrayInput(array,n);
        arrayOutput(array,n);
        System.out.print("Enter k :");
        int k = input.nextInt();
        int position = existElementCheck(array, n, k);
        if (position == -1)
        {
            System.out.println("Không tìm thấy phần tử trong mảng để xóa");
        }
        else
        {
            System.out.println("Sau khi xóa phần tử trong mảng");
            arrayElementRemove(array, n, position, k);
            arrayOutput(array, --n);
        }


    }
}
