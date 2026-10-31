/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USer
 */
public class BukuTableModel extends AbstractTableModel {
    
    private static final String[] KOLOM = {"Kode", "Judul", "Penulis", "Tahun Terbit", "Status"};
    private final List<Buku> daftar = new ArrayList<>();
    
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
        Buku k = daftar.get(baris);
        return switch(kolom) {
            case 0 -> k.kode();
            case 1 -> k.judul();
            case 2 -> k.penulis();
            case 3 -> k.tahunTerbit();
            default -> k.status();
        };
    }
    
    public Buku get(int baris) {
        return daftar.get(baris);
    }
    
    public void tambah(Buku kontak) {
        daftar.add(kontak);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru
    }
    
    public void ubah(int baris, Buku kontak) {
        daftar.set(baris, kontak);
        fireTableRowsUpdated(baris, baris);
    }
    
    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
    
}
