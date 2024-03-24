import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some text: ");
        StringBuilder userEnteredText = new StringBuilder();
        userEnteredText.append(input.nextLine());
        for(int i=userEnteredText.length()-1; i>=0; i--){
            System.out.print(userEnteredText.charAt(i));
        }
    }
}



