import java.util.Scanner;

public class Sumof2Arrays {
    static Scanner input = new Scanner(System.in);

    static void matrixRead(int [][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.println("Enter a number: ");
                mat[i][j] = input.nextInt();
            }
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter no.of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter no.of cols: ");
        int cols = input.nextInt();

        int [][] a = new int[rows][cols];
        int [][] b = new int[rows][cols];

        matrixRead(a);
        matrixRead(b);


        int [][] c = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Printing out the matrix c");
        for(int i = 0; i<c.length;i++){
            for(int j=0; j<c[i].length;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }
}