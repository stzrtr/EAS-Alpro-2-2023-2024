/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author Rin
 */
public abstract class Animal {
    int legs;
    Animal(int legs) {
        this.legs = legs;
    }
    public void walk() {
        System.out.println("Berjalan");
    }
    public abstract void eat();
    public abstract void info();
}
