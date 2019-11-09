import java.util.Scanner;
public class CreateMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);        
        System.out.println("Enter The Number Of Matrix Rows");         
        int row = scan.nextInt();         
        System.out.println("Enter The Number Of Matrix Columns");         
        int col = scan.nextInt();         
        //defining 2D array to hold matrix data
        int[][] matrix = new int[row][col];
        // Enter Matrix Data
        enterMatrixData(scan, matrix, row, col);        
        // Print Matrix Data
        printMatrix(matrix, row, col);
  }
  public static void enterMatrixData(Scanner scan, int[][] matrix, int row, int col){
     System.out.println("Enter Matrix Data");          
          for (int i = 0; i < row; i++)
          {
              for (int j = 0; j < col; j++)
              {
                  matrix[i][j] = scan.nextInt();
              }
          }
  }  
  public static void printMatrix(int[][] matrix, int row, int col){
    System.out.println("Your Matrix is : ");        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }             
            System.out.println();
        }
     }
}