import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.println("A kenarı için değer giriniz: ");
        a = input.nextDouble();

        System.out.println("B Kenarı için değer giriniz: ");
        b = input.nextDouble();

        System.out.println("C Kenarı için değer giriniz");
        c = input.nextDouble();

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c) );
        System.out.println("Üçgenin alanı : " +alan );

    }
}
