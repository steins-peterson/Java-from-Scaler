import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int remainder = number%2;
        if(remainder ==0){
            System.out.println("the number is even");
            System.out.println(remainder);
        } else{
            System.out.println("the number's odd");
            System.out.println(remainder);
        }
    }
}
