import java.util.Scanner;

public class PalindromeExample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine();

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        String rev = sb.toString();

        if(text.equals(rev) ){
            System.out.println("The given String is Palindromic!");
        } else{
            System.out.println("Its not a palindrome");
        }

    }
}
