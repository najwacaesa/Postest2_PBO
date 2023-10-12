/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parent;

public abstract class KlinikKecantikan {
    protected String nama;
    protected String dokter;
    protected String ruangan;
    protected String harga;

    public KlinikKecantikan(String nama, String Dokter, String Ruangan, String Harga) {
        this.nama = nama;
        this.dokter = Dokter;
        this.ruangan = Ruangan;
        this.harga = Harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String Dokter) {
        this.dokter = Dokter;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String Ruangan) {
        this.ruangan = Ruangan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String Harga) {
        this.harga = Harga;
    }

    // Metode abstrak untuk menampilkan informasi klinik
    public abstract void tampilkanInfo();


}    
