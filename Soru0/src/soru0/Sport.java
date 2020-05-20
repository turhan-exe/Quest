
package soru0;

import java.util.Scanner;

public class Sport extends Araba{
    
    public Sport(double Motorguc, String marka, String Model, double silindir, int fiyat) {
        super(Motorguc, marka, Model, silindir, fiyat);
        this.hız=hız*2;
    }

    @Override
    public void testsurus() {
        
        //super.setTur("Spor Araba Atıyorsanız Doğru Yerdesiniz");
        super.testsurus(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public boolean isTestb() {
        return testb;
    }
    public void setTestb(boolean testb) {
        this.testb = testb;
    }
    public String getKontrol() {
        return kontrol;
    }
    public void setKontrol(String kontrol) {
        this.kontrol = kontrol;
    }
    public String getGosterkontrol() {
        return gosterkontrol;
    }
    public void setGosterkontrol(String gosterkontrol) {
        this.gosterkontrol = gosterkontrol;
    }
    public Scanner getScan() {
        return scan;
    }
    public void setScan(Scanner scan) {
        this.scan = scan;
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
