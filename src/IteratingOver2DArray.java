public class IteratingOver2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {4,5,7},
                {11,3,5,8},
                {7,1,4,2}
        };

        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]); this prints out the address of the arr array coz the elements inside of arr is also arrays.
            for (int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
