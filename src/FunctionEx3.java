import java.util.Scanner;

public class FunctionEx3 {

    static Scanner input = new Scanner(System.in);
    static String[] anime(int n) {
        return new String[n];
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of anime protagonists: ");
        int n = input.nextInt();
        input.nextLine(); // Consume the newline character

        String[] animeProtagonists = anime(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your protagonist " + (i + 1) + ": ");
            animeProtagonists[i] = input.nextLine();
        }

        System.out.println("Your anime protagonists are:");
        for (String protagonist : animeProtagonists) {
            System.out.println(protagonist);
        }
    }


}
