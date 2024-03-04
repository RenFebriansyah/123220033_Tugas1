/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
// Concrete class implementing Animal
class Cat extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("Kucing mengeong");
    }

    @Override
    void eat() {
        System.out.println("Kucing makan ikan");
    }

    @Override
    void sleep() {
        System.out.println("Kucing tidur di sofa");
    }

    @Override
    public void play() {
        System.out.println("Kucing bermain dengan Wahyu");
    }
    
     @Override
    public void feed() {
        System.out.println("Kucing makan ikan");
    }
    
    @Override
    public void groom() {
        System.out.println("Kucing dimandikan wahyu Setiap Hari");
    }
}

