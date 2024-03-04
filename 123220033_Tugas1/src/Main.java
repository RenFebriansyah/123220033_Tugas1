/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ACER
 */
// Main class
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.sound();
            animal.eat();
            animal.sleep();
            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                pet.play();
                pet.groom();
                pet.feed();
               
            }
             try {
                AnimalFeeder.feedAnimal(animal);
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println();
        }
    }

    
}

