public class esPalindromo {
    public static void main(String[] args) {
        isPalindrome("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida");
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
    }}