package com.company;

import javax.swing.*;
import java.awt.*;

//Me crea ventanas
class ventanas {
    private JFrame ventana = new JFrame();
    private TextArea texto_ventana = new TextArea();

    ventanas(String nombre, int x, int y) {
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        ventana.add(texto_ventana);
        ventana.setLocation(x, y);
    }

    public void escribecadena(String cadena) {
        texto_ventana.setText(texto_ventana.getText() + cadena);
    }

}
