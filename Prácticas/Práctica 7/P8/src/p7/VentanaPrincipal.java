/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author PC
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("PaintBásico2D");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PanelEstado = new javax.swing.JPanel();
        EtiquetaForma = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        PanelFormas = new javax.swing.JToolBar();
        BotonPunto = new javax.swing.JToggleButton();
        BotonLinea = new javax.swing.JToggleButton();
        BotonRectangulo = new javax.swing.JToggleButton();
        BotonOvalo = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        PanelHerramientas = new javax.swing.JPanel();
        PanelColores = new javax.swing.JPanel();
        BotonNegro = new javax.swing.JButton();
        BotonBlanco = new javax.swing.JButton();
        BotonRojo = new javax.swing.JButton();
        BotonAmarillo = new javax.swing.JButton();
        BotonAzul = new javax.swing.JButton();
        BotonVerde = new javax.swing.JButton();
        PanelGrosor = new javax.swing.JPanel();
        SpinnerGrosor = new javax.swing.JSpinner();
        PanelAtributos = new javax.swing.JPanel();
        CheckBoxRelleno = new javax.swing.JCheckBox();
        CheckBoxTransparencia = new javax.swing.JCheckBox();
        CheckBoxAlisar = new javax.swing.JCheckBox();
        CheckBoxEditar = new javax.swing.JCheckBox();
        escritorio = new javax.swing.JDesktopPane();
        BarraDeMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MenuItemArchivoNuevo = new javax.swing.JMenuItem();
        MenuItemArchivoAbrir = new javax.swing.JMenuItem();
        MenuItemArchivoGuardar = new javax.swing.JMenuItem();
        MenuEdicion = new javax.swing.JMenu();
        MenuItemEdicionEstado = new javax.swing.JCheckBoxMenuItem();
        MenuItemEdicionFormas = new javax.swing.JCheckBoxMenuItem();
        MenuItemEdicionAtributos = new javax.swing.JCheckBoxMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        PanelEstado.setLayout(new javax.swing.BoxLayout(PanelEstado, javax.swing.BoxLayout.LINE_AXIS));

        EtiquetaForma.setText("Forma");
        PanelEstado.add(EtiquetaForma);

        jPanel5.add(PanelEstado, java.awt.BorderLayout.PAGE_END);

        jPanel11.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        PanelFormas.setRollover(true);

        BotonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p7/iconos/punto.png"))); // NOI18N
        BotonPunto.setFocusable(false);
        BotonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });
        PanelFormas.add(BotonPunto);

        BotonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p7/iconos/linea.png"))); // NOI18N
        BotonLinea.setFocusable(false);
        BotonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLineaActionPerformed(evt);
            }
        });
        PanelFormas.add(BotonLinea);

        BotonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p7/iconos/rectangulo.png"))); // NOI18N
        BotonRectangulo.setFocusable(false);
        BotonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRectanguloActionPerformed(evt);
            }
        });
        PanelFormas.add(BotonRectangulo);

        BotonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p7/iconos/elipse.png"))); // NOI18N
        BotonOvalo.setFocusable(false);
        BotonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOvaloActionPerformed(evt);
            }
        });
        PanelFormas.add(BotonOvalo);

        jPanel1.add(PanelFormas, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        PanelColores.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));

        BotonNegro.setBackground(new java.awt.Color(0, 0, 0));
        BotonNegro.setForeground(new java.awt.Color(51, 0, 255));
        BotonNegro.setMaximumSize(new java.awt.Dimension(28, 9));
        BotonNegro.setMinimumSize(new java.awt.Dimension(28, 9));
        BotonNegro.setPreferredSize(new java.awt.Dimension(28, 9));
        BotonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNegroActionPerformed(evt);
            }
        });

        BotonBlanco.setBackground(new java.awt.Color(255, 255, 255));
        BotonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBlancoActionPerformed(evt);
            }
        });

        BotonRojo.setBackground(new java.awt.Color(255, 0, 51));
        BotonRojo.setMaximumSize(new java.awt.Dimension(28, 9));
        BotonRojo.setMinimumSize(new java.awt.Dimension(28, 9));
        BotonRojo.setPreferredSize(new java.awt.Dimension(28, 9));
        BotonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRojoActionPerformed(evt);
            }
        });

        BotonAmarillo.setBackground(new java.awt.Color(255, 255, 51));
        BotonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAmarilloActionPerformed(evt);
            }
        });

        BotonAzul.setBackground(new java.awt.Color(51, 51, 255));
        BotonAzul.setMaximumSize(new java.awt.Dimension(28, 9));
        BotonAzul.setMinimumSize(new java.awt.Dimension(28, 9));
        BotonAzul.setPreferredSize(new java.awt.Dimension(28, 9));
        BotonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAzulActionPerformed(evt);
            }
        });

        BotonVerde.setBackground(new java.awt.Color(51, 255, 51));
        BotonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColoresLayout = new javax.swing.GroupLayout(PanelColores);
        PanelColores.setLayout(PanelColoresLayout);
        PanelColoresLayout.setHorizontalGroup(
            PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColoresLayout.createSequentialGroup()
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelColoresLayout.createSequentialGroup()
                        .addComponent(BotonNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelColoresLayout.createSequentialGroup()
                        .addComponent(BotonBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelColoresLayout.setVerticalGroup(
            PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonNegro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelColoresLayout.createSequentialGroup()
                        .addComponent(BotonAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonAmarillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(BotonBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelGrosor.setBorder(javax.swing.BorderFactory.createTitledBorder("Grosor"));
        PanelGrosor.setPreferredSize(new java.awt.Dimension(105, 85));

        SpinnerGrosor.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        SpinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerGrosorStateChanged(evt);
            }
        });

        javax.swing.GroupLayout PanelGrosorLayout = new javax.swing.GroupLayout(PanelGrosor);
        PanelGrosor.setLayout(PanelGrosorLayout);
        PanelGrosorLayout.setHorizontalGroup(
            PanelGrosorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrosorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpinnerGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        PanelGrosorLayout.setVerticalGroup(
            PanelGrosorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGrosorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpinnerGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelAtributos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanelAtributos.setPreferredSize(new java.awt.Dimension(105, 85));

        CheckBoxRelleno.setText("Relleno");
        CheckBoxRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxRellenoActionPerformed(evt);
            }
        });

        CheckBoxTransparencia.setText("Transparencia");
        CheckBoxTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxTransparenciaActionPerformed(evt);
            }
        });

        CheckBoxAlisar.setText("Alisar");
        CheckBoxAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAlisarActionPerformed(evt);
            }
        });

        CheckBoxEditar.setText("Editar");
        CheckBoxEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAtributosLayout = new javax.swing.GroupLayout(PanelAtributos);
        PanelAtributos.setLayout(PanelAtributosLayout);
        PanelAtributosLayout.setHorizontalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtributosLayout.createSequentialGroup()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxRelleno)
                    .addComponent(CheckBoxAlisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxEditar)
                    .addComponent(CheckBoxTransparencia))
                .addContainerGap())
        );
        PanelAtributosLayout.setVerticalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxRelleno)
                    .addComponent(CheckBoxTransparencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxAlisar)
                    .addComponent(CheckBoxEditar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelHerramientasLayout = new javax.swing.GroupLayout(PanelHerramientas);
        PanelHerramientas.setLayout(PanelHerramientasLayout);
        PanelHerramientasLayout.setHorizontalGroup(
            PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHerramientasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelHerramientasLayout.setVerticalGroup(
            PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelColores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelGrosor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(PanelHerramientasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        jPanel7.add(PanelHerramientas, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        jPanel7.add(escritorio, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        MenuArchivo.setText("Archivo");

        MenuItemArchivoNuevo.setText("Nuevo");
        MenuItemArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemArchivoNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemArchivoNuevo);

        MenuItemArchivoAbrir.setText("Abrir");
        MenuItemArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemArchivoAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemArchivoAbrir);

        MenuItemArchivoGuardar.setText("Guardar");
        MenuItemArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemArchivoGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemArchivoGuardar);

        BarraDeMenu.add(MenuArchivo);

        MenuEdicion.setText("Edición");

        MenuItemEdicionEstado.setSelected(true);
        MenuItemEdicionEstado.setText("Ver barra de estado");
        MenuItemEdicionEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEdicionEstadoActionPerformed(evt);
            }
        });
        MenuEdicion.add(MenuItemEdicionEstado);

        MenuItemEdicionFormas.setSelected(true);
        MenuItemEdicionFormas.setText("Ver barra de formas");
        MenuItemEdicionFormas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEdicionFormasActionPerformed(evt);
            }
        });
        MenuEdicion.add(MenuItemEdicionFormas);

        MenuItemEdicionAtributos.setSelected(true);
        MenuItemEdicionAtributos.setText("Ver barra de atributos");
        MenuItemEdicionAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEdicionAtributosActionPerformed(evt);
            }
        });
        MenuEdicion.add(MenuItemEdicionAtributos);

        BarraDeMenu.add(MenuEdicion);

        setJMenuBar(BarraDeMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNegroActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(Color.black);
        }

        this.repaint();
    }//GEN-LAST:event_BotonNegroActionPerformed

    private void BotonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBlancoActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(Color.white);
        }

        this.repaint();

    }//GEN-LAST:event_BotonBlancoActionPerformed

    private void BotonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRojoActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(Color.red);
        }

        this.repaint();

    }//GEN-LAST:event_BotonRojoActionPerformed

    private void BotonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAmarilloActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(Color.yellow);
        }
        this.repaint();

    }//GEN-LAST:event_BotonAmarilloActionPerformed

    private void BotonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAzulActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(Color.blue);
        }
        this.repaint();

    }//GEN-LAST:event_BotonAzulActionPerformed

    private void BotonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerdeActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setColor(Color.green);
        }
        this.repaint();

    }//GEN-LAST:event_BotonVerdeActionPerformed

    private void MenuItemArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemArchivoGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION){
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_MenuItemArchivoGuardarActionPerformed

    boolean barraEst = true;
    boolean barraForma = true;
    boolean barraAtributos = true;
    
    private void MenuItemEdicionEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEdicionEstadoActionPerformed
        
        if (barraEst){
            barraEst=false;
            PanelEstado.setVisible(false);
        } else {
            barraEst=true; PanelEstado.setVisible(true);
        }

    }//GEN-LAST:event_MenuItemEdicionEstadoActionPerformed

    private void MenuItemEdicionFormasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEdicionFormasActionPerformed
        if (barraForma){
            barraForma=false;
            PanelFormas.setVisible(false);
        } else {
            barraForma=true; PanelFormas.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemEdicionFormasActionPerformed

    private void MenuItemArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemArchivoNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna(this);
        escritorio.add(vi);
        vi.setVisible(true);
        vi.setSize(300, 300);
    }//GEN-LAST:event_MenuItemArchivoNuevoActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(0);
        }

        BotonLinea.setSelected(false);
        BotonRectangulo.setSelected(false);
        BotonOvalo.setSelected(false);

        EtiquetaForma.setText("Punto");
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void BotonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLineaActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(1);
        }

        BotonPunto.setSelected(false);
        BotonRectangulo.setSelected(false);
        BotonOvalo.setSelected(false);

        EtiquetaForma.setText("Linea");

    }//GEN-LAST:event_BotonLineaActionPerformed

    private void BotonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRectanguloActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(2);
        }

        BotonLinea.setSelected(false);
        BotonPunto.setSelected(false);
        BotonOvalo.setSelected(false);

        EtiquetaForma.setText("Rectángulo");
    }//GEN-LAST:event_BotonRectanguloActionPerformed

    private void BotonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOvaloActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            vi.getLienzo().setForma(3);
        }

        BotonLinea.setSelected(false);
        BotonRectangulo.setSelected(false);
        BotonPunto.setSelected(false);

        EtiquetaForma.setText("Óvalo");
    }//GEN-LAST:event_BotonOvaloActionPerformed

    private void CheckBoxTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxTransparenciaActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            if (vi.getLienzo().getTransparencia()) {
                vi.getLienzo().setTransparencia(false);
            } else {
                vi.getLienzo().setTransparencia(true);
            }
        }

        this.repaint();
    }//GEN-LAST:event_CheckBoxTransparenciaActionPerformed

    private void CheckBoxRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxRellenoActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            if (vi.getLienzo().getRelleno()) {
                vi.getLienzo().setRelleno(false);
            } else {
                vi.getLienzo().setRelleno(true);
            }
        }

        this.repaint();
    }//GEN-LAST:event_CheckBoxRellenoActionPerformed

    private void CheckBoxAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAlisarActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            if (vi.getLienzo().getAlisado()) {
                vi.getLienzo().setAlisado(false);
            } else {
                vi.getLienzo().setAlisado(true);
            }
        }

        this.repaint();
    }//GEN-LAST:event_CheckBoxAlisarActionPerformed

    private void CheckBoxEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxEditarActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            if (vi.getLienzo().getEdicion()) {
                vi.getLienzo().setEdicion(false);
            } else {
                vi.getLienzo().setEdicion(true);
            }
        }

        this.repaint();
    }//GEN-LAST:event_CheckBoxEditarActionPerformed

    private void SpinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerGrosorStateChanged
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            int grosor = (int) SpinnerGrosor.getValue();
            vi.getLienzo().setGrosor(grosor);
        }

        this.repaint();
    }//GEN-LAST:event_SpinnerGrosorStateChanged

    private void MenuItemEdicionAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEdicionAtributosActionPerformed
        if (barraAtributos){
            barraAtributos=false;
            PanelHerramientas.setVisible(false);
        } else {
            barraAtributos=true; PanelHerramientas.setVisible(true);
        }
    }//GEN-LAST:event_MenuItemEdicionAtributosActionPerformed

    private void MenuItemArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemArchivoAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION){
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_MenuItemArchivoAbrirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JButton BotonAmarillo;
    private javax.swing.JButton BotonAzul;
    private javax.swing.JButton BotonBlanco;
    private javax.swing.JToggleButton BotonLinea;
    private javax.swing.JButton BotonNegro;
    private javax.swing.JToggleButton BotonOvalo;
    private javax.swing.JToggleButton BotonPunto;
    private javax.swing.JToggleButton BotonRectangulo;
    private javax.swing.JButton BotonRojo;
    private javax.swing.JButton BotonVerde;
    private javax.swing.JCheckBox CheckBoxAlisar;
    private javax.swing.JCheckBox CheckBoxEditar;
    private javax.swing.JCheckBox CheckBoxRelleno;
    private javax.swing.JCheckBox CheckBoxTransparencia;
    private javax.swing.JLabel EtiquetaForma;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuEdicion;
    private javax.swing.JMenuItem MenuItemArchivoAbrir;
    private javax.swing.JMenuItem MenuItemArchivoGuardar;
    private javax.swing.JMenuItem MenuItemArchivoNuevo;
    private javax.swing.JCheckBoxMenuItem MenuItemEdicionAtributos;
    private javax.swing.JCheckBoxMenuItem MenuItemEdicionEstado;
    private javax.swing.JCheckBoxMenuItem MenuItemEdicionFormas;
    private javax.swing.JPanel PanelAtributos;
    private javax.swing.JPanel PanelColores;
    private javax.swing.JPanel PanelEstado;
    private javax.swing.JToolBar PanelFormas;
    private javax.swing.JPanel PanelGrosor;
    private javax.swing.JPanel PanelHerramientas;
    private javax.swing.JSpinner SpinnerGrosor;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
