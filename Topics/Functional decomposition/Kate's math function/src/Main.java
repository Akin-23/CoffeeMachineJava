import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {

        double y = 0;

        if (x  <= 0) {
            y = f1(x);
        } else if (x>0 && x<1 ) {
            y = f2(x);

        } else if (x >= 1 ) {
             y = f3(x);
            
        }

        return y;


    }

    public static double f1 (double x){
        double t = Math.pow(x,2) + 1;

        return t;

    }

    public static double f2 (double x){

        double t = 1/ Math.pow(x,2);

        return t;

    }

    public static double f3(double x){
        double t = Math.pow(x,2) - 1;

        return t;
    }
}