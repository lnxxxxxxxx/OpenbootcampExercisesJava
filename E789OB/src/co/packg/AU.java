package co.packg;


public class AU {
    public static void main(String[] args) {
        String arrayUno[] = new String[5];
        arrayUno[0] = "Hola";
        arrayUno[1] = "Chau";
        arrayUno[2] = "Nos vemos";
        arrayUno[3] = "Hasta luego";
        arrayUno[4] = "No entiendo";

        for(String i : arrayUno){
            System.out.println(i);
        }
    }
}
