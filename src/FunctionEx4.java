import java.util.Scanner;

public class FunctionEx4 {

    static Scanner input = new Scanner(System.in);
    static String[] games(int n){
        return new String[n];
    }

    public static void main(String[] args) {
        System.out.print("Enter the no.of games you like: ");
        int n = input.nextInt();
        input.nextLine();
        String[] androidGames = games(n);
        for (int i=0; i< androidGames.length; i++){
            System.out.print("Enter your favorite game " +  (i+1) + " : ");
            androidGames[i] = input.nextLine();
        }
        for (String game : androidGames){
            System.out.println(game);
        }
    }
}
