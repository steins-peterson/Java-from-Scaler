import java.util.Scanner;
public class weatherExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weather condition: ");
        String weather = input.next();
        if(weather.equals("sunny") ){ //in java use equals method for string comparison rather than == cause it
            //checks for memory reference.
            System.out.println("wear sunglasses");
        }else if(weather.equals("rainy")){
            System.out.println("use umbrella");
        } else{
            System.out.println("check forecast!");
        }
    }
}
