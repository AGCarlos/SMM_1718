/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionaula;

/**
 *
 * @author PC
 */
public class Delegado extends Alumno {
    //Variables:
    public int numDel;
    
    //Metodos:
    public Delegado(){
        numDel=0;
    }
    
    public Delegado(int num){
        numDel=num;
    }

    /**
     * @return the numDel
     */
    public int getNumDel() {
        return numDel;
    }

    /**
     * @param numDel the numDel to set
     */
    public void setNumDel(int numDel) {
        this.numDel = numDel;
    }
    
}
