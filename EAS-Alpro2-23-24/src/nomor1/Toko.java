/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor1;

/**
 *
 * @author Rin
 */
public class Toko {
    public static void main(String[] args) {
        HargaDiskon produk = new HargaDiskon("pensil",15,0.2);
        System.out.println(produk.nettoHarga(9)); // Tes print beli 9 pensil
        System.out.println(produk.nettoHarga(10)); // Tes print beli 10 pensil
    }
}
