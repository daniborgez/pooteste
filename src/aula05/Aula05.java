/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author Pref. Valinhos
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco c1 = new Banco();
        c1.abrirConta("CP");
        c1.depoistar(50);
        c1.sacar(15);
        c1.pagarMensal();
    }
    
}
