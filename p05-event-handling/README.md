- Tabel pengamatan Praktikum 2 yang sudah diisi;
    | No | Tindakan                                  | Event yang tercatat |
    |----|-------------------------------------------|---------------------|
    | 1  | Arahkan kursor ke tombol, lalu jauhkan    | MouseEvent  |
    | 2  | Klik tombol Klik saya                     | ActionEvent |
    | 3  | Centang lalu hapus centang Aktifkan fitur | ItemEvent   |
    | 4  | Ganti pilihan dari Pagi menjadi Malam     | ItemEvent   |
    | 5  | Klik isian, lalu ketik kata "abc"         | FocusEvent & KeyEvent |
    | 6  | Klik tombol setelah mengetik di isian     | MouseEvent & FocusEvent & ActionEvent |
- Jawaban eksperimen Praktikum 3 dan Praktikum 4;
    - Praktikum 3
        1. Hapus pemeriksaan if (evt.getStateChange() == ItemEvent.SELECTED) dan tambahkan
        System.out.println("item berubah"); di dalam event handler. Berapa kali pesan tercetak setiap
        pilihan diganti?
        2. Di jendela Properties bagian Events, kosongkan event keyReleased pada celsiusField, lalu buat event
        keyPressed yang memanggil konversi(). Mengapa hasil yang tampil terlambat satu karakter?
        3. Hapus blok try dan catch di method konversi, lalu ketik huruf pada isian. Apa yang muncul di jendela
        Output?
        ---
        Jawab:
        1. 2 pesan.
        2. Karena ketika tombol input masuk, event `KeyPressed` langsung masuk sangat cepat (Frame), nilai yang diinput pun akhirnya tak sempat dibaca oleh variable `teks` dan nilai pun kosong, akhirnya nilai baru kebaca setelahnya. 
        3. Error message muncul di console `Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: "t"`
        ---
    - Praktikum 4
        1. Buat event actionPerformed untuk kaliButton melalui Events tanpa menghapus lambda di konstruktor, lalu
        tambahkan System.out.println("kali"); di kedua tempat. Berapa kali pesan tercetak? Mengapa satu
        tombol sebaiknya hanya memakai satu cara?
        2. Tambahkan tombol % untuk sisa bagi (modulus). Apa saja yang diubah di tab Design dan di tab Source?
        3. Tekan tombol Hapus. Mengapa kursor langsung berada di isian pertama?

        ---
        Jawab:
        1. **2 pesan**, satu tombol 1 cara agar lebih expected outputnya dan tidak boros. Misal make lebih 2 cara dan di masa depan nanti yang 1 cara itu beda formula nya, maka kita bakal tak sadar output nya berubah (tertimpa) tak sesuai harapan :)
        2. di `tab Design` nambah button `modulusButton` teks nya '%' di sebelah button '/', kemudian actionPerformed `modulusButtonActionPerformed` isinya `hitung('%');`. Dan isi function `hitung()` nya update sedikit menjadi:
            ```java
            double hasil = switch (operator) {
                case '+' -> a + b;
                case '-' -> a - b;
                case 'x' -> a * b;
                case '/' -> a / b;
                default  -> a % b;
            };
            ``` 
        3. Karena button hapus listen aksi function `hapus()` dan isinya terdapat line kode `angka1Field.requestFocusInWindow();` yang mana di dokumentasi kodenya menjelaskan itu akan membuat fokus ke komponen tersebut.
        ---

- Peta event pada FormAnggotaPerpustakaan;

    | Komponen                  | Menu Events                | Aksi                                                                      |
    |---------------------------|----------------------------|---------------------------------------------------------------------------|
    | Kotak centang setuju      | Item: itemStateChanged     | Tombol Daftar hanya aktif jika dicentang                                  |
    | Tombol Batal              | Action: actionPerformed    | Kosongkan semua isian dan kembalikan fokus ke NPM                         |
    | Tombol Daftar             | Action: actionPerformed    | Tampilkan ringkasan data dengan `JOptionPane`                             |
    | Isian NPM                 | Key: keyReleased           | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit"          |
    | Form (JFrame di Navigator)| Window: windowClosing      | Minta konfirmasi sebelum aplikasi ditutup                                 |

- Tangkapan layar jendela Properties bagian Events untuk tombol Daftar;

- Tangkapan layar dialog ringkasan;

- Tangkapan layar dialog konfirmasi keluar;

- Deklarasi penggunaan AI: alat yang dipakai dan untuk keperluan apa, atau pernyataan tidak memakai AI.
    - Template table README (males ngetik :))
