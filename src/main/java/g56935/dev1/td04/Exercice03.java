/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td4;
import java.util.Scanner;
/**
 *
 * @author g56935
 */
public class Exercice03 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int somme = 0;
        int nb = 0;
        int i = 0;
        
        System.out.println("Entrez 5 nombres entiers : ");
        while(i<5) {
            nb = clavier.nextInt();
            somme = somme + nb;
            i++;
        }
        System.out.println("La somme de vos nombres est égale à "+somme+" !");
        System.out.println("La moyenne de vos nombres est égale à "+(somme/5)+" !");
    }
}
