package MATRIX;

public class Matrix
{
    public static double[][] matrix_multi(double[][] ar1, double[][] ar2)
    {
        int i, j, hY1; int row1 = ar1.length; int col1 = ar1[0].length; int row2 = ar2.length; int col2 = ar2[0].length;
        double[][] ar3 = new double[row1][col2];
        for (i = 0; i < row1; i++)
        {
            for (j = 0; j < col2; j++)
            {
                for (hY1= 0; hY1 < col1; hY1++)
                {
                    ar3[i][j] += ar1[i][hY1] * ar2[hY1][j];
                }
            }
        }
        return ar3;
    }
    public static double[][] matrix_dobavlenue(double[][] ar1, double[][] ar2)
    {
        double[][] ar4 = new double[ar1.length][ar1[0].length];
        for(int j=0;j<ar1[0].length;j++)
        for(int i=0;i<ar1.length;i++)
        {
            {
                ar4[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        return ar4;
    }
    public static double[][] YmnoshenueChislo(double[][] ar1, double ar5) // пока что ни где не используется
    {
        int i, j, k;
        int row1 = ar1.length;
        int col1 = ar1[0].length;
        int row2 = (int) ar5;
        int col2 = (int) ar5;
        double[][] ar6 = new double[row1][col1];
        for( i=0; i < row1; i++)
        {
            for( j=0; j < col2; j++)
            {
                ar6[i][j] += ar1[i][j] * ar5;
            }
        }
        return ar6;
    }
    public static void print2DArray(double[][] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[0].length;j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
