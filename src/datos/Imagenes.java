/*
 *http://jonathanmelgoza.com/blog/guardar-y-leer-imagenes-en-mysql-con-java/
 */
package datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author adrian
 */
public class Imagenes {
    
public boolean guardarImagen(String ruta,String nombre){
	String insert = "insert into Imagenes(imagen,nombre) values(?,?)";
	FileInputStream fis = null;
	PreparedStatement ps = null;
	conexion obj = new conexion();
        try {
		obj.conexion.setAutoCommit(false);
		File file = new File(ruta);
		fis = new FileInputStream(file);
		ps = obj.conexion.prepareStatement(insert);
		ps.setBinaryStream(1,fis,(int)file.length());
		ps.setString(2, nombre);
		ps.executeUpdate();
		obj.conexion.commit();
		return true;
	} catch (SQLException | FileNotFoundException ex) {
	}finally{
		try {
			ps.close();
			fis.close();
		} catch (SQLException | IOException ex) {
		}
	}        
	return false;
}

}
