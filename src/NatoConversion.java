public class NatoConversion {
    public static void main(String[] args) {
        char charValue = 'X';
        switch (charValue) {
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is baker");
            case 'C' -> System.out.println("C is charlie");
            case 'D' -> System.out.println("A is dog");
            case 'E' -> System.out.println("A is easy");
            default -> System.out.println("Letter " + charValue + " was not found in the switch statement");
        }
    }
}
