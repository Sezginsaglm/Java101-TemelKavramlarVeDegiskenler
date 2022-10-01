import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double kilo, boy,vucutKitleEndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu Kg cinsinden giriniz:");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu m cinsinden giriniz:");
        boy = input.nextDouble();
        vucutKitleEndeksi = kilo / (boy * boy);
        System.out.print("Vücut Kitle Endeksiniz:" + vucutKitleEndeksi);
    }
}