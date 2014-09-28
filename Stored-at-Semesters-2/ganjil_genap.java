import java.util.Scanner;
public class ganjil_genap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Input sebuah bilangan : ");
        int bilangan=s.nextInt();
        if (bilangan % 2 == 1) {
            System.out.printf(bilangan+" Adalah bilangan GANJIL ");
        }
        else
            System.out.printf(bilangan+" Adalah bilangan GENAP ");
    }
}