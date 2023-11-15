/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        /* El toUpperCase es un metodo por el cual hace que todo la cadena 
        seleccionado se vuelva a mayuscula todo y el toLowerCase en cambia hace
        que todo la cadena se pase a minuscula
        */
        
    }
}
