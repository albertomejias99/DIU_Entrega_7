package com.mycompany.diu_entrega_7;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Lienzo extends JPanel {

    private BufferedImage imagen = null;

    public Lienzo() {
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
            g.drawImage(imagen, 0, 0, null);
        }
    }
}
