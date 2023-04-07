import java.util.Arrays;
import java.util.Scanner;

class Util {
    public static int[] swapInts(int[] ints) {

         int first = ints[1];
         int second = ints [0];


        int [] newInt = new int[] {first,second};



        return newInt;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        Util.swapInts(ints);

        System.out.println(Util.swapInts(ints)[0]);
        System.out.println(Util.swapInts(ints)[1]);
    }
}