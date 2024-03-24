import java.util.Scanner;

public class ReverseofaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String userInput = input.nextLine();
        String reverse = "";

        for(int i = userInput.length()-1; i>=0; i--){
            reverse = reverse + userInput.charAt(i);
        }
        System.out.println(reverse);
    }
}
