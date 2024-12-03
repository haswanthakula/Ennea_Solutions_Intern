import java.util.Scanner;

public class Main {
    public static int trailingZeros(int n) {
        int c = 0;
        do {
            if (n % 2 != 0) {
                break;
            } else {
                c++;
                n = n / 2;
            }
        } while (n != 0);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(trailingZeros(n));
        scanner.close();
    }
}
