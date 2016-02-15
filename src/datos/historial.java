/**
 *
 * @Copyright 2014 "freejbakcups" por Adrian Seimandi - bajosega@gmail.com 
 *  
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program. If not, see <http://www.gnu.org/licenses/>.  
 */
package datos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class historial {
    
    public static String getFecha(){ 
   // Calendar calendario = Calendar.getInstance();
     Calendar calendario = new GregorianCalendar();
    //Calendar calendario = new GregorianCalendar();
    int  hora =calendario.get(Calendar.HOUR_OF_DAY);
    int minutos = calendario.get(Calendar.MINUTE);
    int segundos = calendario.get(Calendar.SECOND);
    int año = calendario.get(Calendar.YEAR);
    int mes = calendario.get(Calendar.MONTH);
    int dia = calendario.get(Calendar.DAY_OF_MONTH);
    return año +"-"+ mes +"-"+ dia + "-"+ hora + ";" + minutos + ";" + segundos;
    }   
    
     public static String jdatetime(){ 
   // Calendar calendario = Calendar.getInstance();
     Calendar calendario = new GregorianCalendar();
    //Calendar calendario = new GregorianCalendar();
    int  hora =calendario.get(Calendar.HOUR_OF_DAY);
    int minutos = calendario.get(Calendar.MINUTE);
    int segundos = calendario.get(Calendar.SECOND);
    int año = calendario.get(Calendar.YEAR);
    int mes = calendario.get(Calendar.MONTH);
    int dia = calendario.get(Calendar.DAY_OF_MONTH);
    return año +"-"+ mes +"-"+ dia + " "+ hora + ":" + minutos + ":" + segundos;
    }   
    
    
    
}
