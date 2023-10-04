import java.util.*;
public class Lesson2input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your lastname? ");
        String lastname = input.nextLine();

        System.out.print("What is your favorite movie? ");
        String movie = input.nextLine();

        System.out.print("What is the name of the city you live? ");
        String city = input.nextLine();

        System.out.println("Thank you for provided information");
        System.out.println(name + " " + lastname);

    }
}
