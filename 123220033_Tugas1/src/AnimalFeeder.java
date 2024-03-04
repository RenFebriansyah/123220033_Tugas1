/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
// AnimalFeeder.java
public class AnimalFeeder {
    public static void feedAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Memberi makan tulang pada anjing");
        } else if (animal instanceof Cat) {
            System.out.println("Memberi makan ikan pada kucing");
        }
    }
}

