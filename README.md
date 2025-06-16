# Proyek Sistem Informasi Perpustakaan Desktop

## Pendahuluan

Repositori ini berisi kode sumber untuk aplikasi sistem informasi perpustakaan berbasis desktop. Aplikasi ini dirancang untuk memfasilitasi pengelolaan dan pencarian koleksi buku, dengan kemampuan untuk memfilter dan mengurutkan berdasarkan berbagai kriteria.

## Fitur Utama

  * **Pencarian Buku**: Memungkinkan pengguna untuk mencari buku berdasarkan kata kunci pada judul.
  * **Filter Berdasarkan Genre**: Menyediakan fungsionalitas untuk menyaring koleksi buku berdasarkan genre tertentu.
  * **Pengurutan Berdasarkan Rating**: Memungkinkan pengguna untuk mengurutkan buku berdasarkan rating, dari tertinggi ke terendah atau sebaliknya.
  * **Tampilan Detail Buku**: Menampilkan informasi rinci untuk setiap buku dalam koleksi.
  * **Manajemen Data Berbasis JSON**: Data buku disimpan dan dikelola dalam format JSON (`books.json`), memungkinkan fleksibilitas dalam penambahan dan modifikasi data.

## Struktur Proyek

Proyek ini diorganisir dengan struktur sebagai berikut:

  * `.idea/`: Direktori konfigurasi proyek IntelliJ IDEA.
  * `Book.java`: Kelas model yang merepresentasikan entitas buku, berisi atribut seperti judul, penulis, genre, rating, dll.
  * `BookDAO.java`: Objek Akses Data (DAO) yang bertanggung jawab untuk interaksi dengan sumber data buku (file `books.json`). Kelas ini mengelola operasi CRUD (Create, Read, Update, Delete) untuk data buku.
  * `BookSearchGUI.java`: Kelas yang bertanggung jawab untuk antarmuka pengguna grafis (GUI) aplikasi. Ini mencakup elemen visual dan logika interaksi pengguna untuk pencarian, filter, dan tampilan buku.
  * `BookService.java`: Kelas layanan yang mengimplementasikan logika bisnis aplikasi, seperti pemrosesan pencarian, filter, dan pengurutan buku. Kelas ini berinteraksi dengan `BookDAO` untuk mendapatkan data.
  * `BukuSD.iml`: File modul IntelliJ IDEA.
  * `books.json`: File JSON yang berfungsi sebagai basis data untuk menyimpan data koleksi buku.

## Teknologi yang Digunakan

  * **Bahasa Pemrograman**: Java
  * **IDE**: IntelliJ IDEA (Direkomendasikan)

## Persyaratan Sistem

  * Java Development Kit (JDK) versi 8 atau yang lebih baru.

## Panduan Instalasi dan Penggunaan

Untuk menjalankan aplikasi ini di lingkungan lokal Anda, ikuti langkah-langkah berikut:

1.  **Kloning Repositori**:

    ```bash
    git clone https://github.com/Zekken23/bareng.git
    cd bareng
    ```

2.  **Buka Proyek di IntelliJ IDEA**:

      * Buka IntelliJ IDEA.
      * Pilih `File` \> `Open` dan navigasikan ke direktori `bareng` yang baru saja Anda kloning.
      * IntelliJ IDEA akan secara otomatis mengimpor proyek dan mengunduh dependensi yang diperlukan (jika ada).

3.  **Jalankan Aplikasi**:

      * Navigasikan ke file `BookSearchGUI.java` di panel Project.
      * Klik kanan pada `BookSearchGUI.java` dan pilih `Run 'BookSearchGUI.main()'`.
      * Aplikasi perpustakaan desktop akan terbuka di layar Anda.

## Kontribusi

Kontribusi terhadap proyek ini sangat dihargai. Jika Anda ingin berkontribusi, mohon ikuti langkah-langkah berikut:

1.  Fork repositori ini.
2.  Buat branch baru untuk fitur atau perbaikan Anda (`git checkout -b feature/nama-fitur-anda` atau `bugfix/perbaikan-bug`).
3.  Lakukan perubahan yang diperlukan dan pastikan kode Anda bersih dan terdokumentasi dengan baik.
4.  Commit perubahan Anda (`git commit -m 'Deskripsi singkat perubahan'`).
5.  Push branch Anda ke repositori forked Anda (`git push origin feature/nama-fitur-anda`).
6.  Buka Pull Request ke repositori utama, jelaskan perubahan yang Anda buat, dan mengapa itu diperlukan.

## Lisensi

Proyek ini dilisensikan di bawah [Nama Lisensi Anda, contoh: Lisensi MIT]. Silakan lihat file `LICENSE` (jika tersedia) untuk detail lebih lanjut.

## Kontak

Untuk pertanyaan atau informasi lebih lanjut, silakan hubungi:

  * **Pengembang**: Zekken23 , Naaeuu, Fadhil
  * **GitHub**: [https://github.com/Zekken23](https://www.google.com/search?q=https://github.com/Zekken23)
