/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import LindoMinino.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejandro
 */
public class Lobby extends javax.swing.JFrame {
            
            DefaultTableModel md;
            String datos[][]={};
            String cabeza []={"NOMBRE", "EDAD", "PUNTUACIÓN"};

            
  
    public Lobby() {
        initComponents();
        md = new DefaultTableModel(datos, cabeza);
        jTablaDatos.setModel(md);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jEmpezar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jPlayer1 = new javax.swing.JLabel();
        jNombre1 = new javax.swing.JTextField();
        jEdad1 = new javax.swing.JLabel();
        jTFEdad1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaDatos = new javax.swing.JTable();
        jPuntu = new javax.swing.JLabel();
        jPuntuacion1 = new javax.swing.JTextField();
        jEliminar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jFilis = new javax.swing.JLabel();
        jColumbus = new javax.swing.JLabel();
        jFila = new javax.swing.JTextField();
        jColumna = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jNuevoDato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Hola Gamer, en este juego eres el responsable de que");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText(" las puntuaciones sean correctas, procura no hacer trampa.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEmpezar.setBackground(new java.awt.Color(0, 204, 204));
        jEmpezar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jEmpezar.setForeground(new java.awt.Color(153, 0, 153));
        jEmpezar.setText("Iniciemos UwU");
        jEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpezarActionPerformed(evt);
            }
        });
        jPanel1.add(jEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 80));

        jGuardar.setBackground(new java.awt.Color(0, 204, 204));
        jGuardar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jGuardar.setForeground(new java.awt.Color(153, 0, 153));
        jGuardar.setText("Guardar :3");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 230, 50));

        jSalir.setBackground(new java.awt.Color(0, 204, 204));
        jSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jSalir.setForeground(new java.awt.Color(153, 0, 153));
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 120, 80));

        jPlayer1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPlayer1.setText("Jugador:");
        jPanel1.add(jPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 90));

        jNombre1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(jNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 60));

        jEdad1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jEdad1.setText("Edad:");
        jPanel1.add(jEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 80));

        jTFEdad1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jTFEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 60));

        jTablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 550, 200));

        jPuntu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPuntu.setText("Puntuación:");
        jPanel1.add(jPuntu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jPuntuacion1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPuntuacion1.setText("0");
        jPanel1.add(jPuntuacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 80, 60));

        jEliminar.setBackground(new java.awt.Color(0, 204, 204));
        jEliminar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jEliminar.setForeground(new java.awt.Color(153, 0, 153));
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 180, 80));

        jModificar.setBackground(new java.awt.Color(0, 204, 204));
        jModificar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jModificar.setForeground(new java.awt.Color(153, 0, 153));
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 190, 80));

        jFilis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jFilis.setText("Fila:");
        jPanel1.add(jFilis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jColumbus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jColumbus.setText("Columna:");
        jPanel1.add(jColumbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jFila.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 50, 40));

        jColumna.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jColumna.setText("2");
        jColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColumnaActionPerformed(evt);
            }
        });
        jPanel1.add(jColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 40, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nueva Puntuación:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jNuevoDato.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jNuevoDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 60, 40));

        jLabel4.setText("Importante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 70, 30));

        jLabel5.setText("manera rápida los puntajes, si deseas cambiar algún dato también se cuenta desde 0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 2, 36)); // NOI18N
        jLabel6.setText("Que el mejor resulte ganador UwU");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 570, 50));

        jLabel7.setText("columna. Disfruta el juego.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 50));

        jLabel8.setText("Las filas empiezan su cuenta desde el 0, la columna 2 es automática para ingresar de ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 500, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpezarActionPerformed

        Miauu m = new Miauu();
        m.setVisible(true);
        m.setResizable(false);
    }//GEN-LAST:event_jEmpezarActionPerformed

    
private JFrame frame;


    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
         
            
            frame = new JFrame("Salir");
            
            if (JOptionPane.showConfirmDialog(frame, "Confirma si quieres salir del Lobby","Gato",
                    JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);
        
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jSalirActionPerformed

    private void jNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombre1ActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
            
            String nombre1=jNombre1.getText();
            String edad1=jTFEdad1.getText();
            String puntuacion1=jPuntuacion1.getText();
            
           String datos []={nombre1, edad1, puntuacion1};
            
            md.addRow(datos);
            
            
          
            
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        
        int fila=jTablaDatos.getSelectedRow();
            if (fila>=0){
                md.removeRow(fila);
                
            }else{
                JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
       
        int fila=Integer.parseInt(jFila.getText());
       int columna=Integer.parseInt(jColumna.getText());
       md.setValueAt(jNuevoDato.getText(),fila, columna);
             
    }//GEN-LAST:event_jModificarActionPerformed

    private void jColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jColumnaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jColumbus;
    private javax.swing.JTextField jColumna;
    private javax.swing.JLabel jEdad1;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jEmpezar;
    private javax.swing.JTextField jFila;
    private javax.swing.JLabel jFilis;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre1;
    private javax.swing.JTextField jNuevoDato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPlayer1;
    private javax.swing.JLabel jPuntu;
    private javax.swing.JTextField jPuntuacion1;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFEdad1;
    private javax.swing.JTable jTablaDatos;
    // End of variables declaration//GEN-END:variables
}
