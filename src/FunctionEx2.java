import java.util.Scanner;

public class FunctionEx2 {
    static int square(int number){
        return number*number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(square(number));

    }
}
