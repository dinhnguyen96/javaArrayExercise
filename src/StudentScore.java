import java.util.Scanner;

public class StudentScore
{

    public static void scoreArayInput(int[] scoreArray, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n;)
        {
            System.out.print("scoreArray["+i+"] = ");
            scoreArray[i] = input.nextInt();
            if (scoreArray[i] <= 10 && scoreArray[i] >= 0)
            {
                i++;
            }
        }

    }
    public static void scoreArrayOutput(int[] scoreArray, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(scoreArray[i] + " ");
        }
    }
    public static int passStudentNumberCount(int[] scoreArray, int n)
    {
         int count = 0;

        for (int element:scoreArray)
        {
            if (element >= 5)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.print("Nhập số lượng sinh viên :");
         int n = input.nextInt();
         int[] scoreArray = new int[30];
         scoreArayInput(scoreArray, n);
         scoreArrayOutput(scoreArray,n);
         int passStudentNumber = passStudentNumberCount(scoreArray,n);
         System.out.printf("Số lượng sinh viên qua môn : %d ", passStudentNumber);




    }
}
