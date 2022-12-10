import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // ЗАДАНИЕ 1

        String s1 = "h201al";
        int mid = s1.length() / 2;

        String[] parts = {s1.substring(0, mid), s1.substring(mid)};
        System.out.println(parts[0]);
        System.out.println(parts[1]);

        // ЗАДАНИЕ 2

        try {
            foo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// Как я понимаю FileNotFoundException является расширением от IOException, поэтому нет смысла использовать оба данных исключения, поэтому
// я оставил исключение IOException, так как оно более обширное
    public static void foo() throws IOException {
    }
}



