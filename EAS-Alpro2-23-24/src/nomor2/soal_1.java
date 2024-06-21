/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Kalau ga disebut nomor berapa yang dikoreksi, berarti ini jawaban nomor 2b.
*/
package nomor2; // Ini harusnya "package soal_EAS", tapi nama package saat ini "nomor2", abaikan saja.

/**
 *
 * @author Rin
 */
public class soal_1 {
    public static void main(String[] args) {
        EFG efg = new EFG();
        efg.methodOne(2); // Sebelumya "efg.methodOne();", cek kelas interface "ABC".
        efg.methodTwo(3);
        efg.methodThree(2);
    }
}
interface ABC {
    void methodOne(int i); // Sebelumnya "void methodOne();", bisa aja kalau mau sout-nya langsung "4.0" jadi tetap kayak sebelumnya (cek class EFG).
}
interface PQR {
    void methodTwo(int i);
}
abstract class XYZ implements PQR {
    public void methodTwo(int i) {
        System.out.println(Math.pow(i,2));
    }
    abstract void methodThree(int i);
}
class EFG extends XYZ implements ABC {
    public void methodThree(int i) {
        System.out.println(Math.pow(i,3));
    }
    // Di kelas ini tidak ada methodOne, padahal di kelas interface ABC ada, harus dimasukkan (Jawaban nomor 2a).
    public void methodOne(int i) { // Ngikut di kelas interface ABC
        System.out.println(Math.pow(i,2));
        /*
        Jawaban ngawur-nya: ini bisa aja "System.out.println("4.0");" jadi "methodOne()" aja tanpa harus input i.
        */
    }
}