- Jawaban pertanyaan refleksi pada bagian G;
    1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari? = Tidak menyesuaikan jendela, teks bisa terpotong, dan absolute layout perlu library.
    2. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan. = Kalo `Flowlayout` dilebarkan dia mengisi kekanan / berderet si konten kalo masih muat (tidak berubah nilai component si konten). Kalo `GridLayout` dia sel menyesuaikan grid yang diberikan (lebar) dan bisa expand lebar kalo ditarik dan dynamic width nya. 
    3. Apa fungsi Weight X dan Fill pada constraint GridBagLayout? = Weight X itu pembagian sisa lebar, Fill itu komponen memenuhi sel (horizontal).
    4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North? = agar baris form tetap di atas.
    5. Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya. = Keselarasan (Biru) dan Kedekatan (oranye).
    
        <img src="https://github.com/Zulfy-UNISKA/pbo2-2410010331/blob/main/p04-layout-manager/G5%20Refleksi.png?raw=true" alt="Refleksi Bagian G no 5" width="400">


- Foto sketsa form dan tabel rancangan

    <img src="https://github.com/Zulfy-UNISKA/pbo2-2410010331/blob/main/p04-layout-manager/desain%20kertas.jpeg?raw=true" alt="Sketsa form anggota perpustakaan" width="350">
    <img src="https://github.com/Zulfy-UNISKA/pbo2-2410010331/blob/main/p04-layout-manager/desain%20kertas%20(digital).jpeg?raw=true" alt="Sketsa form anggota perpustakaan (digital)" width="350">
    
    | Bagian | Panel | Layout |
    |---|---|---|
    | Jendela | JFrame | BorderLayout |
    | Header (North) | headerPanel | BoxLayout, Y Axis |
    | Isi form (Center) | isiPanel | BorderLayout |
    | Isi form (North di isiPanel) | formPanel | GridBagLayout |
    | Tombol (South) | tombolPanel | FlowLayout, Right |
- Dua tangkapan layar (screenshot) FormAnggotaPerpustakaan saat dijalankan: ukuran awal dan saat dilebarkan.
    <img src="https://github.com/Zulfy-UNISKA/pbo2-2410010331/blob/main/p04-layout-manager/formAnggotaPerpus%20Awal.png?raw=true" alt="Design awal" width="500">
    <img src="https://github.com/Zulfy-UNISKA/pbo2-2410010331/blob/main/p04-layout-manager/formAnggotaPerpus%20Lebar.png?raw=true" alt="Design dilebarkan" width="500">

- Satu tangkapan layar (screenshot) tab Design FormAnggotaPerpustakaan yang memperlihatkan susunan panel dan layout di jendela Navigator.

    <img src="https://github.com/Zulfy-UNISKA/pbo2-2410010331/blob/main/p04-layout-manager/design%20panel%20layout.png?raw=true" alt="Susunan Panel Layout Full dengan desain." width="500">

- Jawaban eksperimen Praktikum 2 dan Praktikum 4, serta saran dari teman pada Tahap 4.
    - Eksperimen (Praktikum 2):
        1. ___Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris
        mana di initComponents() yang ikut berubah?___ = Komponen yang tidak muat berpindah ke bawah dan align ke tengah, tidak ke kiri awal.
        `flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 8));`
        2. ___Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?___ = 2 Kolom 9 baris, bisa kalo tidak specify baris (Rows) maka bisa membagi 2 kolom / berapa komponen tersisa pindah saja ke bawah (Fleksibel).
        3. ___Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
        tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers di
        antara tombol.___ = Lebar tombol sekarang memenuhi sampai ke kanan JFrame, saat menambahkan `Vertical Strut` diantara tombol (nilai 12), dia menciptakan gap diantara tombol tersebut dan menjadi enak dipandang.
    - Eksperimen (Praktikum 4):
        1. ___Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?___ = Tetap mengikuti melebar ke kanan.
        2. ___Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa
        perbedaannya?___ = `formPanel` nya menjadi ke tengah , tidak lagi di atas.
        3. ___Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian
        mana yang rusak lebih dulu?___ = bagian `formPanel` jadi tertutup, terus `headerPanel` tertutup dan terakhir bagian `tombolPanel` tak terlihat. sampai tersisa `judul JFrame title saja dengan windows`.
    - Saran dari teman (Tahap 4): (Yang diperiksa: Muhammad Diva Saputra)
        | No | Pemeriksaan | Status |
        |----|-------------|--------|
        | 1 | Label singkat, jelas, dan sejajar | Ya |
        | 2 | Isian dikelompokkan dengan judul bagian | Ya |
        | 3 | Placeholder dipakai untuk isian yang punya format | Ya |
        | 4 | Komponen sesuai jenis data | Ya |
        | 5 | Tombol utama menonjol dan berada di kanan bawah | Ya |
        | 6 | Jarak antar komponen konsisten | Ya |
        | 7 | Form tetap rapi saat jendela diperlebar dan ditinggikan | Ya |
        | 8 | Dibuat dengan JFrame Form dan layout manager, bukan Null/Absolute Layout | Ya |



- Deklarasi penggunaan AI: sebutkan alat yang dipakai dan untuk keperluan apa, atau buat pernyataan jika tidak memakai AI.
    - Ya, saya menggunakan ai, untuk apa `anchor` yang kompas, terus `weight x`, terus bagian `D`, Tabel template Readme, dan pertanyaan yang tidak paham.