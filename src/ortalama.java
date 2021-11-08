import java.util.Scanner;

public class ortalama {
        public static void main(String[] args) {
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Matematik notunuzu girin: ");
            int mat = scn.nextInt();
            System.out.println("Fizik notunuzu girin: ");
            int fiz = scn.nextInt();
            System.out.println("Kimya notunuzu girin: ");
            int kim = scn.nextInt();
            System.out.println("Türkçe notunuzu girin: ");
            int trk = scn.nextInt();
            System.out.println("Tarih notunuzu girin: ");
            int trh = scn.nextInt();
            System.out.println("Müzik notunuzu girin: ");
            int mzk = scn.nextInt();
            int ort = (mat+fiz+kim+trk+trh+mzk)/6;
            System.out.println("Not ortalamanız : " +ort);
            String sonuc = (ort>=60)? "Sınıfı geçtiniz": "Sınıfta kaldınız";
            System.out.println(sonuc);
            }
}
