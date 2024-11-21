package com.lautaropetelin.desafionavidenio.igu;

import javax.swing.JOptionPane;
import com.lautaropetelin.desafionavidenio.logica.Controladora;

public class Principal extends javax.swing.JFrame {

    Controladora control = null;
    int xMouse, yMouse;
    String emogi;
    String matriz[][] = null;
    int cantEncontrados;
    
    public Principal() {
        control = new Controladora();
        matriz = new String[4][4];
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarra = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlCantidadIndicada = new javax.swing.JLabel();
        jtfCantidadIndicada = new javax.swing.JTextField();
        jlElegirPersonaje = new javax.swing.JLabel();
        jbPapaNoel = new javax.swing.JButton();
        jbEstrella = new javax.swing.JButton();
        jbArbolito = new javax.swing.JButton();
        jbRegalo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMatrizDibujada = new javax.swing.JTextArea();
        jbReiniciar = new javax.swing.JButton();
        panelResultados = new javax.swing.JPanel();
        jlElegido = new javax.swing.JLabel();
        jtfElegido = new javax.swing.JTextField();
        jlCantidad = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jlEncontrados = new javax.swing.JLabel();
        jtfEncontrados = new javax.swing.JTextField();
        jlResultado = new javax.swing.JLabel();
        jtfResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarra.setBackground(new java.awt.Color(255, 153, 51));
        panelBarra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        panelSalir.setBackground(new java.awt.Color(255, 0, 0));

        jlSalir.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(0, 0, 0));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("X");
        jlSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addGap(0, 666, Short.MAX_VALUE)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        panelPrincipal.setBackground(new java.awt.Color(255, 153, 51));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Adivinanza Navideña");

        jlCantidadIndicada.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlCantidadIndicada.setText("Ingrese la cantidad de veces que cree que aparece el personaje:");

        jtfCantidadIndicada.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtfCantidadIndicada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlElegirPersonaje.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlElegirPersonaje.setText("Elija su personaje:");

