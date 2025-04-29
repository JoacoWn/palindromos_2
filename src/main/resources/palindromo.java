package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean esPalindromo(String cadena) {
        // Eliminar espacios y convertir a minúsculas para una comparación uniforme
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();

        // Crear un StringBuilder para manipular la cadena
        StringBuilder reversed = new StringBuilder(cadena);

        // Revertir la cadena
        reversed.reverse();

        // Comparar la cadena original con la cadena revertida
        return cadena.equals(reversed.toString());
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}