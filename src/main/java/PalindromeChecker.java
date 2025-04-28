import java.util.Scanner;

public class PalindromeChecker {

    /**
     * Determina si una cadena es un palindrome,
     * ignorando puntuación, espacios y mayúsculas.
     * @param input la cadena a comprobar
     * @return true si es palindrome; false en otro caso
     * @throws IllegalArgumentException si input es null
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = Preguntar();
        boolean resultado = isPalindrome(input); // Llamar a isPalindrome con el input

        if (resultado==true) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static String Preguntar() {
        String input = "";
        System.out.println("Ingrese una palabra a verificar si es Palindromo ");
        input = sc.nextLine();

        return input;
    }
    public static boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("La cadena no puede ser null");
        }

        // 1. Normalizar: quitar no alfanuméricos y pasar a minúsculas
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // 2. Punteros al inicio y al final
        int left = 0, right = cleaned.length() - 1;

        // 3. Comparar mientras left < right
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // 4. Si no hubo diferencias, es palindrome
        return true;
    }
}
