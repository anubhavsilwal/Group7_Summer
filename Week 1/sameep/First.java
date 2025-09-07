public class First {
    public static void main(String[] args) {

        // this is a comment
        System.out.print("pineapple\n");
        System.out.print("i like burgers\n");
        System.out.print("i like pizza!");
        System.out.println();
        /*
         * from here is variables
         */

        int age = 32;
        double price = 19.99;
        boolean isstudent = false;
        if (isstudent) {
            System.out.println("you are a student");
        } else {
            System.out.println("you arent");
        }
        System.out.println("The age is " + age);
        System.out.println("The price is " + price);
        /*
         * variables from here on out
         */

        String name = "seth rollins";
        String title = "world champ";
        String days = "for 399 days";
        // System.out.println("The wrestlers name is " + name);
        // System.out.println(name + " has been a " + title + " " + days);
        boolean ischamp = false;
        if (ischamp) {
            System.out.println(name + " is still the " + title + " " + days);
        } else {
            System.out.println(name + " has lost the title");
        }

    }
}
