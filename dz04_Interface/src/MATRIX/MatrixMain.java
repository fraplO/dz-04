package MATRIX;
import static MATRIX.Matrix.*;
public class MatrixMain
{
    public static void main(String[] args)
    {
        double ar5 = 5; //для умножения матрицы на число
        double ar1[][] = {{45, 29, 55}, {22, 12, 14}, {17, 18, 27}};  //неизменяемые матрицы(массивы)
        double ar2[][] = {{18, 25, 32}, {32, 88, 56}, {2, 4, 5}};

        double[][] arAdd = matrix_dobavlenue(ar1, ar2);
        print2DArray(arAdd);
        System.out.println("/////Сложение матриц/////");
        double[][] arMulti = matrix_multi(ar1, ar2);
        print2DArray(arMulti);
        System.out.println("/////Умножение матриц/////");

        //double[][] ymonshenue = Matrix.YmnoshenueChislo(ar1, ar5);
        //Matrix.print2DArray(ymonshenue);
       // System.out.println("/////Умножение матрицы матрицы на число/////");
    }
}

