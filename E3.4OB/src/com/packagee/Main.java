package com.packagee;

public class Main {
    public static void main(String[] args) {


       int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }




        int numWhile = 0;
        do {
            System.out.println("ciclo do while ejecutandose: " + numWhile);
            numWhile++;
        }
            while(numWhile < 3);

        //Para el bucle For, Crea una variable NumeroFor, esta variable tendra como valor 0
        //su condicion sera que la variable sea igual o menor que 3, se ira incrementando en 1
        // debera mostrar en pantalla
        int numeroFor = 0;
        for(int i = 0; i < 50; i++){

            if(numeroFor <= 3) {
               numeroFor++;
                System.out.println("Variable del ciclo for: " + numeroFor);
            }
        }


    }
}
