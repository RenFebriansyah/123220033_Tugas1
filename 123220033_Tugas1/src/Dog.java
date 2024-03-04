/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
// Concrete class implementing Animal
class Dog extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("Anjing Mengonggong");
    }

    @Override
    void eat() {
        System.out.println("Anjing makan tulang");
    }

    @Override
    void sleep() {
        System.out.println("Anjing tidur diluar");
    }

    @Override
    public void play() {
        System.out.println("Anjing main lempar tangkap");
    }
    
    @Override
    public void feed() {
        System.out.println("Anjing diberi snack");
    }
    
    @Override
    public void groom() {
        System.out.println("Anjing dimandikan wahyu 2x seminggu");
    }
}

