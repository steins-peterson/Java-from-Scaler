import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weather condition: ");
        String weather = input.nextLine();
        switch (weather){
            case "rainy":
                System.out.println("use Umbrella");
                break;
            case "sunny":
            System.out.println("use sunglasses");
                break;
            default:
                System.out.println("check forecast");
        }
    }
}