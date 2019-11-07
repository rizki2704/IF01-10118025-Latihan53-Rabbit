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
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return false;
    }
    
    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
}
