public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void hours(int x){
        int h = x / 3600;
        int min = x % 3600 / 60;
        int sec = x % 60;
        System.out.printf("%02d:%02d:%02d%n", h, min, sec);
    }

    public static int distance(double x1, double y1, double x2, double y2){
        double dx = x2 - x1;
        double dy = y2 = y1;
        double dist = Math.sqrt(Math.pow(dx, dx) + Math.pow(dy, dy));
        return (int) Math.round(dist);
    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        hours(3);
        hours(50001);
        // TODO: Schreibe mehr Testcode
        hours(66666666);
        hours(123456);

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance(2, 5, 7, 0));
    }
    
}
