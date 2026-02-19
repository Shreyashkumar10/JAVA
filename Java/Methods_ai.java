import java.util.Scanner;

public class Methods_ai {

    // 1️⃣ Method creation (no parameter, no return)
    static void greet() {
        System.out.println("Hello!");
    }

    // 2️⃣ Method with parameter (no return)
    static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    // 3️⃣ Method with return (overloaded)
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call method creation
        greet();

        // Call method with parameter
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        greet(name);

        // Call method with return
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum = " + add(x, y));

        System.out.print("Enter two doubles: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Sum = " + add(a, b));

        sc.close();
    }
}
