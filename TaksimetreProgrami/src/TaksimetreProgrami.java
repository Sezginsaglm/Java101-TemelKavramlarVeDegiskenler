import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double toplamUcret,kmBasiUcret=2.20;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Yazınız:");
        km= input.nextInt();

        toplamUcret=km*kmBasiUcret;
        toplamUcret +=10;
        toplamUcret=(toplamUcret<20)? 20:toplamUcret;
        System.out.println("Toplam Tutar:"+toplamUcret);


    }
}









