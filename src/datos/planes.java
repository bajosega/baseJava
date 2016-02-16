
package datos;

import static datos.historial.jdatetime;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class planes extends operaciones{
    
    public  void GuardarPlan(String Nombre,String origenes[],String destino) throws SQLException{
        // primero guardo en la tabla Plan . 
    String sql;
    boolean guardado = true;
    
    sql = "insert into plan"
            + " (nombre,fechaCreado)"
            + " values"
            + " ('"+Nombre+"','" + jdatetime() +"')";    
      if ( SqlModificador(sql))
      { // como se guardo correctamente ,tengo que guardar los detalles del plan. 
        // para guardar los detalles tengo que averiguar el ultimo idPlan Ingresado
          
        ResultSet ConsultarID = null; // asi no me jode con que no es usada
        String idPLan = null ;  
        ConsultarID=SqlConsulta("select idplan from PLAN order by idPlan desc");
          
        if(ConsultarID.next()) {idPLan=ConsultarID.getString("idPLan");}
        
        ConsultarID.close();
          
        for (String origen : origenes)
        {
              sql = "insert into plan_detalle"
                      + " (fk_idPlan,directorio)"
                      + " values"
                      + " ('"+ idPLan +"','" + origen +"')";
              if (!SqlModificador(sql)){    
               guardado = false;
              } 
        }
      }
      else  
      {
          guardado = false;
      }    
     if (guardado) JOptionPane.showMessageDialog(null, "EL PLAN SE AGREGO CORRECTAMENTE");
     else  JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL PLAN");
    }  
    
   public  void InsertarPlan(String sql){
       SqlConsulta("INSERT INTO plan (nombre, fechaCreado, ultimaEjecucion, estado, activo) " +
                "VALUES (" + sql +")");
   }   
}
