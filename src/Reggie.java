import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter an SSN (e.g., 123-45-6789):", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN entered: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter a UC Student M number (e.g., M12345 or m54321):", "^(M|m)\\d{5}$");
        System.out.println("Valid M number entered: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, or Q):", "^[OoSsVvQq]$");
        System.out.println("Valid menu choice entered: " + menuChoice);
    }
}
