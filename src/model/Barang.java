/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Barang {
    public int id_barang,harga,depresiasi;
    public String nama_barang,deskripsi;
    Date tgl_masuk;
    
    public Barang(int id_barang,String nama_barang,int harga,int depresiasi,String deskripsi,Date tgl_masuk){
        this.id_barang=id_barang;
        this.nama_barang=nama_barang;
        this.depresiasi=depresiasi;
        this.deskripsi=deskripsi;
        this.harga=harga;
        this.tgl_masuk=tgl_masuk;
    }
    public int getId(){
        return id_barang;
    }
}
