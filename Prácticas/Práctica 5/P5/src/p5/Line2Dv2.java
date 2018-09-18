/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.awt.geom.*;

/**
 *
 * @author PC
 */
public class Line2Dv2 extends Line2D{
    
    public boolean isNear(Point2D p){
        return this.ptLineDist(p)<=2.0;
    }
    
    @Override
    public boolean contains(Point2D p) {
        return isNear(p);
    }
    
    public void setLocation(Point2D pos){
        double dx=pos.getX()-this.getX1();
        double dy=pos.getY()-this.getY1();
        Point2D newp2 = new Point2D.Double(this.getX2()+dx,this.getY2()+dy);
        this.setLine(pos,newp2);
    }

    @Override
    public double getX1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getY1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point2D getP1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getX2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getY2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point2D getP2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLine(double x1, double y1, double x2, double y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rectangle2D getBounds2D() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
