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
        CargarChoferes();     
    }

    
    private void CargarChoferes() throws SQLException{
    
   TableColumnModel ModeloColumnas =tblChoferes.getColumnModel();
   ModeloColumnas.removeColumn(tblChoferes.getColumn("id"));
     
   DefaultTableModel tablamodal = (DefaultTableModel)tblChoferes.getModel();
   
        
      ResultSet resultado = null;   
      operaciones Oper = new operaciones();
      resultado=Oper.SqlConsulta("Select * from choferes");
      
     
        while(resultado.next()){
                Object[] fila = new Object[3];//Creamos un Objeto con tantos parámetros como datos retorne cada fila 
                                              // de la consulta
                fila[0] = resultado.getString("id");
                fila[1] = resultado.getString("Apellido"); //Lo que hay entre comillas son los campos de la base de datos
                fila[2] = resultado.getString("Nombre");
               
                tablamodal.addRow(fila);
                tblChoferes.setModel(tablamodal);
               
          
            }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblChoferes = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Choferes");
        setToolTipText("Administracion de choferes");

        tblChoferes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblChoferesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChoferesMouseClicked
        
    DefaultTableModel tablamodal = (DefaultTableModel)tblChoferes.getModel();
  
    JOptionPane.showMessageDialog(this, tablamodal.getValueAt(tblChoferes.getSelectedRow(), 0));
        
    }//GEN-LAST:event_tblChoferesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChoferes;
    // End of variables declaration//GEN-END:variables
}
