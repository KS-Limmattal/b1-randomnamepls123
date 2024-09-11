//import java.math.BigDecimal;

public class Loops {
    
    public static void primeFactorisation(int x){
        int i = 2;
        System.out.print(x + " = ");
        while (i <= x){
            if (i == x){
                System.out.print(i);
                x/=i;
            }if (x % i == 0){
                    System.out.print(i + " * "); 
                    x /= i;
            } else {
            i++; 
            } 
        }
    }

    public static double pi(int count, int digits){
        double pi = 0;
        for (int i = 0; i < count; i++){
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;

        return Math.round(pi * Math.pow(10, digits)) / Math.pow(10, digits);
    // TODO: BigDecimal


    }
    
    public static void main(String[] args){
    
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(3);
        System.out.println(" ");
        primeFactorisation(75);
        System.out.println(" ");
        primeFactorisation(69420);
        System.out.println(" ");
        primeFactorisation(42069);
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 16; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(20000, n));
        }
        System.out.println();
        System.out.println(pi(10001, 16)); 

    }
    
}
