import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter the birth year (1950-2015)", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter the birth month (1-12)", 1, 12);
        int birthDay = 0;

        switch (birthMonth) {
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter the birth day (1-29)", 1, 29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter the birth day (1-30)", 1, 30);
                break;
            default:
                birthDay = SafeInput.getRangedInt(in, "Enter the birth day (1-31)", 1, 31);
                break;
        }

        int birthHours = SafeInput.getRangedInt(in, "Enter the birth hour (1-24)", 1, 24);
        int birthMinutes = SafeInput.getRangedInt(in, "Enter the birth minutes (1-59)", 1, 59);

        System.out.println("Birth date and time: " + birthMonth + "/" + birthDay + "/" + birthYear + " " + birthHours + ":" + birthMinutes);
    }
}
