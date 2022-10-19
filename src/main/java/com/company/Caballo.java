package com.company;

import java.awt.TextArea;
import java.util.Scanner;
import javax.swing.*;

public class Caballo {
    static int numCarreras; //Cuántos corredores voy a tener
    private static OperacionHilos corredor[]; //Array de carreras
    private static int numCorredores;
    public static void Lanzar(Scanner teclado) {

        System.out.println("¿Cuántos caballos van a correr?");
        numCorredores = teclado.nextInt();
        numCarreras=numCorredores;
        Resultados res = new Resultados(numCorredores, numCarreras);
        corredor = new OperacionHilos[numCarreras];

        for (int i = 0; i < 1; i++) {
            corredor[i] = new OperacionHilos (i+1, res, numCarreras);
            corredor[i].start(); //Empiezo el hilo
            try {
                corredor[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Muestra los resultados de cada carrera, a ver qué corredor tarda menos sprints en llegar a la meta
        System.out.println("Las carreras han finalizado... Han llegado los " + numCarreras + " corredores");
        res.getResultados();
        for (int t = 0; t < numCarreras; t++) {
            for (int i = 0; i < numCorredores; i++)
                System.out.print(res.cadena[t][i]);

            System.out.println("--------------------------------------------------------------------------------");
        }
    }
}

