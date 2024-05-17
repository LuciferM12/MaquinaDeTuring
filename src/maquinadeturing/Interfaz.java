/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 * Programación Orientada a Objetos
 */
package maquinadeturing;

import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rojas Rodríguez Martín Omar, 178809@upslp.edu.mx
 */
public class Interfaz extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel()
    {
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    char[] arregloCaracteres;
    String completa;
    public JTextField[] valores;
    public Interfaz() {
        initComponents();
        modelo.addColumn("Regla");
        modelo.addColumn("Estado");
        modelo.addColumn("Situación");
        
        tablePalabra.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablePalabra.getTableHeader().setOpaque(false);
        tablePalabra.getTableHeader().setBackground(new Color(31,110,38));
        tablePalabra.getTableHeader().setForeground(new Color(255, 255, 255));
        tablePalabra.setRowHeight(25);
        tablePalabra.setModel(modelo);
        tablePalabra.setVisible(false);
        jButton2.setVisible(false);
    }
    
    public boolean obtenerTexto()
    {
        String palabra = txtPalabra.getText();
        if(palabra.length() > 0)
        {
            String simboloDelta = "XX";
            completa = simboloDelta + palabra + simboloDelta;
            arregloCaracteres = completa.toCharArray();
            return true;
        }
        return false;    
        //System.out.println(completa);
    }
    
    
           
    
    
    public void colocarTextField(int tamanio)
    {
        valores = new JTextField[tamanio];
        int x = 40;
        int y = 190;
        jPanel1.setLayout(null);
        for (int i = 0; i < tamanio; i++) {
            valores[i] = new JTextField();
            // Establecer los límites (x, y, ancho, alto) para cada JTextField
            valores[i].setBounds(x + (i*20), y, 15, 30); // Ajustar coordenadas según sea necesario
            jPanel1.add(valores[i]);
            jPanel1.setComponentZOrder(valores[i], 0);
            valores[i].setEditable(false);
            valores[i].setText(String.valueOf(arregloCaracteres[i]));
            jPanel1.revalidate();
            jPanel1.repaint();
        }
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePalabra = new javax.swing.JTable(){public boolean isCellEditable(int rowIndex, int colIndex){return false;}};
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        flecha = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 13, 13));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("-Martín Omar Rojas Rodríguez");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 170, 40));

        jPanel2.setBackground(new java.awt.Color(186, 242, 102));
        jPanel2.setForeground(new java.awt.Color(116, 109, 140));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 380, 10));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Palabra a evaluar: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraKeyTyped(evt);
            }
        });
        jPanel1.add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reglas y estados de la instrucción");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jButton1.setText("Evaluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));

        tablePalabra.setBackground(new java.awt.Color(204, 255, 204));
        tablePalabra.setForeground(new java.awt.Color(0, 0, 0));
        tablePalabra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Regla", "Estado", "Situación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePalabra.setRowHeight(25);
        tablePalabra.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tablePalabra.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablePalabra.setShowHorizontalLines(true);
        tablePalabra.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablePalabra);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 560, 250));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 560, 250));

        jPanel3.setBackground(new java.awt.Color(89, 89, 89));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 590, 50));

        flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jPanel1.add(flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 40, 40));

        jButton2.setText("Reiniciar");
        jButton2.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 90, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Máquina de Turing | Teoría Computacional");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Integrantes:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 60, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("-Evan Alexis Pérez Juárez");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(obtenerTexto())
        {
            colocarTextField(completa.length());
            Palabra si = new Palabra(flecha, valores, arregloCaracteres, tablePalabra, modelo, jButton2);
            si.start();
            jButton1.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabraKeyTyped
        char c = evt.getKeyChar();
        if (c != 'a' && c != 'b') {
            evt.consume(); // Ignorar la entrada de cualquier carácter que no sea 'a' o 'b'
        }
    }//GEN-LAST:event_txtPalabraKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tablePalabra.setVisible(false);
        jButton1.setEnabled(true);
        for (JTextField a : valores)
        {
            jPanel1.remove(a);
            
        }
        flecha.setLocation(70, flecha.getY());
        jPanel1.revalidate();
        jPanel1.repaint();
        jButton2.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePalabra;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
