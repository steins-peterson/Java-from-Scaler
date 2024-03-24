import java.util.Scanner;

public class FunctionExample1 {

    static void introduce(String name, int age, String[] hobbies) {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.print("My hobbies are ");

        for (String x : hobbies) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        String [] hobbies = new String[3];
        for (int i = 0; i<hobbies.length; i++){
            System.out.print("Enter your hobby: ");
            hobbies[i] = input.nextLine();

        }

        introduce(name, age, hobbies);

    }
}
