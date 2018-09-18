/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.cag.graficos;

import java.awt.geom.Point2D;

/**
 *
 * @author CArlos
 */
public class MiPunto extends MiLinea {
    
    public MiPunto(){
        super();
    }
    
    public MiPunto(Point2D a){
        super();
        this.setLine(a,a);
        
    }
  
}
