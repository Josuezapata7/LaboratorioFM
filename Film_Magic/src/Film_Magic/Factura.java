/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Film_Magic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Langas
 */
public class Factura extends javax.swing.JInternalFrame {

    /**
     * Creates new form Factura
     */
    
    
    public Factura() {
        initComponents();
        jLabel_Total.setText(Float.toString(FilmMagic_Principal.valor));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Codigo_Factura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Forma_Pago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Codigo_Renta = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Codigo_Cliente = new javax.swing.JTextField();
        jLabel_Total = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setText("Codigo Factura");

        jLabel2.setText("Fecha Factura");

        jLabel3.setText("Forma de Pago");

        jLabel4.setText("Total");

        jLabel5.setText("Codigo Cliente");

        jButton_Registrar.setText("Registrar");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese Codigo de Factura");

        jLabel7.setText("Codigo Renta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Forma_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_Codigo_Factura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(txt_Codigo_Renta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jButton_Registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Modificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txt_Codigo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jButton_Eliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_Buscar)))))
                        .addGap(0, 134, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Codigo_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Codigo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Codigo_Renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Forma_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Modificar)
                            .addComponent(jButton_Eliminar)
                            .addComponent(jButton_Registrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Buscar))
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(78, 78, 78))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // TODO add your handling code here:
        
        try        
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic","root","Langas798");
            PreparedStatement pst = cn.prepareStatement("insert into Factura values(?,?,?,?,?,?)");
            
          
            
            pst.setString(1, txt_Codigo_Factura.getText().trim());
            pst.setString(2, txt_Fecha.getText().trim());
            pst.setString(3, txt_Forma_Pago.getText().trim());
            pst.setString(4, jLabel_Total.getText().trim());
            pst.setString(5, txt_Codigo_Cliente.getText().trim());
            pst.setString(6, txt_Codigo_Renta.getText().trim());
            pst.executeUpdate();
            
            txt_Codigo_Factura.setText("");
            txt_Fecha.setText("");
            txt_Forma_Pago.setText("");
            txt_Codigo_Cliente.setText("");
            txt_Codigo_Renta.setText("");
            label_status.setText("Registrado.");
            
        }catch (Exception e)
        {
               e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "Langas798");
            PreparedStatement pst = cn.prepareStatement("select * from Factura where Codigo_Factura = ?");
            pst.setString(1, txt_Buscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
                txt_Codigo_Factura.setText(rs.getString("Codigo_Factura"));
                txt_Fecha.setText(rs.getString("Fecha"));
                txt_Forma_Pago.setText(rs.getString("Forma_Pago"));
                jLabel_Total.setText(rs.getString("Total"));
                txt_Codigo_Cliente.setText(rs.getString("Codigo_Cliente"));
                txt_Codigo_Renta.setText(rs.getString("Codigo_Renta"));
            } else 
            {
                JOptionPane.showMessageDialog(null, "Factura no registrado.");
            }
           }catch (Exception e)
           {
            
           }
            

    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
        // TODO add your handling code here:
        
        try {
            String ID = txt_Buscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "Langas798");
            PreparedStatement pst = cn.prepareStatement("update Factura set Codigo_Factura = ?,Fecha = ?, Forma_Pago = ?,Total = ?,Codigo_Cliente = ? where Codigo_Cliente = " + ID);
            
            pst.setString(1, txt_Codigo_Factura.getText().trim());
            pst.setString(2, txt_Fecha.getText().trim());
            pst.setString(3, txt_Forma_Pago.getText().trim());
            pst.setString(4, jLabel_Total.getText().trim());
            pst.setString(5, txt_Codigo_Cliente.getText().trim());
            pst.setString(5, txt_Codigo_Renta.getText().trim());
            pst.executeUpdate();
            
            label_status.setText("Modificación exitosa.");
            
        } catch (Exception e) 
        {
            
        }
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "Langas798");
            PreparedStatement pst = cn.prepareStatement("delete from Factura where Codigo_Factura = ?");
            
            pst.setString(1, txt_Buscar.getText().trim());
            pst.executeUpdate();
            
            txt_Codigo_Factura.setText("");
            txt_Fecha.setText("");
            txt_Forma_Pago.setText("");
            jLabel_Total.setText("");
            txt_Codigo_Cliente.setText("");
            txt_Codigo_Renta.setText("");
            
            label_status.setText("Registro eliminado.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Codigo_Cliente;
    private javax.swing.JTextField txt_Codigo_Factura;
    private javax.swing.JTextField txt_Codigo_Renta;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_Forma_Pago;
    // End of variables declaration//GEN-END:variables
}
