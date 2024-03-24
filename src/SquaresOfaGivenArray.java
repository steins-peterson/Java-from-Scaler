import java.util.Scanner;

public class SquaresOfaGivenArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of numeric array: ");
        int n = input.nextInt();

        int [] numArray = new int[n];

        // input loop

        for(int i=0; i<numArray.length; i++){
            System.out.print("Enter a number: ");
            numArray[i] = input.nextInt();
        }

        // output loop

        for(int i=0; i<numArray.length; i++){
            System.out.println(numArray[i] * numArray[i]);
        }
    }
}
