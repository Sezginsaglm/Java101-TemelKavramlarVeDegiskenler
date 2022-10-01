import java.util.Scanner;

public class DaireDilimininAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        double pi = 3.14, dairedilimininalani, dairedilimininacisi, r;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r = input.nextDouble();

        System.out.print("Daire diliminin merkez açısını giriniz:");
        dairedilimininacisi = input.nextDouble();

        dairedilimininalani = (pi * (r * r) * dairedilimininacisi) / 360;

        System.out.print("Daire diliminin alanı:" + dairedilimininalani);

    }
}