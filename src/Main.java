import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите Ф.И.О:");
            String text = new Scanner(System.in).nextLine();

            int firstSpace = text.indexOf(' ');
            String surname = text.substring(0, firstSpace);
            int secondSpace = text.lastIndexOf(' ');
            String name = text.substring(
                    firstSpace + 1, secondSpace
            );
            String lastName = text.substring(secondSpace + 1);

            System.out.println("Фамилия: " + surname);
            System.out.println("Имя: " + name);
            System.out.println("Отчество: " + lastName);
        }

    }
}