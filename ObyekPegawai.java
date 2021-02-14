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
    int id;
    String nama;
    String jenisKelamin;

    public void setPegawai (int id,String nama,String jenisKelamin)
    {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void tampil()
    {
        System.out.println("No.ID Pegawai : "+id);
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
    }
}

public class ObyekPegawai {

    public static void main(String[] args) {
      Pegawai pgw = new Pegawai();
      
      pgw.setPegawai(001,"Budi","pria");
      pgw.tampil();
      
      pgw.setPegawai(004,"Siti","wanita");
      pgw.tampil();
      
      pgw.setPegawai(007,"Rudy","pria");
      pgw.tampil();
    }
    
}
