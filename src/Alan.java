import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Merkez açısı ölçüsü : ");
        a = input.nextInt();

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        alan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı : " + alan);

    }
}