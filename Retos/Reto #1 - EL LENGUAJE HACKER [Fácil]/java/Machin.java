/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.Scanner;

public class lenguaje_hacker {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       //Pedir al usuario que ingrese el texto
       System.out.println("Ingrese un texto: ");
       String texto = tec.nextLine();

       //Mostrar el texto transformado
       System.out.println("Texto en lenguaje hacker: " + transformarALeet(texto));
       tec.close();
    }

    public static String transformarALeet(String texto) {
        //Tabla simple de equivalencias
        texto = texto.replace('a','4');
        texto = texto.replace('b','8');
        texto = texto.replace('c','[');
        texto = texto.replace('d',')');
        texto = texto.replace('e','3');
        texto = texto.replace('f','v');
        texto = texto.replace('g','&');
        texto = texto.replace('h','#');
        texto = texto.replace('i','!');
        texto = texto.replace('j',']');
        texto = texto.replace('k','<');
        texto = texto.replace('l','1');
        texto = texto.replace('m','^');
        texto = texto.replace('n','+');
        texto = texto.replace('o','0');
        texto = texto.replace('p','?');
        texto = texto.replace('q','9');
        texto = texto.replace('r','~');
        texto = texto.replace('s','5');
        texto = texto.replace('t','7');
        texto = texto.replace('u','/');
        texto = texto.replace('v','|');
        texto = texto.replace('w','-');
        texto = texto.replace('x','Ç');
        texto = texto.replace('y','j');
        texto = texto.replace('z','2');
        return texto;
    }
}
