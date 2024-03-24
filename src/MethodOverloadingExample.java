public class MethodOverloadingExample { // Method overloading is using the same name for different methods, it increases
    // the readability of the program.
    static int add(int a , int b){
        System.out.println("Inside first add");
        return a+b;
    }

    static String add(String a, String b){
        System.out.println("Inside second add");
        return a+b;
    }

    static String add (int a, String b){
        System.out.println("Inside third add");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add("Praise" , " Jesus")); // here string concatnation is done we need to use comma only not a plus sign!
        System.out.println(add(73 , " figs"));
    }
}
