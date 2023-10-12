/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.child;

import com.parent.KlinikKecantikan;

public class Pelayanan extends KlinikKecantikan {

    public Pelayanan(String nama, String dokter, String ruangan, String harga) {
        super(nama, dokter, ruangan, harga);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pelayanan: " + getNama());
        System.out.println("Nama Dokter   : " + getDokter());
        System.out.println("Nomor Ruangan : " + getRuangan());
        System.out.println("Harga         : " + getHarga());
    }
}
