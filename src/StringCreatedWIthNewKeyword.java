public class StringCreatedWIthNewKeyword {
    public static void main (String[] args){
        String s1 = "Jesus Christ"; // creating a string variable like this put in string pool in heap memory
        String s2 = "Jesus Christ";
        String s3 = new String("Jesus Christ"); // creating using the new keyword puts the string variable in the heap memory itself

        if (s1 == s2){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if(s1 == s3){ // the == operator checks with the memory reference that's why it comes out as not equal
            System.out.println("Equal");
        } else{
            System.out.println("Not Equal");
        }

        if (s1.equals(s3)){ // the ".equals" method checks for the exact value rather than the memory reference hence we got equal as output.
            System.out.println("Equal");
        } else{
            System.out.println("Not Equal");
        }
    }
}
