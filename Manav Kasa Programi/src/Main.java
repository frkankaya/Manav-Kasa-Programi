import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double Armutkg = 2.14 , Elmakg = 3.67 , Domateskg = 1.11 , Muzkg = 0.95 , Patlıcankg = 5.00 ;
    double Armutmiktar , Elmamiktar , Domatesmiktar , Muzmiktar , Patlıcanmiktar , toplam ;

    Scanner inp = new Scanner(System.in);

         System.out.print("Armut kac kilo? : ");
         Armutmiktar = inp.nextDouble();


         System.out.print("Elma kac kilo? : ");
         Elmamiktar = inp.nextDouble();


         System.out.print("Domates kac kilo? : ");
         Domatesmiktar = inp.nextDouble();


         System.out.print("Muz kac kilo? : ");
         Muzmiktar = inp.nextDouble();


         System.out.print("Patlican kac kilo? : ");
         Patlıcanmiktar = inp.nextDouble();


         toplam =  ( (Armutkg * Armutmiktar) + (Elmakg * Elmamiktar) + (Domateskg * Domatesmiktar) + (Muzkg * Muzmiktar) + (Patlıcankg * Patlıcanmiktar) );
         System.out.println("Toplam tutar : " + toplam);












    }
}
