package co.packg;

public class Main {
    public static String reverse(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    public static void main(String[] args) {
        String texto = "Hola mundo";
        texto = reverse(texto);
        System.out.println(texto);


    }
}
