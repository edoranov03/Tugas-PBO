/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Evaluasi;
import Evaluasi.HitungNilai.HitungNilaiAkhir;
import Evaluasi.Mahasiswa.*;

import javax.swing.JOptionPane;
/**
 *
 * @author STAMBUK:13020220010
 * NAMA : EDO RANOV ANJASMARA
 * MATERI : MODUL 4,EVALUASI PRATIKUM
 * WAKTU : RABU 27/03/2024 13:36
 */
public class Utama {
    
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama:");
        String stambuk = JOptionPane.showInputDialog("Masukkan Stambuk:");

        int tugas1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tugas 1:"));
        int tugas2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tugas 2:"));
        int mid = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mid:"));
        int uas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UAS:"));

        Identitas mhs = new Identitas();
        mhs.setNama(nama);
        mhs.setStambuk(stambuk);

        HitungNilaiAkhir hitungNilai = new HitungNilaiAkhir();
        double tugas = hitungNilai.nilaiTugas(tugas1, tugas2);

        double na = hitungNilai.nilaiAkhir(tugas, mid, uas);

        JOptionPane.showMessageDialog(null, "Nama: " + mhs.getNama() + "\nStambuk: " + mhs.getStambuk());

        JOptionPane.showMessageDialog(null, "Tugas: " + tugas + "\nMid: " + mid + "\nUAS: " + uas + "\nNilai Akhir: " + na);
    }
    
    }
    

