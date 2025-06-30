package juego;

import javax.swing.*;
import java.awt.*;

public class Jugador extends JPanel {

    int x = 100, y = 100;
    int velocidad = 5;

    boolean izquierda, derecha, arriba, abajo;

    public void mover() {
        if (izquierda) x -= velocidad;
        if (derecha) x += velocidad;
        if (arriba) y -= velocidad;
        if (abajo) y += velocidad;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight()); // Fondo
        g.setColor(Color.RED);
        g.fillRect(x, y, 40, 40); // Jugador
    }
}
