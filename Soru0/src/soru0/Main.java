package soru0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tur;
        Scanner scan=new Scanner(System.in);
         Araba araba1=new Araba(200,"Ford ","A SPECIAL ROADSTER",4,1600000);
         Sport araba2=new Sport(400, "BMW", "320i ED Sports Line ", 8,9600000 );
         System.out.println("Turhanın Galerisine Hoşgeliniz ...");
         do {     
             System.out.println("Spor Bir Araba İsterseniz 'S' Tuşuna Basınız ");
         System.out.println("Klasik Bir Araba İsterseniz 'K' Tuşuna Basınız ");
             System.out.println("Çıkış Yapmak İsterseniz 'C' Tuşuna Basınız");
         tur=scan.next();
             if (tur.equals("s")||tur.equals("k")||tur.equals("c")) 
             {
                 break;
             }    
        } while (true);
          if (tur.equals("s")) 
             {
              araba2.bilgigoster();
             }
            if (tur.equals("k")) 
             {
              araba1.bilgigoster();
             }
              if (tur.equals("c")) 
             {
                 System.out.println("İyi Günler Dileriz");
             }
   
    }
    
}
