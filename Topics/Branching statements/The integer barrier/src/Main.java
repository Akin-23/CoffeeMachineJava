import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int amount = 1000;
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int input = scanner.nextInt();
            sum += input;

            if (input == 0) {
                System.out.println(sum);
                break;
            }

            if (sum >= amount) {
                int newAmount = sum - amount;
                System.out.println(newAmount);
                break;
            }

        }
    }
}
