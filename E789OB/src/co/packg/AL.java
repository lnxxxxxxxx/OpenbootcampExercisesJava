package co.packg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");
        for(String list : lista ){
            System.out.println(list);
        }
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
        for(int i = 0; i < listaEnlazada.size(); i++){
            System.out.println(listaEnlazada.get(i));
        }

        ArrayList<Integer> number = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int numero = i+1;
            number.add(numero);
            System.out.println(number);

        }
        for(int j = 0; j < number.size(); j++){
            if(number.get(j) % 2 == 0){
                number.remove(j);
            }

        }
        System.out.println(number);


    }
}
