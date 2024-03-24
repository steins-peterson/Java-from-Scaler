public class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like Biryani");

        sb.append(" and watching Anime."); // adds at the last position.
        System.out.println(sb);

        sb.insert(14, ", Working out "); // inserts something that you want
        System.out.println(sb);

        sb.replace(2, 6, "Love"); // replace method replaces the value, it takes 3 parameters(Start, end, content)
        System.out.println(sb);

        sb.delete(7,14); // deletes stuff
        System.out.println(sb);
    }
}
