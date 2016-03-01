package terminal;

import datos.operaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 * @author bajosega
 */
public class iframeChoferes extends javax.swing.JInternalFrame {

    // variables globales de la clase 
     
   operaciones Oper = new operaciones();
  
   DefaultTableModel tablamodal;
    
    
    public iframeChoferes() throws SQLException {
        
        initComponents();
        
        tablamodal = (DefaultTableModel)tblChoferes.getModel();
        
        
        // limpiar controles . 
         btnNuevoActionPerformed(null);
         
        
        // mostramos el listado de choferes .  
        CargarChoferes();     
    }

    
   private void CargarChoferes() throws SQLException{
        
      ResultSet resultado= Oper.SqlConsulta("Select * from choferes");
      DefaultTableModel tabla = (DefaultTableModel)tblChoferes.getModel();
       tabla.setRowCount(0);
      
        while(resultado.next()){
                Object[] fila = new Object[7];//Creamos un Objeto con tantos parámetros como datos retorne cada fila 
                                              // de la consulta
                fila[0] = resultado.getString("id");
                fila[1] = resultado.getString("DNI");
                fila[2] = resultado.getString("NroCarnet");
                fila[3] = resultado.getString("Apellido"); //Lo que hay entre comillas son los campos de la base de datos
                fila[4] = resultado.getString("Nombre");
                fila[5] = resultado.getString("Telefono");
                fila[6] = resultado.getString("Direccion");       
                tabla.addRow(fila);
                  
            }
        
          tblChoferes.setModel(tabla);
          tblChoferes.setAutoResizeMode(tblChoferes.AUTO_RESIZE_NEXT_COLUMN);
          tabla.fireTableDataChanged();
          tblChoferes.updateUI();
          
             TableColumnModel ModeloColumnas =tblChoferes.getColumnModel();
            ModeloColumnas.removeColumn(tblChoferes.getColumn("id"));
            ModeloColumnas.removeColumn(tblChoferes.getColumn("Telefono"));
            ModeloColumnas.removeColumn(tblChoferes.getColumn("Direccion"));
   
         // resultado.close();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblChoferes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNroCarnet = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnAccion = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Choferes");
        setToolTipText("Administracion de choferes");

        tblChoferes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "DNI", "NroCarnet", "Apellido", "Nombre", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChoferes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChoferesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChoferes);

        jLabel2.setText("DNI:");

        jLabel3.setText("NroCarnet:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Dirección:");

        jLabel1.setText("BUSCAR:");

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        btnAccion.setText("GUARDAR");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNroCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccion)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblChoferesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChoferesMouseClicked
     
  // JOptionPane.showMessageDialog(this, tablamodal.getValueAt(tblChoferes.getSelectedRow(), 1));
    
    //LLENAR LOS DATOS PARA PODER EDITAR    
    txtDNI.setText((String) tablamodal.getValueAt(tblChoferes.getSelectedRow(), 1));
    txtNroCarnet.setText((String)tablamodal.getValueAt(tblChoferes.getSelectedRow(), 2));
    txtApellido.setText((String)tablamodal.getValueAt(tblChoferes.getSelectedRow(), 3));
    txtNombre.setText((String)tablamodal.getValueAt(tblChoferes.getSelectedRow(), 4));
    txtTelefono.setText((String)tablamodal.getValueAt(tblChoferes.getSelectedRow(), 5));
    txtDireccion.setText((String)tablamodal.getValueAt(tblChoferes.getSelectedRow(), 6));
    
    //Habilitar Colocar bANDERA  de edicion
    
    btnAccion.setText("MODIFICAR");
    
    btnNuevo.setEnabled(true);
    btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_tblChoferesMouseClicked

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
         //JOptionPane.showMessageDialog(this, "PRecionaste la tecla " + txtFiltro.getText()); 
        // Codigo para filtrar datos del jtable 
         
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         
          btnAccion.setText("GUARDAR");
          btnEliminar.setEnabled(false);
          
          btnNuevo.setEnabled(false);
          txtDNI.setText("");
          txtNroCarnet.setText("");
          txtApellido.setText("");
          txtNombre.setText("");
          txtTelefono.setText("");
          txtDireccion.setText("");
                   
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
       boolean resu=false;
        
        if ("GUARDAR".equals(btnAccion.getText())) {
        
            // insertar 
          resu=Oper.SqlModificador("insert into choferes (dni,NroCarnet,Apellido,Nombre,Telefono,Direccion) Values ("
                    + "'" + txtDNI.getText()       + "',"
                    + "'" + txtNroCarnet.getText() + "',"
                    + "'" + txtApellido.getText()  + "',"
                    + "'" + txtNombre.getText()    + "'," 
                    + "'" + txtTelefono.getText()  + "',"
                    + "'" + txtDireccion.getText() + "')"
                    );
                 
        } else {
            
            // actualizar . 
            
      
        }
        
        if (resu == true) {
           try {
               btnNuevoActionPerformed(null);
               JOptionPane.showMessageDialog(null, "Comando Ejecutado");
               CargarChoferes();
               //tblChoferes.update(null);
           } catch (SQLException ex) {
               Logger.getLogger(iframeChoferes.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, ex.getMessage() );
            
           }
        }     
    }//GEN-LAST:event_btnAccionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

          try {
               Oper.SqlModificador("DELETE FROM CHOFERES WHERE id='" +(String) tablamodal.getValueAt(tblChoferes.getSelectedRow(), 0)+"'" );
              btnNuevoActionPerformed(null);
              CargarChoferes();
              JOptionPane.showMessageDialog(null, "Comando Ejecutado");
          } catch (SQLException ex) {
              Logger.getLogger(iframeChoferes.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex.getMessage() );
            
          }   
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChoferes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroCarnet;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
