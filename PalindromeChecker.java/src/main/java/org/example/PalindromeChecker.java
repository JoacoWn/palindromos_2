package org.example;

public class PalindromeChecker {

    /**
     * Determina si una cadena es un palíndromo,
     * ignorando puntuación, espacios y mayúsculas.
     * @param input La cadena a comprobar.
     * @return true si es palíndromo, false en caso contrario.
     * @throws IllegalArgumentException si input es null.
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("La cadena no puede ser null");
        }

        // 1. Normalizar: quitar no alfanuméricos y pasar a minúsculas
        String cleaned = input.replaceAll("[^A-Za-z0-9áéíóúÁÉÍÓÚñÑ]", "")
                .toLowerCase();

        // 2. Apuntar al inicio y al final
        int left = 0, right = cleaned.length() - 1;

        // 3. Comparar mientras left < right
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // 4. Si no hubo diferencias, es palíndromo
        return true;
    }
}