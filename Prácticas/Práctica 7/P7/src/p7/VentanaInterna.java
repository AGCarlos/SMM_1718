/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import sm.cag.iu.Lienzo2D;

/**
 *
 * @author PC
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    
    VentanaPrincipal parent = null;

    
    /**
     * Creates new form VentanaInterna
     * @param parent
     */
    public VentanaInterna(VentanaPrincipal parent) {
        initComponents();

        this.parent = parent;
    }
    
    public Lienzo2D getLienzo(){
        return this.lienzo2D1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo2D1 = new sm.cag.iu.Lienzo2D();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nuevo");
        setToolTipText("");

        lienzo2D1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzo2D1Layout = new javax.swing.GroupLayout(lienzo2D1);
        lienzo2D1.setLayout(lienzo2D1Layout);
        lienzo2D1Layout.setHorizontalGroup(
            lienzo2D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        lienzo2D1Layout.setVerticalGroup(
            lienzo2D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo2D1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sm.cag.iu.Lienzo2D lienzo2D1;
    // End of variables declaration//GEN-END:variables
}
