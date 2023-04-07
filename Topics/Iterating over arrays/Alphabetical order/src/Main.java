import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isAlpha = true;

        String [] arr = scanner.nextLine().split(" ");

        for (int i = 0; i< arr.length-1; i++ ){
            if (arr[i].compareTo(arr[i+1])>0){
                isAlpha = false;
                break;
            }

        }

        if (isAlpha){
            System.out.println("true");
        } else {
            System.out.println("false");
        }




       /* ArrayList <String> inputs = new ArrayList<>();

      while (scanner.hasNext()){
             String input = scanner.next();
             inputs.add(input);
        }

        for (int i = 0; i < inputs.size()-1; i++){

            if (inputs.get(i).compareTo(inputs.get(i+1))>0){
                // it should be -1
                isAlpha=false;
                break;

            }


            }

        if (isAlpha){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

*/
        }

    }
