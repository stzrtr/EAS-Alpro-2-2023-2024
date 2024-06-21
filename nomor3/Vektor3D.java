/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor3;

/**
 *
 * @author Rin
 */
// Jawaban nomor 3a
public class Vektor3D {
    private int x, y, z;
    // Jawaban nomor 3b
    public Vektor3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Jawaban nomor 3c
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    // Jawaban nomor 3d
    public void Display() {
        System.out.println("("+x+", "+y+", "+z+")");
    }
    // Jawaban nomor 3e
    public double EuclidDist(Vektor3D V1) {
        double e0 = Math.sqrt((this.getX()*this.getX())+(this.getY()*this.getY())+(this.getZ()*this.getZ())); // Cari panjang vektor yang diuji.
        double e1 = Math.sqrt((V1.getX()*V1.getX())+(V1.getY()*V1.getY())+(V1.getZ()*V1.getZ())); // Cari panjang vektor tujuannya.
        return e0+e1; // Hasil panjangnya sendiri.
    }
    // Jawaban nomor 3f
    public boolean IsVektorNol() {
        return this.x == 0 && this.y == 0 && this.z == 0; // Jika ketiganya memenuhi, maka return true.
    }
}
