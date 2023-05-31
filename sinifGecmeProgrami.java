import java.util.Scanner;

public class sinifGecmeProgrami {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("müzik notunuz: ");
        muzik = inp.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if(avarage <= 55){
            System.out.println("sınıfta kaldınız" );
            System.out.println("ortalamanız: " + avarage);
        }else{
            System.out.println("Tebrikler ! Sınıfı geçtiniz :) ");
            System.out.println("ortalamanız: " + avarage);
        }


    }
}
