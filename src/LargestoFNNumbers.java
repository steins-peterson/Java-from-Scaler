import java.util.Scanner;

public class LargestoFNNumbers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = input.nextInt();

        int maxValue = Integer.MIN_VALUE; // its the least possible value an Integer can have

        for (int i =1; i<=n; i++){
            int current = input.nextInt();
            maxValue = Math.max(maxValue,current);
        }
        System.out.println(maxValue);
    }
}
