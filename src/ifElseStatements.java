import java.util.Scanner;

public class ifElseStatements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = input.nextInt();
        if (value > 0){
            System.out.println(value + " is a positive number");
        } else if(value < 0){
            System.out.println(value+ " is a negative number");
        } else{
            System.out.println(value + " is zero");
        }
    }
}
