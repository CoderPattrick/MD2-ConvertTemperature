import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f,c;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    f = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + convertFToC(f));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    c = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + convertCToF(c));
                    break;
            }
        }
        while (choice!=0);
    }
    public static double convertFToC(double inputF){
        double c = (5.0 / 9) * (inputF - 32);
        return c;
    }
    public static double convertCToF(double inputC){
        double f = (9.0 / 5) * inputC + 32;
        return f;
    }
}
