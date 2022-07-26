/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpus;

/**
 *
 * @author LENOVO
 */
public interface User {     //Interface adalah blue print dari class. Isi method-nya kosong dan nanti akan diimplementasikan pada class lain.
    
    public void setNama(String nama);
    public void setAlamat(String Alamat);
    public void setTelepon(String Telepon);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
    
}
    