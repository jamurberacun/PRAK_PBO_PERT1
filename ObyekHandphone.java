/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A'la
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A'la
 */

class Handphone {
    String merk;
    int harga;
    String tipe;

    public void setHandphone (String merk, int harga, String tipe)
    {
        this.merk = merk;
        this.harga = harga;
        this.tipe = tipe;
    }
    
    public void tampil()
    {
        System.out.println("Merk Handphone : "+merk);
        System.out.println("Harga Handphone : "+harga);
        System.out.println("Tipe Handphone : "+tipe);
    }
}

public class ObyekHandphone {

    public static void main(String[] args) {
      Handphone hp = new Handphone();
      
      hp.setHandphone("Iphone",15000000,"IphoneXSMAX");
      hp.tampil();
      
      hp.setHandphone("Samsung",17000000,"GalaxyS12Ultra");
      hp.tampil();
      
      hp.setHandphone("Xiaomi",8000000,"Mi10TPro");
      hp.tampil();
    }
    
}

