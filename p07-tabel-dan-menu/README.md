- Eksperimen 5:
    1. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu
    tambah kontak baru. Apakah tabel langsung berubah?
    2. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata
    "ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi?
    3. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka,
    coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan?
    4. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?
    5. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di
    initComponents()?
    6. Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan mengapa?
    ---
    Jawab:
    1. Table langsung berubah.
    2. `Budi Santoso`.
    3. Dialog tak terfokus lagi, pindah ke jendela utama.
    4. Karena fokus ke modal (yes) dia block user input, dokumentasi: > `modal - specifies whether dialog blocks user input to other top-level windows when shown. If true, the modality type property is set to DEFAULT_MODALITY_TYPE, otherwise the dialog is modeless `

    5. Baris fungsi `setAccelerator`
        ```java
        // Masih CTRL + D
        hapusItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
       
        // Saat berubah menjadi delete
        hapusItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        ```
    6. Pesan error: `java.lang.IllegalArgumentException: Cannot set a null TableModel`.<br>
       Alasan: Karena `kontakTable.setModel(model);` yang ada di `initComponents()` manggil tapi `model = new KontakTableModel();` baru terisi setelah `initComponents()` yang akhirnya si `kontakTable` ngebaca variable `model` itu yang masih belum terisi yang akhirnya **null**.