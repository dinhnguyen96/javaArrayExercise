import java.io.IOException;

public class CharacterCount {


    public static int characterCountOfString(String s, char c)
    {
        int count = 0;
        for (int i = 0; i < s.length();i++)
        {
            char element = s.charAt(i);
            if (element == c)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        String s = "Nguyen Dinh Nguyen";
        System.out.print("Nhập ký tự : ");
        int value = System.in.read();
        int charCount = characterCountOfString(s, (char)value);
        System.out.printf("Ký tự %c xuất hiện trong chuỗi : %d ", (char)value, charCount);

    }
}
