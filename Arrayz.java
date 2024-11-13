import java.util.Arrays;

public class Arrayz {
    
    // TODO: The efficient something 
    public static double[] sort(double[] list){
        int n = list.length;
        
        for (int i = 0; i < n - 1; i++){
            for (int w = 0; w < n - 1 - i; w++){
                if (list[w] > list[w + 1]){
                    double temp = list[w];
                    list[w] = list[w + 1];
                    list[w + 1] = temp;
                }
            }
        }
        return list;

        }

    public static boolean isMagicSquare(int[][] quadro) {
            int n = quadro.length;
            int i;
    
            int diagonalOneSum = 0;
            for (i = 0; i < n; i++) {
                diagonalOneSum += quadro[i][i];
            }
    
            int diagonalTwoSum = 0;
            for (i = n - 1; i >= 0; i--) {
                diagonalTwoSum += quadro[i][i];
            }
    
            for (i = 0; i < n; i++) {
                int rowSum = 0;
                int columnSum = 0;
                for (int a = 0; a < n; a++) {
    
                    rowSum += quadro[i][a];
                    columnSum += quadro[a][i];
                }
                if (rowSum != diagonalOneSum && columnSum != diagonalOneSum 
                && rowSum != diagonalTwoSum && columnSum != diagonalTwoSum) {
                    return false;
                }
    
            }
            return true;
        }



    
    public static void main(String[] args){

        
        // Test-Code für Teilaufgabe e)
        double[] array = {3., 2., 4., 2.3, 7.9};
        double[] sorted = sort(array);
        System.out.println(Arrays.toString(sorted));
        
        double[] array2 = {0.4, 15., 2.5, 5.5, 2.1, 17.9, 0.56, 0.234, 12.};
        double[] sorted2 = sort(array2);
        System.out.println(Arrays.toString(sorted2));

        double[] array3 = {0.4};
        double[] sorted3 = sort(array3);
        System.out.println(Arrays.toString(sorted3));


        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
        
    }
}
