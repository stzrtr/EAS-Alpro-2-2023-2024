/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1;

/**
 *
 * @author Rin
 */
public class HargaDiskon extends Barang {
    private double diskon;
    HargaDiskon(String nama, double harga, double diskon) {
        // Jawaban nomor 1a
        super(nama, harga);
        this.diskon = diskon;
    }
    public double nettoHarga(int jumlBarang) {
        // Jawaban nomor 1b
        if (jumlBarang >= 10) {
            // Kalau beli 10 atau lebih dapat diskon
            return this.getHarga()*jumlBarang*diskon;
        }
        // Kalau beli kurang dari 10 dapat harga normal
        return this.getHarga()*jumlBarang;
    }
}
