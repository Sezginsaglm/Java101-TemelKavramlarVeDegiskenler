import java.util.Scanner;

public class DikUcgendeHipotenusHesaplayiciProgram {
    public static void main(String[] args) {
        //Değişkenleri oluşturalım.
        double a,b,c;
        // Kullanıcıdan Veri isteyelim.
        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz:");
        a=input.nextDouble();
        System.out.print("2. Kenarı Giriniz:");
        b=input.nextDouble();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs:"+c);





    }
}
