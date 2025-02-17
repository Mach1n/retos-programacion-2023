/*
/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 *
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
 */
package partidotenis;

import java.util.Scanner;

/**
 *
 * @author Cristian Machado Mosquera
 */
public class PartidoTenis {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    String[] puntosValidos = {"Love", "15", "30", "40"};
    int puntuajeP1 = 0;
    int puntuajeP2 = 0;
    boolean ventaja = false;

    System.out.println("Introduce la secuencia de puntos (P1 o P2) separados por espacio:");
    String[] secuencia = tec.nextLine().split(" ");

    for (String punto : secuencia) {
      if (punto.equals("P1")) {
        puntuajeP1++;
      } else if (punto.equals("P2")) {
        puntuajeP2++;
      } else {
        System.out.println("Entrada invalida: " + punto);
        continue;
      }

      if (puntuajeP1 >= 3 && puntuajeP2 >= 3) {
        if (puntuajeP1 == puntuajeP2) {
          System.out.println("Deuce");
          ventaja = false;
        } else if (puntuajeP1 == puntuajeP2 + 1) {
          System.out.println("Ventaja P1");
          ventaja = true;
        } else if (puntuajeP2 == puntuajeP1 + 1) {
          System.out.println("Ventaja P2");
          ventaja = true;
        } else if (puntuajeP1 >= puntuajeP2 + 2) {
          System.out.println("Ha ganado el P1");
          break;
        } else if (puntuajeP2 >= puntuajeP1 + 2) {
          System.out.println("Ha ganado el P2");
          break;
        }
      } else {
        System.out.println(puntosValidos[Math.min(puntuajeP1, 3)] + " - " + puntosValidos[Math.min(puntuajeP2, 3)]);
      }
    }
    tec.close();
  }

}
