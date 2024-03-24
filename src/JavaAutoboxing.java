public class JavaAutoboxing { // autoboxing is the auto conversion of primitive types into objects done by java compiler.
    public static void main(String[] args) {
        int a = 9;
        float b = 3;
        long c = 10000;

        Integer objInt = a;
        Float objFloat = b;
        Long objLong = c;

        System.out.println(objFloat);
        System.out.println(objInt);
        System.out.println(objLong);


    }
}
