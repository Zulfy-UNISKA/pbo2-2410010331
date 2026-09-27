/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 *
 * @author USer
 */
/**
 * Menjalankan skenario peminjaman dan pengembalian pada Perpustakaan Mini.
*/
public class AplikasiPerpustakaan {

    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambah(new Buku("B001", "Laskar Pelangi", 2005, "Andrea Hirata"));
        perpus.tambah(new Buku("B002", "Clean Code", 2008, "Robert C. Martin"));
        perpus.tambah(new Majalah("M001", "Majalah Teknologi Kita", 2026, "Agustus"));
        perpus.tambah(new Skripsi("S001", "Mengapa tahun 2026 ini sangat susah Cari Loker", 2026, "LulusanKupuKupu", "Teknologi Informatika"));
        perpus.tambah(new Skripsi("S002", "Jobs yang akan hilang di tahun depan :O", 2026, "Manusia", "Teknologi Informatika"));
        
        Anggota siti = new Anggota("2410010123", "Siti Rahmah");
        Anggota budi = new Anggota("2410010456", "Budi Santoso");
        tampilkanDaftar(perpus);
        System.out.println();
        cetakPinjam(perpus, "B002", siti);
        cetakPinjam(perpus, "B002", budi);
        cetakPinjam(perpus, "M001", budi);
        cetakPinjam(perpus, "S002", budi);
        System.out.println("Peminjam B002: " + perpus.getPeminjam("B002").nama());
        try {
            System.out.println("Peminjam S002: " + perpus.getPeminjam("S001").nama() == null ? "" : "");
        } catch(Exception e) {
            System.err.println("S002 Pasti error null karena ini false yaks.");
        } finally {
            System.out.println("Peminjam S002: \"\" (Tidak ada)");
        }
        
        
        System.out.println();
        cetakKembali(perpus, "B002", 2);
        cetakKembali(perpus, "M001", 3);
        cetakKembali(perpus, "S002", 10); // 0 karena tidak ada pinjam
        System.out.println();
        System.out.println("Koleksi tersedia: " + perpus.jumlahTersedia() + " dari " + perpus.getDaftarKoleksi().size());
        System.out.println();
        for(Koleksi listJudul : perpus.cariJudul("code")) {
            System.out.println(listJudul);
        }
        System.out.println();
        
        cetakPinjam(perpus, "S001", siti);
    }
    
    private static void tampilkanDaftar(Perpustakaan perpus) {
        System.out.println("=== Daftar Koleksi ===");
        for (Koleksi k : perpus.getDaftarKoleksi()) {
            System.out.println(k); // otomatis memanggil toString()
        }
    }

    private static void cetakPinjam(Perpustakaan perpus, String kode, Anggota anggota) {
        boolean berhasil = perpus.pinjam(kode, anggota);
        System.out.println(anggota.nama() + " meminjam " + kode + ": " + (berhasil ? "berhasil" : "gagal"));
    }

    private static void cetakKembali(Perpustakaan perpus, String kode, int hariTerlambat) {
        long denda = perpus.kembalikan(kode, hariTerlambat);
        System.out.println("Pengembalian " + kode + " terlambat " + hariTerlambat + " hari, denda Rp" + denda);
    }
    
}
