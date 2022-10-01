import java.util.Scanner;

public class DairedeAlanVeCevreHesaplayanProgram {
    public static void main(String[] args) {
        double pi = 3.14, daireninalani, dairenincevresi, r;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını cm cinsinden giriniz:");
        r = input.nextDouble();

        daireninalani = pi * (r * r);
        dairenincevresi = 2 * pi * r;
        System.out.println("Dairenin alanı:" + daireninalani);

        System.out.print("Dairenin çevresi:" + dairenincevresi);

    }
}



