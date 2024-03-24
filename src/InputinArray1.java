import java.util.Scanner;

public class InputinArray1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of characterLub array: ");
        int n = input.nextInt();
        input.nextLine();
        String [] charactersLub = new String[n];
        for(int i = 0; i<charactersLub.length; i++){
            System.out.println("Enter your favorite character name: ");
            charactersLub[i] = input.nextLine();
        }
        for (int i = 0; i< charactersLub.length; i++){
            System.out.println("Favorite character at position " + i + " is " +charactersLub[i]);
        }
        System.out.println(charactersLub.length);
    }
}