        jbPapaNoel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jbPapaNoel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/desafionavidenio/igu/images/papaNoel.png"))); // NOI18N
        jbPapaNoel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPapaNoel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPapaNoel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPapaNoelActionPerformed(evt);
            }
        });

        jbEstrella.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jbEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/desafionavidenio/igu/images/estrella.png"))); // NOI18N
        jbEstrella.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEstrella.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstrellaActionPerformed(evt);
            }
        });

        jbArbolito.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jbArbolito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/desafionavidenio/igu/images/arbolNavidad.png"))); // NOI18N
        jbArbolito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbArbolito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbArbolito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArbolitoActionPerformed(evt);
            }
        });

        jbRegalo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jbRegalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/desafionavidenio/igu/images/regalo.png"))); // NOI18N
        jbRegalo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRegalo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegaloActionPerformed(evt);
            }
        });

        jtaMatrizDibujada.setEditable(false);
        jtaMatrizDibujada.setColumns(20);
        jtaMatrizDibujada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 42)); // NOI18N
        jtaMatrizDibujada.setRows(5);
        jScrollPane1.setViewportView(jtaMatrizDibujada);

        jbReiniciar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbReiniciar.setText("Reset");
        jbReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReiniciarActionPerformed(evt);
            }
        });

        panelResultados.setBackground(new java.awt.Color(255, 153, 51));
        panelResultados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlElegido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlElegido.setText("Elegido:");

        jtfElegido.setEditable(false);
        jtfElegido.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jtfElegido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlCantidad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlCantidad.setText("Cantidad:");

        jtfCantidad.setEditable(false);
        jtfCantidad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtfCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlEncontrados.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlEncontrados.setText("Encontrados:");

        jtfEncontrados.setEditable(false);
        jtfEncontrados.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtfEncontrados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlResultado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlResultado.setText("Resultado:");

        jtfResultado.setEditable(false);
        jtfResultado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtfResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlElegido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlResultado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEncontrados, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadosLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jtfElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelResultadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jtfEncontrados)
                            .addComponent(jtfResultado))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlElegido)
                    .addComponent(jtfElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantidad)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEncontrados)
                    .addComponent(jtfEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlResultado)
                    .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jlElegirPersonaje)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbPapaNoel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbEstrella)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbArbolito)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbRegalo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jlCantidadIndicada)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfCantidadIndicada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbReiniciar)
                .addGap(134, 134, 134))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantidadIndicada)
                    .addComponent(jtfCantidadIndicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPapaNoel)
                    .addComponent(jbEstrella)
                    .addComponent(jbArbolito)
                    .addComponent(jbRegalo)
                    .addComponent(jlElegirPersonaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbReiniciar)
                .addGap(50, 50, 50))
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void jlSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_jlSalirMousePressed

    private void jbPapaNoelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPapaNoelActionPerformed
        
        emogi = "🎅";
        
        completarDatos(emogi);
    }//GEN-LAST:event_jbPapaNoelActionPerformed

    private void jbEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstrellaActionPerformed
        
        emogi = "⭐";
        
        completarDatos(emogi);
    }//GEN-LAST:event_jbEstrellaActionPerformed

    private void jbArbolitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArbolitoActionPerformed
        
        emogi = "🎄";
        
        completarDatos(emogi);
    }//GEN-LAST:event_jbArbolitoActionPerformed

    private void jbRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegaloActionPerformed
        
        emogi = "🎁";
        
        completarDatos(emogi);
    }//GEN-LAST:event_jbRegaloActionPerformed

    private void jbReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReiniciarActionPerformed
        jtfCantidad.setText(null);
        jtaMatrizDibujada.setText(null);
        jtfElegido.setText(null);
        jtfCantidadIndicada.setText(null);
        jtfEncontrados.setText(null);
        jtfResultado.setText(null);
    }//GEN-LAST:event_jbReiniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbArbolito;
    private javax.swing.JButton jbEstrella;
    private javax.swing.JButton jbPapaNoel;
    private javax.swing.JButton jbRegalo;
    private javax.swing.JButton jbReiniciar;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlCantidadIndicada;
    private javax.swing.JLabel jlElegido;
    private javax.swing.JLabel jlElegirPersonaje;
    private javax.swing.JLabel jlEncontrados;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextArea jtaMatrizDibujada;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCantidadIndicada;
    private javax.swing.JTextField jtfElegido;
    private javax.swing.JTextField jtfEncontrados;
    private javax.swing.JTextField jtfResultado;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JPanel panelSalir;
    // End of variables declaration//GEN-END:variables

    private void completarDatos(String emogi){
        
        jtaMatrizDibujada.setText("");
        
        if(jtfCantidadIndicada.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Primero debe indicar un cantidad.", "Información", 0);
            return;
        }
        
        try{
            int cantidad = Integer.parseInt(jtfCantidadIndicada.getText());

            if (cantidad >= 0 && cantidad <= 16){

                matriz = control.generarMatriz();
                
                cantEncontrados = control.determinarCantidadEmogi(emogi, matriz, cantidad);
                
                jtfElegido.setText(emogi);
                jtfCantidad.setText(String.valueOf(cantidad));
                jtfEncontrados.setText(String.valueOf(cantEncontrados));
                
                if(cantEncontrados == cantidad){
                    jtfResultado.setText("¡Ganaste!");
                }else{
                    jtfResultado.setText("Perdiste...");
                }
                
                dibujarMatriz(matriz);
                
            }else{
                JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad dentro del rango 1-16.", "Información", 0);
                return;
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor númerico.", "Información", 0);
        }
    }
    
    private void dibujarMatriz(String matriz[][]){
        
        jtaMatrizDibujada.setText("\n");
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {     
                jtaMatrizDibujada.setText(jtaMatrizDibujada.getText() + matriz[f][c] + "");         
            }
            jtaMatrizDibujada.setText(jtaMatrizDibujada.getText() + "\n");
        }
        
    }
}