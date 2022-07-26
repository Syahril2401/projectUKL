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
public class Buku {
   private ArrayList<String> namaBuku = new ArrayList<String>();  //properti
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public int size(){
        return this.namaBuku.size();
    }
    
    public Buku(){
        this.namaBuku.add("Matematika");
        this.stok.add(10);
        this.harga.add(30000);
        
        this.namaBuku.add("Bahasa Jawa");
        this.stok.add(30);
        this.harga.add(25000);
        
        this.namaBuku.add("Bahasa Arab");
        this.stok.add(30);
        this.harga.add(20000);
    }
    
    public String getNama(int id){
        return this.namaBuku.get(id);
    }
    public int getStok(int id){
        return this.stok.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public void setNama(String nama){
        this.namaBuku.add(nama);
    }
    public void setStok(int id, int stok){
        this.stok.set(id, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void tampilkanBuku(){
        int n = this.namaBuku.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Judul = "+getNama(i));
            System.out.println("Stok = "+getStok(i));
            System.out.println("Harga = "+getHarga(i));
        }
    }
}
