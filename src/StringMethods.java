public class StringMethods {
    public static void main(String[] args) {
        String love = "I love Programming";
        String s = love.replace("Programming", "Java"); // this method is case-sensitive.
        System.out.println(love);
        System.out.println(s);

        String s1 = "Praise God!";
        String s2 = s1.substring(7); // this provides us a substring from the original string that
        System.out.println(s2);
    }
}

