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
    
    //atribut variabel
    String merk;
    int harga;
    String tipe;

    //method setHandphone
    public void setHandphone (String merk, String tipe, int harga)
    {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    //method tampil
    public void tampil()
    {
        System.out.println("Merk Handphone : "+merk);
        System.out.println("Harga Handphone : "+tipe);
        System.out.println("Tipe Handphone : "+harga);
    }
}

public class ObyekHandphone {

    public static void main(String[] args) {
      
      //objek hp1
      Handphone hp1 = new Handphone();
      hp1.setHandphone("Iphone","IphoneXSMAX",15000000);
      hp1.tampil();
      
      //objek hp2
      Handphone hp2 = new Handphone();
      hp2.setHandphone("Samsung","GalaxyS12Ultra",17000000);
      hp2.tampil();
      
      //objek hp3
      Handphone hp3 = new Handphone();
      hp3.setHandphone("Xiaomi","Mi10TPro",8000000);
      hp3.tampil();
    }
    
}

