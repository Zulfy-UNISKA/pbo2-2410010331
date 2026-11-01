- Tautan video demo mini proyek Katalog Buku Perpustakaan (maksimal 3 menit) yang memperlihatkan semua fitur pada tabel bagian D, termasuk sekilas tab Design dan jendela Navigator;
    - Video demo: https://drive.google.com/file/d/1h0llvpc9-ssDJeCutMepcV_3LadtzWk6/view?usp=sharing
- Deklarasi penggunaan AI: alat yang dipakai dan untuk keperluan apa, atau pernyataan tidak memakai AI.
    - perbaharuiStatus kode cek tersedia.
    - menanyakan bug tahunTerbitField tidak terset, ternyata for() masukkin input tahun ke combo setelah setCombo, terus letakkin ke sebelum setCombo baru mau.
        ```java
        for(int i = 1900; i <= Year.now().getValue(); i++) {
                tahunTerbitCombo.addItem(String.valueOf(i));
        }

        tahunTerbitCombo.setSelectedItem(awal.tahunTerbit());
        ```