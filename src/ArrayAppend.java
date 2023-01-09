import java.util.Scanner;

public class ArrayAppend
{

    public static void arrayInput(int[] arrayNumberOne, int[] arrayNumberTwo)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử của mảng thứ nhất : ");
        for (int i = 0; i < arrayNumberOne.length; i++)
        {
            System.out.print("arrayNumberOne["+i+"] = ");
            arrayNumberOne[i] = input.nextInt();
        }
        System.out.println("Nhập phần tử của mảng thứ hai : ");
        for (int i = 0; i < arrayNumberOne.length; i++)
        {
            System.out.print("arrayNumberTwo["+i+"] = ");
            arrayNumberTwo[i] = input.nextInt();
        }
    }
    public static int[] arrayAppend(int[] arrayNumberOne, int[] arrayNumberTwo)
    {
        int[] arrayNew = new int[arrayNumberOne.length+arrayNumberTwo.length];
        int k = 0;
        for (int i = 0; i < arrayNumberOne.length;i++)
        {
           arrayNew[k] = arrayNumberOne[i];
           k++;
        }
        for (int i = 0; i <arrayNumberTwo.length;i++)
        {
            arrayNew[k] = arrayNumberTwo[i];
            k++;
        }
        return arrayNew;
    }
    public static void arrayNewOutput(int[] newArray)
    {
        for (int i = 0; i < newArray.length; i++)
        {
            System.out.println(newArray[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập só lượng mảng thứ nhất: ");
        int n = input.nextInt();
        System.out.print("Nhập só lượng mảng thứ hai: ");
        int m = input.nextInt();
        int[] arrayNumberOne = new int[n];
        int[] arrayNumberTwo = new int[m];
        arrayInput(arrayNumberOne,arrayNumberTwo);
        System.out.println("Sau khi sáp nhập mảng 1 và mảng 2: ");
        int[] arrayNew = arrayAppend(arrayNumberOne,arrayNumberTwo);
        arrayNewOutput(arrayNew);




    }
}
