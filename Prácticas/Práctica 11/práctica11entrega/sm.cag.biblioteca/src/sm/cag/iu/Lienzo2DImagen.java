/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.cag.iu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;

/**
 *
 * @author CArlos
 */
public class Lienzo2DImagen extends Lienzo2D {
    
    //1) Variable BufferImage
    private BufferedImage img;
    //2) Set
    public void setImage(BufferedImage img) {
        this.img = img;
        if (img != null) {
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        }
    }

    //3) Get
    public BufferedImage getImage() {
        return img;
    }

    //4) Método paint
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0,this);
        }
        
    }

    public BufferedImage getImage(boolean drawVector) {
        
        
        if (drawVector) {
            // TODO: Código para crear una nueva imagen
            // que contenga la imagen actual más
            // las formas
            BufferedImage imgOut= new BufferedImage(img.getWidth(),img.getHeight(),img.getType());          
            //Habrá que poner algo aquí
            this.paint(imgOut.createGraphics());
            return imgOut;
        } 
        else 
            return getImage();
    }

    
}
