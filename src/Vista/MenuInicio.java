/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.MouseEvent;
import Controlador.InvasionControlador;

/**
 *
 * @author javie
 */
public class MenuInicio extends javax.swing.JFrame {
    private InvasionControlador invasionControlador;
    
    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
        initComponents();
        avanzar10Dias.setEnabled(false);
        creaNuevoEntorno.setEnabled(true);
        jButton1.setEnabled(false);
        jLabelInformacion.setEnabled(false);
        jScrollPane1.setEnabled(false);
        jTextAreaInformacion.setEnabled(false);
        mostrarDetalles.setEnabled(false);
        producirAcontecimiento.setEnabled(false);
        salirPrograma.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creaNuevoEntorno = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mostrarDetalles = new javax.swing.JButton();
        avanzar10Dias = new javax.swing.JButton();
        producirAcontecimiento = new javax.swing.JButton();
        salirPrograma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInformacion = new javax.swing.JTextArea();
        jLabelInformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        creaNuevoEntorno.setText("CREA NUEVO ENTORNO");
        creaNuevoEntorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaNuevoEntornoActionPerformed(evt);
            }
        });

        jButton1.setText("Avanzar 1 Dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mostrarDetalles.setText("Mostrar Detalles");
        mostrarDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDetallesActionPerformed(evt);
            }
        });

        avanzar10Dias.setText("Avanzar 10 dias");
        avanzar10Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzar10DiasActionPerformed(evt);
            }
        });

        producirAcontecimiento.setText("Producir Acontecimiento");

        salirPrograma.setText("Salir del Programa");
        salirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirProgramaActionPerformed(evt);
            }
        });

        jTextAreaInformacion.setEditable(false);
        jTextAreaInformacion.setColumns(20);
        jTextAreaInformacion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInformacion);

        jLabelInformacion.setText("INFORMACIÓN BASICA DEL ENTORNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mostrarDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395)
                .addComponent(salirPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(creaNuevoEntorno, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(avanzar10Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(producirAcontecimiento)
                .addGap(43, 43, 43))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(avanzar10Dias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(producirAcontecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creaNuevoEntorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jLabelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creaNuevoEntornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaNuevoEntornoActionPerformed
        // TODO add your handling code here:
        invasionControlador = new InvasionControlador();
        
        avanzar10Dias.setEnabled(true);
        jButton1.setEnabled(true);
        jLabelInformacion.setEnabled(true);
        jScrollPane1.setEnabled(true);
        jTextAreaInformacion.setEnabled(true);
        mostrarDetalles.setEnabled(true);
        producirAcontecimiento.setEnabled(true);
        informacionInicio();

    }//GEN-LAST:event_creaNuevoEntornoActionPerformed
    
    private void informacionInicio(){
        String humanos, cazavampiros, vampiros, zombies, dia, temperatura, cadena;
        invasionControlador.crearInvasion();
        
        dia = invasionControlador.getDia();
        temperatura = invasionControlador.getTemperatura();
        humanos = invasionControlador.cantidadHumanos();
        cazavampiros = invasionControlador.cantidadCazaVampiros();
        vampiros = invasionControlador.cantidadVampiros();
        zombies = invasionControlador.cantidadZombies();
        
        cadena = ("\t\t\t\nInvasion Creada\n\n\tDia: "+ dia+"\n\tTemperatura Actual: "+ temperatura +
                  "\n\n\tNumero total de HUMANOS : " + humanos+"\n\tNumero total de CAZAVAMPIROS: "+ cazavampiros+
                  "\n\tNumero total de VAMPIROS: "+ vampiros+ "\n\tNumero total de ZOMBIES: " + zombies);
        
        jTextAreaInformacion.setText(cadena);  
    }
    private void salirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirProgramaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirProgramaActionPerformed

    private void mostrarDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDetallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarDetallesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String humanos, cazavampiros, vampiros, zombies, dia, temperatura, cadena;
        invasionControlador.AvanzarDia();
   
        dia = invasionControlador.getDia();
        temperatura = invasionControlador.getTemperatura();
        humanos = invasionControlador.cantidadHumanos();
        cazavampiros = invasionControlador.cantidadCazaVampiros();
        vampiros = invasionControlador.cantidadVampiros();
        zombies = invasionControlador.cantidadZombies();
        
        cadena = ("\t\t\t\nInvasion Creada\n\n\tDia: "+ dia+"\n\tTemperatura Actual: "+ temperatura +
                  "\n\n\tNumero total de HUMANOS : " + humanos+"\n\tNumero total de CAZAVAMPIROS: "+ cazavampiros+
                  "\n\tNumero total de VAMPIROS: "+ vampiros+ "\n\tNumero total de ZOMBIES: " + zombies);
        
        jTextAreaInformacion.setText(cadena);  
        //temperatura = invasionControlador.getTemperatura();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void avanzar10DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzar10DiasActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < 10; i++)
            invasionControlador.AvanzarDia();
    }//GEN-LAST:event_avanzar10DiasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar10Dias;
    private javax.swing.JButton creaNuevoEntorno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelInformacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInformacion;
    private javax.swing.JButton mostrarDetalles;
    private javax.swing.JButton producirAcontecimiento;
    private javax.swing.JButton salirPrograma;
    // End of variables declaration//GEN-END:variables
}