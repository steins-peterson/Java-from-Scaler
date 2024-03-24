import java.util.Scanner;

public class ReadingInput2Darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter no.of cols: ");
        int cols = input.nextInt();
        int [][] numArray = new int[rows][cols];

        //input for 2d array

        for(int i = 0; i<numArray.length; i++){
            for(int j = 0; j<numArray[i].length; j++){
                System.out.print("Enter a number: ");
                numArray[i][j] = input.nextInt();
            }
        }

        // output for 2d array

        for(int i=0; i<numArray.length;i++){
            for (int j = 0; j<numArray[i].length; j++){
                System.out.println(numArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
