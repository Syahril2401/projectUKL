/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpus;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
        //Atribut
public class Siswa implements User { //implements dari method kosong 
   private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>(); // enkapsulasi 
        
    public Siswa(){
        this.namaSiswa.add("Budi"); //merujuk pada class ini diluar method
        this.alamat.add("Malang");
        this.telepon.add("08123456789");
        this.status.add(true);
        
        
        this.namaSiswa.add("Ajeng");
        this.alamat.add("Semarang");
        this.telepon.add("0813546879");
        this.status.add(true);
        
        this.namaSiswa.add("Sugeng");
        this.alamat.add("Jombang");
        this.telepon.add("0813546879");
        this.status.add(true);
        
    }
    @Override //menimpa method dari parent class
    public void setNama(String nama) { // mengisi data
        this.namaSiswa.add(nama);
    }
    @Override 
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override 
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override 
    public String getNama(int id) {  // mendapatkan data
        return this.namaSiswa.get(id);
    }
    @Override 
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }
    @Override 
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void setStatus(int id, boolean status){
        this.status.set(id, status);
    }
    public boolean getStataus(int id){
        return this.status.get(id);
    }
    
    public void tampilkanSiswa(){
        int n = this.namaSiswa.size();
        for(int i = 0;i<n;i++){
            System.out.println("--------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
        
    }  
}
