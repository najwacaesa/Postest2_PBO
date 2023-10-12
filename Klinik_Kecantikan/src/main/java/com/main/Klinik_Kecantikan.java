/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.main;

import com.child.Klinik;
import com.parent.KlinikKecantikan;

import java.util.ArrayList;
import java.util.Scanner;

public class Klinik_Kecantikan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarPelayanan daftarpelayanan = new DaftarPelayanan();

        while (true) {
            System.out.println("============= MENU =============");
            System.out.println("1. Tambah Pelayanan            |");
            System.out.println("2. Tampilkan Semua Pelayanan   |");
            System.out.println("3. Update Pelayanan            |");
            System.out.println("4. Hapus Pelayanan             |");
            System.out.println("5. Keluar                      |");
            System.out.println("================================");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pelayanan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nama Dokter   : ");
                    String dokter = scanner.nextLine();
                    System.out.print("Nama Ruangan  : ");
                    String ruangan = scanner.nextLine();
                    System.out.print("Harga         : ");
                    String harga = scanner.nextLine();

                    Klinik klinik = new Klinik(nama, dokter, ruangan, harga);
                    daftarpelayanan.tambahPelayanan(klinik);
                    break;

                case 2:
                    daftarpelayanan.tampilkanSemuaPelayanan();
                    break;

                case 3:
                    System.out.print("Masukkan nama pelayanan yang ingin di update : ");
                    String namaUpdate = scanner.nextLine();
                    daftarpelayanan.updatePelayanan(namaUpdate);
                    break;

                case 4:
                    System.out.print("Nama Pelayanan yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    daftarpelayanan.hapusPelayanan(namaHapus);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
    static class DaftarPelayanan {
        final Scanner input = new Scanner(System.in);
        final private ArrayList<KlinikKecantikan> daftarpelayanan = new ArrayList<>();

        // Menambah klinik ke daftar
        public void tambahPelayanan(KlinikKecantikan klinik) {
            daftarpelayanan.add(klinik);
            System.out.println("Klinik ditambahkan.");
        }

        // Menampilkan semua klinik dalam daftar
        public void tampilkanSemuaPelayanan() {
            if (daftarpelayanan.isEmpty()) {
                System.out.println("Tidak ada pelayanan dalam daftar.");
            } else {
                for (KlinikKecantikan klinik : daftarpelayanan) {
                    System.out.println("\n====================");
                    klinik.tampilkanInfo();
                    System.out.println("====================");
                }
            }
        }

        // Menghapus klinik dari daftar berdasarkan nama
        public void hapusPelayanan(String nama) {
            for (KlinikKecantikan klinik : daftarpelayanan) {
                if (klinik.getNama().equalsIgnoreCase(nama)) {
                    daftarpelayanan.remove(klinik);
                    System.out.println("Pelayanan " + nama + " dihapus.");
                    return;
                }
            }
            System.out.println("Klinik " + nama + " tidak ditemukan.");
        }

        public void updatePelayanan(String nama){
            for (KlinikKecantikan klinik: daftarpelayanan) {
                if (klinik.getNama().equalsIgnoreCase(nama)){
                    System.out.print("Masukkan nama pelayanan baru : ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan dokter baru         : ");
                    String dokterbaru = input.nextLine();
                    System.out.print("Masukkan nnama ruangan baru  : ");
                    String ruanganbaru = input.nextLine();
                    System.out.print("Masukkan harga baru          : ");
                    String hargabaru = input.nextLine();
                    klinik.setDokter(dokterbaru);
                    klinik.setNama(namaBaru);
                    klinik.setHarga(ruanganbaru);
                    klinik.setHarga(hargabaru);
                }else{
                    System.out.println("Klinik " + nama + " tidak ditemukan.");
                }
            }
        }
    }
}
