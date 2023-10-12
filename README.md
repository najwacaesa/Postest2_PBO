# Laporan Postest 2 Praktikum PBO

**Nama   : Najwa Caesa Putri Ramadhania Suharizman Poerwo**
**NIM    : 2209116046**
**Kelas  : Sistem Informasi A 2022**
**Matkul : Pemograman Berorientasi Objek**

**Dokumentasi dan Penejelasan Source Code**
1. Main Class
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/e1da69b3-6385-4a2f-83ca-1265ace4e4bc)
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/9a548e69-89a2-4aa6-946d-9d02bc051cf0)
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/70226151-b9b1-4924-9d2c-ab2c9f49ebe1)
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/e1cd9cd4-9e7e-4152-a45a-2a0202a35f7b)
   Class ini berada pada package "com.main", nama class ini adalah "Klinik_Kecantikan" yang merupakan  main class pada program ini. Pada line 7 dan 8 merupakan syntax untuk memanggil Class pada paket tersebut. Lalu, pada line 10 dan 11 berfungsi untuk mengimport ArrayList dan Scanner yang akan kita gunakan pada main class ini.
   
   Kemudian ada keyword "new" yang digunakan untuk membuat objek baru, yaitu objek DaftarPelayanan. Terdapat juga perulangan (looping) menggunakan "while (true)". Setelah itu, terdapat method untuk mengprint menu yang akan ditampilkan di output. Terdapat juga Property "pilihan" yang menggunakan scanner agar dapat menginput pilihan pada menu.

   Terdapat 5 menu yaitu Tambah, Tampilkan, Hapus, Update, dan keluar. Agar proses tersebut dapat digunakan atau dijalankan maka digunakan switch yang dimana terdapat nama variabel yang akan diperiksa, serta 1 atau lebih perintah case untuk setiap nilai yang akan diperiksa. Case pertama yaitu tambah pelayanan, yang terdapat property lagi yang memliki parameter sesuai yang diinput. Case 2 berfungsi untuk menampilkan pelayanan yang sudah ditambahkan sebelumnya, case 3 berfungsi untuk mengupdatepelayanan, case 4 berfungsi untuk menghapus pelayanan, dan case 5 apabila user ingin keluar dari program.

Selanjutnya terdapat static class DaftarPelayanan dan dilanjutkan dengan keyword final yang berfungsi agar property tidak dapat diubah isinya dan juga terdapat yntax pembuatan Arraylist. Selanjutnya terdapat 5 method yaitu tambah, tampilkan, hapus, dan update.  Yang dimana bebrapa variabel nya diimport dari class lain.

2. Class KlinikKecantikan
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/30b9a542-af5a-4308-8167-a3e21f8cad5f)
![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/ebc470e5-ac2e-46b2-8fbe-f0f78febf5d9)

   Class KlinikKecantikan ini berada pada package com.parent. Pertama terdapat kelas abstrak yang berisi property nama, dokter, ruang, dan harga dengan tipe data string. Selanjutnya, terdapat KlinikKecantikan yang memiliki parameter ( String nama, String Dokter, String Ruangan, String Harga) yang memiliki property yang menggunakan keyword this. Pada class ini juga terdapat penerapan dari setter dan getter seperti yang terlihat pada gambar diatas. Dan pada line terakhir terdapat kelas abstrak yang digunakan untuk menampilkan informasi klinik.


3. Class Pelayanan
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/a3b2ef9c-8157-4d27-b406-4a3907ca980b)

   Class ini terdapat pada package com.child. Pertama-tama terdapat syntax untukmeng import kelas KlinikKecantikan yang berada pada package com.parent. Selanjutnya terdapat keyword extends yang digunakan agar kelas-kelas tersebut dapat mewarisi property dan method dari kelas yang diinginkan. Terdapat Metod dengan nama Pelayanan yang memiliki beberapa parameter. Pada class ini digunakan overriding yang terjadi ketika kelas turunan (subclass) mempunyai method yang sama seperti kelas yang diwarisinya (superclass) namun dengan mekanisme yang berbeda. Lalu yang terakhir terdapat method untuk menampilkan info klinik.




**Dokumentasi dan penjelasan output**
1. Tambah Pelayanan
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/5fbf7e4a-43b9-4fb2-93b3-92dc8b25de6c)

   Tampilan pertama saat program di run yaitu adalah tampilan menu yang akan kita pilih sesuai dengan keinginan. Pada menu no 1 atau menu tambah pelayanan, user diminta untuk menginput beberapa data yang dibutuhkan seperti nama pelayanan, nama dokter, nama ruangan , dan harga. Setelah itu maka pelayanan telah ditambahkan.


3. Tampilkan Pelayanan
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/f099206b-ce82-4f2b-99b2-b3740bc08e24)

   Untuk melihat apakah menu sudah ditambah, diupdate, ataupun dihapus, user dapat menekan angka 2 atau "tampilkan pelayanan". Yang dimana menu ini akan menampilkan data-data pelayanan yang telah di input.

5. Update Pelayanan
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/12c8241a-1616-49f9-9f7d-8201684d4df8)

   Apabila user ingin mengupdate data pelayanan, maka user dapat memilih menu "update pelayanan". Pada menu ini user akan diminta memasukkan kembali data-data terbaru seperti nama, dokter, ruangan, dan harga yang terbaru yang ada pada klinik tersebut.

7. Hapus Pelayanan
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/ee43d43f-b01b-44d0-8895-696bdd24a650)

   Lalu, jika ingin menghapus layanan yang sebelumnya sudah ditambahkan maka bisa memilih menu ketiga yaitu "hapus pelayanan", dimana user akan diminta memasukkan nama pelayanan yang akan dihapus. Setelah itu pelayanan akan otomatis terhapus.

9. Keluar
   ![image](https://github.com/najwacaesa/Postest2_PBO/assets/121982112/df46a71b-50bd-4b5e-9b08-f272732d6588)

   Jika user telah selesai atau ingin keluar dari program, user dapat memilih no 5 "keluar" yang membuat program otomatis berhenti.




   




