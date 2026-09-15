import java.util.Scanner;

public class ValueParser {
    public static void main(String[] args) {
        int currentYear = 2026;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Enter name: ");
        System.out.println("Hi " + name + ", Thanks for taking the course.");

        String dateOfBirth = System.console().readLine("Enter birth year: ");
        int age = currentYear = Integer.parseInt(dateOfBirth);

        return "You are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Enter name: ");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course.");

//        String dateOfBirth = System.console().readLine("Enter birth year: ");
        System.out.println("Enter birth year: ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a birth year >= " + (currentYear - 125) + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "You are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
