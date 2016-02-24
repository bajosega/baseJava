package terminal;

import datos.operaciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 * @author bajosega
 */
public class iframeChoferes extends javax.swing.JInternalFrame {

   
    public iframeChoferes() throws SQLException {
        initComponents();
        
        // limpiar controles . 
         btnNuevoActionPerformed(null);
        
        CargarChoferes();     
    }

    
    private void CargarChoferes() throws SQLException{
    
   TableColumnModel ModeloColumnas =tblChoferes.getColumnModel();
   ModeloColumnas.removeColumn(tblChoferes.getColumn("id"));
   ModeloColumnas.removeColumn(tblChoferes.getColumn("Telefono"));
   ModeloColumnas.removeColumn(tblChoferes.getColumn("Direccion"));
     
   DefaultTableModel tablamodal = (DefaultTableModel)tblChoferes.getModel();
   
        
      ResultSet resultado = null;   
      operaciones Oper = new operaciones();
      resultado=Oper.SqlConsulta("Select * from choferes");
      
      
     
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
                     
                tablamodal.addRow(fila);
                tblChoferes.setModel(tablamodal);
            }
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

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
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
                        .addComponent(btnNuevo)))
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
                    .addComponent(btnNuevo))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblChoferesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChoferesMouseClicked
        
    DefaultTableModel tablamodal = (DefaultTableModel)tblChoferes.getModel();
  
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
    
        
    }//GEN-LAST:event_tblChoferesMouseClicked

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
         //JOptionPane.showMessageDialog(this, "PRecionaste la tecla " + txtFiltro.getText()); 
        // Codigo para filtrar datos del jtable 
         
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         
          btnAccion.setText("GUARDAR");
          btnNuevo.setEnabled(false);
          
          txtDNI.setText("");
          txtNroCarnet.setText("");
          txtApellido.setText("");
          txtNombre.setText("");
          txtTelefono.setText("");
          txtDireccion.setText("");
          
          
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
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
