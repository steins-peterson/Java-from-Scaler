public class TwoDArray {
    public static void main(String[] args) {
        int [][] numArr = {
                {1,7,3},
                {3,7,11},
                {4,5,9,10}
        };
        String [][] tokyoGhoul = {
                {"Kaneki ken", "Touka", "Ayato"},
                {"gsan","Yomo san", "Eyepatch", "Nishio"}
        };

        System.out.println(numArr[0][2]);
        System.out.println(numArr[0][1]);
        System.out.println(numArr[2][3]);

        System.out.println(tokyoGhoul[0] [0]);
        System.out.println(tokyoGhoul[1][2]);
    }
}
