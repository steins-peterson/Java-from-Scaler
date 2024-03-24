import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int n = input.nextInt();

        int[] numbers = new int[5];

        // input loop
        for (int i = 0; i<n; i++){
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        System.out.print("Enter the value of key: ");
        int key = input.nextInt();
        int ans = -1;

        for (int i =0 ; i<n; i++){
            if (numbers[i] == key){
                ans = i;
                break;
            }
        }
        System.out.println("the iteration at which the value of key matched with the array element is at " + ans);
    }
}
