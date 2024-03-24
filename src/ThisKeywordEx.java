
class Dog{
    String name;
    String gender;
    String favFood;

    Dog(String name, String gender, String favFood){
        this.name = name;
        this.gender = gender;
        this.favFood = favFood;
    }

    void displayInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(favFood);
    }
}
public class ThisKeywordEx {
    public static void main(String[] args) {
        Dog myDog = new Dog("Shelby", "Female", "Chicken");
        myDog.displayInfo();
    }
}
