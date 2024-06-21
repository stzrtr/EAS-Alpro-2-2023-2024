/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author Rin
 */
public class Cat extends Animal implements Pet {
    String name;
    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Daging"); 
    }

    @Override
    public void info() {
        System.out.println("Jumlah kaki: "+this.legs);
        this.walk();
        this.eat();
    }

    @Override
    public String getName() {
        return this.name; 
    }

    @Override
    public void setName(String n) {
        this.name = name; 
    }
}
