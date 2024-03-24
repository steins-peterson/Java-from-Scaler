
class Anime {
    String name;
    int totalEps;
    String ratingOfYourChoice;

    Anime(String name, int totalEps, String ratingOfYourChoice){ // an example of a constructor with arguments
        this.name = name; // here this keyword refers to the name of the instance of object and assigns the name value
        // we passed to the name property
        this.totalEps =totalEps;
        this.ratingOfYourChoice = ratingOfYourChoice;
    }

    void displayInfo(){
        System.out.println("Name of the Anime: "+ name);
        System.out.println("Total Episodes: "+ totalEps);
        System.out.println("Your raing: "+ ratingOfYourChoice);
    }

}
public class ConstructorEx1 {
    public static void main(String[] args) {

        Anime one = new Anime("AOT", 80, "Good");
        Anime two = new Anime("TSDS", 60, "Average");
        Anime three = new Anime("Death note", 36, "Excellent");

        one.displayInfo();
        two.displayInfo();
        three.displayInfo();
    }
}
