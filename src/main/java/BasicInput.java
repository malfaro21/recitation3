import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int usrInteger = scnr.nextInt();

        System.out.println("Enter double: ");
        double usrDouble = scnr.nextDouble();

        System.out.println("Enter character: ");
        String usrChr = scnr.next();

        System.out.println("Enter string: ");
        String usrString = scnr.next();

        System.out.println(usrInteger+" " +usrDouble+ " " +usrChr+ " " +usrString);

        System.out.println(usrString + " " + usrChr + " " +usrDouble + " " +usrInteger);

        System.out.println(usrDouble + " cast to an integer is "+ (int)usrDouble);

        //return;
    }
}