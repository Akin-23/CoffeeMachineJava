import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int [] shiftedArray = new int[arr.length];
        // (i + steps) % arr.length gives me the new i index


        for (int i = 0; i < arr.length; i++){
              int newIndex = (i+steps) % arr.length;
                shiftedArray [newIndex] = arr[i];
        }

        for (int i = 0; i < arr.length; i++){
            arr [i] = shiftedArray[i];
        }


    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}