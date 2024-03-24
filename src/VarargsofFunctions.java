public class VarargsofFunctions { // varargs is used when we don't know how many arguments are going to be passed into
    // our method, it is variable no.of arguments, This means that you can pass a different number of arguments to the
    // method each time you call it.
    static float avg(float ...varargs){
        float total = 0;
        System.out.println(varargs.getClass().getSimpleName());

        for(float num:varargs){
            total +=num;
        }
        return total/ varargs.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(1,2,5,6,7,8,10,16,14,13)); // these arguments are sent in the form an array
        System.out.println(avg(13,2,6,8,3,22,5));

    }
}
