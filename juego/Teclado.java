package juego;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends KeyAdapter {

    private Jugador jugador;

    public Teclado(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> jugador.izquierda = true;
            case KeyEvent.VK_RIGHT -> jugador.derecha = true;
            case KeyEvent.VK_UP -> jugador.arriba = true;
            case KeyEvent.VK_DOWN -> jugador.abajo = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> jugador.izquierda = false;
            case KeyEvent.VK_RIGHT -> jugador.derecha = false;
            case KeyEvent.VK_UP -> jugador.arriba = false;
            case KeyEvent.VK_DOWN -> jugador.abajo = false;
        }
    }
}
