import java.util.Scanner;

class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();


        for (int i : array) {
            if (i > number) {
                sum += i;
            }

        }

        System.out.println(sum);




    }
}
