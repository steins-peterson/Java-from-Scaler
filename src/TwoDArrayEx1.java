public class TwoDArrayEx1 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        int [][] arr = new int [rows][cols]; // the 2d array has 4 rows and 3 columns, it is initialized like this.
        arr [2][1] = 7;
        System.out.println(arr[2][1]); // 7
        System.out.println(arr[2][0]);//0, by default java assigns any value as a zero until and unless we change it like the above value.
        System.out.println(arr[1][1]);//0



    }
}
