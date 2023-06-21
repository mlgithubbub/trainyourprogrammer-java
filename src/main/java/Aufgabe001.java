import java.util.Scanner;

public class Aufgabe001 {
    /*
    Schreiben Sie ein Programm, das dem Benutzer auffordert eine ganze Zahl einzugeben. Danach sollen alle möglichen
    Teiler dieser Zahl ausgegeben werden. Wenn keine ganze Zahl (Integer) eingegeben wurde soll eine Fehlermeldung
    erscheinen und der Benutzer wird noch einmal aufgefordert eine Zahl einzugeben.
     */

/*    //MY SOLUTION:
    public static void main(String[] args) {
        int zahl = 10;

        for (int i = 1; i <= zahl; i++){
            if (zahl%i ==0){
                System.out.println(i);
            }
        }
    }*/

/*    //MY SOLUTION WITH SCANNER:
    public static void main(String[] args) {
        System.out.println("Enter a whole number: ");
        Scanner s = new Scanner(System.in);
        int zahl = s.nextInt();
        s.close();

        System.out.print("The divisors of this number are: ");
        for (int i = 1; i <= zahl; i++){
            if (i == zahl){
                System.out.println(i + ".");
            } else if (zahl%i ==0){
                System.out.print(i + ",");
            }
        }
    }*/

/*    //OTHER SOLUTION WITH DIFFERENT WAY OF ADDING PERIOD AT END
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte ganze Zahl eingeben: ");
        int input = scanner.nextInt();
        scanner.close();

        System.out.print("Teiler von " + input + ": ");
        for(int i = 1; i < input; i++) {
            if(input % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(input + ".");
    }*/

}
