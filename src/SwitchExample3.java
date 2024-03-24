import java.util.Scanner;

public class SwitchExample3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        switch (character){
            case 'a', 'e', 'i', 'o', 'u' ->{
                System.out.println("vowel");
            }
            default -> {
                System.out.println("consonant");
            }
        }
    }
}
