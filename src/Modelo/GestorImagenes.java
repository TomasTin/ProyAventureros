/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Tomas Lancheros
 */
public class GestorImagenes {

    // Cargar imagen desde ruta
    public static BufferedImage cargarImagen(String ruta) throws IOException {
        return ImageIO.read(new File(ruta));
    }

    // Guardar imagen siempre escalada a un tamaño estándar
    public static void guardarImagen(BufferedImage imagenOriginal, String rutaSalida, String formato) throws IOException {

        // Escalar automáticamente
        BufferedImage imagenEscalada = escalarImagen(imagenOriginal, 400, 400);

        // Guardar ya escalada
        ImageIO.write(imagenEscalada, formato, new File(rutaSalida));
    }

    // Escalar imagen
    public static BufferedImage escalarImagen(BufferedImage original, int ancho, int alto) {
        Image scaled = original.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        BufferedImage buffered = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = buffered.createGraphics();
        g2d.drawImage(scaled, 0, 0, null);
        g2d.dispose();

        return buffered;
    }
}
