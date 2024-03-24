import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            sum = sum+num;
        } while(num>0);
        System.out.println(sum);
    }
}
