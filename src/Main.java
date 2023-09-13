import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner newScanner = new Scanner (System.in);
        int age;
        String firstName;
        String favouriteFood;

        System.out.println("Please input your first name:");
        firstName = newScanner.nextLine();


        System.out.println("Please input your age:");
        age = newScanner.nextInt();

        newScanner.nextLine();

        System.out.println("Please input your favourite food");
        favouriteFood = newScanner.nextLine();

        System.out.println("First Name: " + firstName + "\nAge: " + age + "\nFavourite Food: " + favouriteFood);


    }

}