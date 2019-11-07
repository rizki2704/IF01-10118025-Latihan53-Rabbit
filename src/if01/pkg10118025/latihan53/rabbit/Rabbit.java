/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan53.rabbit;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Rabbit extends Animal{
    private final String color;
    private final String name;
    
    public Rabbit(String name, boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
