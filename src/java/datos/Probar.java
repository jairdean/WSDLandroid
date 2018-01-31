/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;

/**
 *
 * @author Jairo
 */
public class Probar {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        boolean verdad;
	            verdad = false;
	        String pass="";
	        int cont=0;
	       String query="SELECT descripcion_ben FROM tb_beneficiario "
	                    + "WHERE id_ben = 1";
	       Cls_con con = new Cls_con();
	       ResultSet resultSet=null;
	       try {
	             resultSet=con.Consulta(query);
				while(resultSet.next()){
					pass=resultSet.getString(1);
	                                cont++;
				}
	         } catch (Exception e) {
	             verdad=false;
	             e.getMessage();
	         }
	       
	System.out.println("####abajo### \n"+pass);
	        
	     }
}
