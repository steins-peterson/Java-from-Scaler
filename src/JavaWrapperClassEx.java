import java.util.ArrayList;

public class JavaWrapperClassEx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // initializing an ArrayList, an Arraylist is an array type DS
        // that is dynamic in nature means auto updation on the size when we remove or add elements to it.

        numbers.add(10);
        numbers.add(33);
        numbers.add(77);
        numbers.add(666);

        System.out.println(numbers);
        System.out.println("Size of the ArrayList numbers is: " + numbers.size());

        System.out.println("ArrayList numbers size after removing something from it: ");
        numbers.remove(3);

        for(int number: numbers){
            System.out.println(number);
        }
        System.out.println();
        System.out.println(numbers.size());
    }
}
