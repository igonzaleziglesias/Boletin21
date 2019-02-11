package boletin21;

import java.util.ArrayList;
import java.util.Collections;
import utilidades.pedirDatos;
import clases.*;

public class Boletin21 {

    public static void main(String[] args) {
        ArrayList<Libro> libro = new ArrayList<Libro>();
        Libreria obx = new Libreria();
        int op;
        do {
            op = pedirDatos.enteiro("***MENU***\n0->salir\n1->engadir\n2->amosar\n3->vender\n4->Baixa\n5->amosarLibro");

            switch (op) {
                case 1:
                    
                    String isbn=(pedirDatos.lerString("ISBN: "));
                    if (obx.comparar(libro,isbn)==false) {                    
                        obx.engadir(libro, pedirDatos.lerString("Titulo:"),
                                pedirDatos.lerString("Autor: "), isbn,
                                pedirDatos.lerFloat("Prezo: "), pedirDatos.enteiro("Unidades:"));
                    } else {
                        obx.añadirUnidades(libro, pedirDatos.enteiro("Unidades:"));
                    }

                    break;
                case 2:
                    Collections.sort(libro);
                    obx.amosar(libro);
                    break;
                case 3:
                    obx.vender(libro, pedirDatos.lerString("ISBN: "));
                    break;
                case 4:
                    obx.baixa(libro);     
                    System.out.println("----------------------------------------");
                    System.out.println("Actulizado");
                    break;
                case 5: 
                    obx.amosarLibro(libro, pedirDatos.lerString("ISBN: "));
                    break;
                
            }
        } while (op != 0);
    }

}
