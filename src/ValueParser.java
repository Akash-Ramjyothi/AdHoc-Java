public class ValueParser {
    public static void main(String[] args) {
        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Enter name: ");
        System.out.println("Hi " + name + ", Thanks for taking the course.");

        String dateOfBirth = System.console().readLine("Enter birth year: ");
        int age = currentYear = Integer.parseInt(dateOfBirth);

        return "You are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}
