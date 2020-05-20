
package soru0;

import java.util.Scanner;

public  class Araba 
     
{  boolean testb=false;
    String kontrol;
    String gosterkontrol;
    Scanner scan=new Scanner(System.in);
    protected double Motorguc;
    protected String marka;
    protected String Model;
    protected double silindir;
    public   double hız;
    public int fıyat;
    private String tur="Clasik Araba Arıyorsanız Doğru Yerdesiniz";
    
    
    public Araba(double Motorguc, String marka, String Model,double silindir,int fiyat) {
        this.Model=Model;
        this.Motorguc = Motorguc;
        this.marka = marka;
        this.silindir = silindir;
        this.hız = (Motorguc*silindir)/10;
        this.fıyat=fiyat;
    }
    public  void testsurus() {   String art;
        double testhız=0,artıs;
        
        System.out.println("Test Sürüşüne Çıkılıyor ...");

        do {
        System.out.println("Hızı Arttırmak için '+' Tuşuna basınız");
        System.out.println("Hızı Azaltmak  için '-' Tuşuna basınız");
        System.out.println("Testi Bitirmek için '0' Tuşuna Basınız");
         art=scan.next();    
            if (art.equals("0")) {
                break;      
            }
         System.out.println("Hız Miktarını Giriniz");
        artıs=scan.nextDouble();
         if (art.equals("+"))
        {
            testhız+=artıs;
            System.out.println("Yeni Hızınız : "+testhız);
            System.out.println("----------------------------");
        }
        if (art.equals("-"))
        {
            testhız-=artıs;
            System.out.println("Yeni Hızınız : "+testhız);
             System.out.println("----------------------------");
        }
        } while (true);
        
        if (art.equals("0"))
        {
            System.out.println("Test Bitmiştir Umarım Hoşunuza Gitmiştir...");
            do {  
                System.out.println("Satın Alma Menüsüne Gitmek  İsterseniz 'B' Tuşuna Basınız");
                System.out.println("Vazgeçti iseniz  'E' Tuşuna Basınız");
                kontrol=scan.next();             
                if (kontrol.equals("e")) 
            {
                break;
            }
            if (kontrol.equals("b")) 
            {
                break;
            }
                
            } while (true);
            if (kontrol.equals("e")) 
            {
                System.out.println("İyi Günler Dileriz ...");
            }
            if (kontrol.equals("b")) 
            {
                satınal();
            }
        }
    }
    public void satınal() {
        System.out.println("Öncelikle Bütcenizi Öğrenmem Gerekiyor ");
        double bakiye=scan.nextDouble();
        
       
        do {   
             System.out.println("Satın Almak İçin 'B' Buşunza Basınız ");
            System.out.println("İptal Etmek İçin 'E' Buşunza Basınız ");
            kontrol=scan.next();
            if (kontrol.equals("e"))
            {
                break;
            }
            if (kontrol.equals("b"))
            {
                break;
            }
            

        } while (true);
        
         if (kontrol.equals("b"))
        {
            if (bakiye>0 && bakiye>=this.fıyat) {
                System.out.println("Satın Alım işlemi Tamamlanmıştır");
                bakiye=bakiye-this.fıyat;
                System.out.println("Yeni Bütçeniz : "+bakiye);
                System.out.println("İyi Günler Dileriz Efendim...");
                
            }
            else 
            {
                System.out.println("Yeterli Bütçeniz Bulunmamakta");
                System.out.println("İyi Günler Dileriz");
            }
        }
        if (kontrol.equals("e"))
        {
            System.out.println("İyi Günler Dileriz");
        }
    }
    public void bilgigoster()
    {
          //  System.out.println(getTur());
        System.err.println(getMarka()+" Marka "+getModel()+" Model Aracın Bilgileri");
        System.err.println(getMotorguc()+" Motor Gücü");
        System.err.println(getSilindir()+" Silindir");
        System.err.println(getHız()+" Max hız");
        System.err.println(getFıyat()+"Fiyat");     
        do { 
            System.out.println("Test Sürüşüne Çıkmak İsterseniz 'T' Tuşuna Basınız");
            System.out.println("Satın Alma Menüsüne Gitmek İsterseniz 'B' Tuşuna Basınız");
            gosterkontrol=scan.nextLine();
            if (gosterkontrol.equals("b"))
        {
             testb=false;
        }
         if (gosterkontrol.equals("t"))
        {
             testb=false;
        }
        } while (testb==true);
        if (gosterkontrol.equals("b"))
        {
             satınal();
        }
         if (gosterkontrol.equals("t"))
        {
             testsurus();
        }
        
        
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
    
    public double getMotorguc() {
        return Motorguc;
    }
    public void setMotorguc(double Motorguc) {
        this.Motorguc = Motorguc;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public double getSilindir() {
        return silindir;
    }
    public void setSilindir(double silindir) {
        this.silindir = silindir;
    }
    public double getHız() {
        return hız;
    }
    public void setHız(double hız) {
        this.hız = hız;
    }
    public double getFıyat() {
        return fıyat;
    }
    public void setFıyat(int fıyat) {
        this.fıyat = fıyat;
    } 
}

