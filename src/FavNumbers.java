import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favoriteInteger = SafeInput.getInt(in, "Enter your favorite integer");
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer: " + favoriteInteger);
        System.out.println("Your favorite double: " + favoriteDouble);
    }
}
