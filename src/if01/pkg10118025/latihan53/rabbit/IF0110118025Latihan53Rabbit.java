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
public class IF0110118025Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rbt = new Rabbit("Peter", false, "Grass", 4, "Grey");
        System.out.printf("Hello, His name is %s%n", rbt.getName());
        System.out.printf("%s is Vegetarian? %b%n", rbt.getName(), rbt.vegetarian);
        System.out.printf("%s eats %s%n", rbt.getName(), rbt.getEats());
        System.out.printf("%s has %d legs%n", rbt.getName(), rbt.getNoOfLegs());
        System.out.printf("%s color is %s%n", rbt.getName(), rbt.getColor());
    }
    
}
