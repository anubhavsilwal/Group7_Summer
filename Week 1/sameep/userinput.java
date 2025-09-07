import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        System.out.print("enter the age ");
        int age = scanner.nextInt();
        System.out.print("enter if your a student or not with (true or false)");
        boolean isstudent = scanner.nextBoolean();
        if (isstudent) {
            System.out.println("you are a student");
            System.out.println("the name is " + name);
            System.out.println("the age is " + age);
        } else {
            System.out.println("you arent");
        }

        scanner.close();
    }
}