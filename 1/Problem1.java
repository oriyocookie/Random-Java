import java.util.*;
public class Problem1
{
    public static void main(String[] args)
    {
        double [][] matrix=new double [3][3];

        System.out.println("Enter a 3 by 3 matrix row by row: ");
        Scanner input=new Scanner(System.in);
        for (int i=0; i< 3; i++)
            {
                for (int j=0; j<3; j++)
                    {
                        matrix[i][j]= input.nextDouble();
                    }
            }
System.out.println("matrix before: ");
        for (int i=0; i< 3; i++)
            {
                for (int j=0; j<3; j++)
                    {
                        System.out.print(matrix[i][j] + "  ");
                    }
                System.out.println();
            }
        
        double[][] sortedMatrix=sortColumns(matrix);
        System.out.println("The matrix after being sorted by columns is:");
        for (int i=0; i< 3; i++)
            {
                for (int j=0; j<3; j++)
                    {
                        System.out.print(sortedMatrix[i][j] + "  ");
                    }
                System.out.println();
            }
        
    }
    public static double[][] sortColumns(double[][] passedin_matrix)
    {
        double[][] matrixSorted=new double [3][3]; //makes a new 3x3 matrix
        for (int i=0; i<3; i++) //copies the passedin_matrix 
            {
                for (int j=0; j<3; j++)
                    {
                        matrixSorted[i][j]=passedin_matrix[i][j];
                    }
            }
        //column sorting goes here
        
        for (int i=0; i<3; i++)
            {
                for (int j=0; j<3; j++){
                    for (int k=j+1; k<3; k++){
                        if (matrixSorted[i][j]> matrixSorted[i][k]){
                            double temp=matrixSorted[j][i];
                            matrixSorted[j][i]=matrixSorted[k][i];
                            matrixSorted[k][i]=temp;
                        }

                    }


                }
            }
        return matrixSorted;
    }
}
