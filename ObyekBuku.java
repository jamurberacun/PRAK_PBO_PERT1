/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A'la
 */

class Buku {
    
    //atribut variabel
    String judul;
    int harga;
    int halaman;

    //method setBuku
    public void setBuku (String judul, int harga, int halaman)
    {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }
    
    //method tampil
    public void tampil()
    {
        System.out.println("Judul Buku : "+judul);
        System.out.println("Harga Buku : "+harga);
        System.out.println("Halaman Buku : "+halaman);
    }
}

public class ObyekBuku {

    public static void main(String[] args) {
        
     //objek buku1   
      Buku buku1 = new Buku();
      buku1.setBuku("PBO",75000,200);
      buku1.tampil();
      
      //objek buku2
      Buku buku2 = new Buku();
      buku2.setBuku("Prak_PBO",85000,350);
      buku2.tampil();
      
      //objek buku3
      Buku buku3 = new Buku();
      buku3.setBuku("Keamanan_Sistem",70000,250);
      buku3.tampil();
      
    }
    
}
