import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        // Kilo değişkenlerimizi tanımlayalım.
        double armut,elma,domates,muz,patlican;

        Scanner input=new Scanner(System.in);
        // Kullanıcıdan verileri alalım.
        System.out.print("Kaç kilo armut : " );
        armut = input.nextDouble();

        System.out.print("Kaç kilo elma : " );
        elma = input.nextDouble();

        System.out.print("Kaç kilo domates : " );
        domates = input.nextDouble();

        System.out.print("Kaç kilo muz : " );
        muz = input.nextDouble();

        System.out.print("Kaç kilo patlican : " );
        patlican = input.nextDouble();

        // Kg fiyatı ve Tutar değişkenlerimizi oluşturalım.
        double armutkgFiyati = 2.14, elmaKgFiyati = 3.67, domatesKgFiyati =1.11,muzKgFiyati=0.95,patlicanKgFiyati=5.00;
        double armutTutari,elmaTutari,domatesTutari,muzTutari,patlicanTutari;

        // Tutar hesaplayan formulleri oluşturalım.
        armutTutari = armut*armutkgFiyati;
        elmaTutari = elma*elmaKgFiyati;
        domatesTutari = domates*domatesKgFiyati;
        muzTutari = muz*muzKgFiyati;
        patlicanTutari = patlican*patlicanKgFiyati;

        // Toplam tutar değişkenimizi oluşturalım.
        double toplamTutar;
        toplamTutar=armutTutari+elmaTutari+domatesTutari+muzTutari+patlicanTutari;

        System.out.println("Toplam Tutar : "+toplamTutar);





    }

}
