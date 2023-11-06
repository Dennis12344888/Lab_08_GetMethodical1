public class TemperatureConverter {
    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Celsius  |  Fahrenheit");
        System.out.println("--------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%3d      |  %6.2f%n", celsius, fahrenheit);
        }
    }
}
