import java.util.Scanner;


public class StudentSearch {


    public static void studentArrayInput(String[] studentArray, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.print("studentArray["+i+"] = ");
            studentArray[i] = input.nextLine();
        }
    }
    public static void studentArrayOutput(String[] studentArray, int n)
    {
        System.out.println("Tên sinh viên");
        for (int i = 0; i < n; i++)
        {
            System.out.println(studentArray[i] + " ");
        }
    }

    public static int studentSearch(String[] studentArray, int n, String studentSearch)
    {
        int studentPosition = -1;
        for (int i = 0; i < n; i++)
        {
            if (studentArray[i].equalsIgnoreCase(studentSearch))
            {
                return i;
            }
        }
        return studentPosition;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = input.nextInt();
        String[] studentArray = new String[n];
        studentArrayInput(studentArray, n);
        studentArrayOutput(studentArray, n);
        input = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String studentName = input.nextLine();
        int studentSearch = studentSearch(studentArray, n, studentName);
        if (studentSearch == -1)
        {
            System.out.println("Không tìm thấy sinh viên trong danh sách");
        }
        else
        {
            System.out.println("Vị trí của sinh viên trong danh sách : " + studentSearch);
        }



    }
}
