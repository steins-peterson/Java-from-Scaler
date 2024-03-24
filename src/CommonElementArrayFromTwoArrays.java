import java.util.Scanner;

public class CommonElementArrayFromTwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int n = input.nextInt();

        // input for array 1
        int[] arrOne = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter arrOne element: ");
            arrOne[i] = input.nextInt();
        }

        // input for array 2
        int[] arrTwo = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter arrTwo element: ");
            arrTwo[i] = input.nextInt();
        }

        // common array
        int[] arrCommon = new int[n];
        int commonCount = 0;
        for (int i = 0; i<n; i++){
            if(arrOne[i] == arrTwo[i]){
                arrCommon[commonCount] = arrOne[i];
                commonCount++;
            }
        }
        if (commonCount>0){
            System.out.println("We have a common array");
            for (int i=0; i<n; i++){
                System.out.println(arrCommon[i]);
            }
        } else{
            System.out.println("We dont have a common array!");
        }

    }
}
