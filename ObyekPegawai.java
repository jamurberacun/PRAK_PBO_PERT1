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

class Pegawai {
    
    //atribut variabel
    int id;
    String nama;
    String jenisKelamin;

    //method setPegawai
    public void setPegawai (int id,String nama,String jenisKelamin)
    {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    
    //method tampil
    public void tampil()
    {
        System.out.println("No.ID Pegawai : "+id);
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
    }
}

public class ObyekPegawai {

    public static void main(String[] args) {
        
      //objek pegawai1
      Pegawai pegawai1 = new Pegawai();
      pegawai1.setPegawai(001,"Budi","pria");
      pegawai1.tampil();
      
      //objek pegawai2
      Pegawai pegawai2 = new Pegawai();
      pegawai2.setPegawai(004,"Siti","wanita");
      pegawai2.tampil();
      
      //objek pegawai3
      Pegawai pegawai3 = new Pegawai();
      pegawai3.setPegawai(007,"Rudy","pria");
      pegawai3.tampil();
    }
    
}
