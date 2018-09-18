/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.cag.graficos;

import java.awt.geom.*;

/**
 *
 * @author CArlos
 */
public class MiLinea extends Line2D.Float {
    
    public MiLinea(){
        super();
    }
    
    public MiLinea(Point2D a, Point2D b){
        super();
        this.setLine(a, b);
    }
    
    public boolean isNear(Point2D p) {
        if (this.getP1().equals(this.getP2())) {
            return this.getP1().distance(p) <= 3.0;
        } else return this.ptLineDist(p) <= 3.0;
        
    }

    @Override
    public boolean contains(Point2D p) {
        return isNear(p);
    }
  
    public void setLocation(Point2D pos) {
        double dx = pos.getX() - this.getX1();
        double dy = pos.getY() - this.getY1();
        Point2D newp2 = new Point2D.Double(this.getX2() + dx, this.getY2() + dy);
        this.setLine(pos, newp2);
    }
    
}
