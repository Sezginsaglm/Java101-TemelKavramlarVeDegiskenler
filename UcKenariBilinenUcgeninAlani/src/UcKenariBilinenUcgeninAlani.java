import java.util.Scanner;
public class UcKenariBilinenUcgeninAlani {
    public static void main(String[] args) {
        // Değişkenlerimizi Oluşturalım.
        double a,b,c,u;
        //Kullanıcıdan verileri isteyelim.
        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenarı giriniz:");
        a=input.nextDouble();
        System.out.print("2. Kenarı giriniz:");
        b=input.nextDouble();
        System.out.print("3. Kenarı giriniz:");
        c=input.nextDouble();
        // Kenarları aldığımıza göre çevreyi hesaplayalım.

        u=(a+b+c)/2;
        System.out.println("Üçgenin Çevresi:"+2*u);
        //Alan*alan=u*(u-a)*(u-b)*(u-c)
        //m Üçgenin alanı olsun.
        double m;
        m=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+m);








    }
}
