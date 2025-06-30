package juego;

import javax.swing.*;
import java.awt.*;

public class Juego extends JFrame {

    private Jugador jugador;
    private Teclado teclado;

    public Juego() {
        setTitle("Mi Juego Simple");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        jugador = new Jugador();
        teclado = new Teclado(jugador);

        addKeyListener(teclado);
        add(jugador);
        setVisible(true);

        gameLoop();
    }

    private void gameLoop() {
        while (true) {
            jugador.mover();
            jugador.repaint();
            try {
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
