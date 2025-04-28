public class esPalindromo {
    public static boolean Palindromo(String cadena){
        String resultado= "";
        char[] caracteres = cadena.toCharArray();
        StringBuilder inversa = new StringBuilder();
        for (int i = caracteres.length -1;i>=0; i--){
            inversa.append(caracteres[i]);
        }
        return cadena.equals(inversa.toString());

    }
}
