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
public class Peminjaman {
    int id_peminjaman,id_barang,id_laboran,id_member,lama_peminjaman,fee;
    Date tgl_peminjaman,tgl_pengembalian;
    public Peminjaman(int id_peminjaman,int id_barang,int id_laboran,int id_member,int lama_peminjaman,int fee,Date tgl_peminjaman,Date tgl_pengembalian){
        this.id_peminjaman=id_peminjaman;
        this.id_barang=id_barang;
        this.id_member=id_member;
        this.lama_peminjaman=lama_peminjaman;
        this.fee=fee;
        this.tgl_peminjaman=tgl_peminjaman;
        this.tgl_pengembalian=tgl_pengembalian;
       
    }
    public int getId(){
        return id_peminjaman;
    }
}
