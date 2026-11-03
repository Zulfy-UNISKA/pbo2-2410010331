/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USer
 */
// Nama : Muhammad Zulfy
// NPM  : 2410010331
// Kelas: 5C
public class RekapTableModel extends AbstractTableModel {
    
    private static final String[] KOLOM = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};
    private final List<Rekap> daftar = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return daftar.size();
    }
    
    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }
    
    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Rekap k = daftar.get(baris);
        return switch(kolom) {
            case 0 -> k.npm();
            case 1 -> k.nama();
            case 2 -> k.tugas();
            case 3 -> k.uts();
            case 4 -> k.uas();
            case 5 -> k.akhir();
            default -> k.huruf();
        };
    }
    
    public Rekap get(int baris) {
        return daftar.get(baris);
    }
    
    public void tambah(Rekap kontak) {
        daftar.add(kontak);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru
    }
    
    public void ubah(int baris, Rekap kontak) {
        daftar.set(baris, kontak);
        fireTableRowsUpdated(baris, baris);
    }
    
    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
    
}
