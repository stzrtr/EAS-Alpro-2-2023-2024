/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor3;

/**
 *
 * @author Rin
 */
public class test {
    public static void main(String[] args) {
        Vektor3D a = new Vektor3D(1,2,3);
        Vektor3D b = new Vektor3D(4,5,6);
        a.Display();
        b.Display();
        System.out.println("Dist A -> B: "+a.EuclidDist(b));
        System.out.println("Dist B -> A: "+b.EuclidDist(a));
        System.out.println("Dist A -> A: "+a.EuclidDist(a));
        System.out.println("Dist B -> B: "+b.EuclidDist(b));
        System.out.println("Does A -> B = 0? "+a.IsVektorNol(b));
        System.out.println("Does B -> A = 0? "+b.IsVektorNol(a));
        System.out.println("Does A -> A = 0? "+a.IsVektorNol(a));
        System.out.println("Does B -> B = 0? "+b.IsVektorNol(b));
    }
}
