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
        int x = V1.getX()-this.getX(); // x2-x1 = x
        int y = V1.getY()-this.getY(); // y2-y1 = y
        int z = V1.getZ()-this.getZ(); // z2-z1 = z
        return Math.sqrt((x*x)+(y*y)+(z*z)); // sqrt(x^2 + y^2 + z^2)
    }
    // Jawaban nomor 3f
    public boolean IsVektorNol(Vektor3D V1) {
        if (V1.getX()-this.getX() == 0 && V1.getY()-this.getY() == 0 && V1.getZ()-this.getZ() == 0) {
            return true;
        }
        return false;
    }
}
