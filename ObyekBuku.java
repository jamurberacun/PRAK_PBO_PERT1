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
    String judul;
    int harga;
    int halaman;

    public void setBuku (String judul, int harga, int halaman)
    {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }
    
    public void tampil()
    {
        System.out.println("Judul Buku : "+judul);
        System.out.println("Harga Buku : "+harga);
        System.out.println("Halaman Buku : "+halaman);
    }
}

public class ObyekBuku {

    public static void main(String[] args) {
      Buku bukul = new Buku();
      
      bukul.setBuku("PBO",75000,200);
      bukul.tampil();
      
      bukul.setBuku("Prak_PBO",95000,230);
      bukul.tampil();
      
      bukul.setBuku("Keamanan_Sistem",80000,200);
      bukul.tampil();
    }
    
}
