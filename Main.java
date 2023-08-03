import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih);
        double sonuc = toplam / 5;
        System.out.println("Ortalamanız: " + sonuc);

        String durum = sonuc >= 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);

    }
}
