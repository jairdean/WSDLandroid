/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import datos.Cls_con;
import dtos.BeneficiarioDTO;
import dtos.CasaDTO;
import dtos.CasaSalesianaDTO;
import modelo.ColaboradorSalesiana;
import modelo.Lugar;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import modelo.ObraSalesiana;
import modelo.TipoCol;

/**
 *
 * @author 
 */
@WebService(serviceName = "proceso_wc",targetNamespace = "http://xmlns.jj.com/services/v1/ups")
public class proceso_wc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    //String sentencia = "select n.id_ben,n.id_eben,n.id_lug,n.descripcion_ben,n.numero_ben,n.areainfluencia_ben,n.estado_ben ,teb.descripcion_eben, l.nombre_lug, l.id_obr ,o.id_cas  from tb_beneficiario  n,tb_estilobeneficiario teb,tb_lugar l,tb_obrasalesiana o,tb_casasalesiana c "
    //lugar bene estilo desc num
    @WebMethod(operationName = "listBeneficiarios")
    @WebResult(name="beneficiarios")
    public List<BeneficiarioDTO> listBeneficiarios(){
        List<BeneficiarioDTO> beneficiarios = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
        String sql = "select n.id_ben,n.id_eben,n.id_lug,n.descripcion_ben,n.numero_ben,n.areainfluencia_ben,n.estado_ben ,teb.descripcion_eben, l.nombre_lug, l.id_obr ,o.id_cas  from tb_beneficiario  n,tb_estilobeneficiario teb,tb_lugar l,tb_obrasalesiana o,tb_casasalesiana c "
                + " where n.id_lug=l.id_lug "
                + " and l.id_obr=o.id_obr "
                + " and o.id_cas=c.id_cas "
                + " and n.estado_ben=true "
                + " and n.id_eben=teb.id_eben;";
        
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                BeneficiarioDTO beneficiario = new BeneficiarioDTO(
                rs.getString(1),
                rs.getString(2),
                rs.getString(8),
                rs.getString(4),
                rs.getString(5));
                beneficiarios.add(beneficiario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return beneficiarios;
    }
    
    @WebMethod(operationName = "listCasaSalesiana")
    @WebResult(name="casasalesiana")
    public List<CasaSalesianaDTO> listCasaSalesiana(){
        List<CasaSalesianaDTO> casasalesiana = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
      String sql = "Select * from tb_casasalesiana where estado_cas=true";
        
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                CasaSalesianaDTO casasal = new CasaSalesianaDTO(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5));
                casasalesiana.add(casasal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return casasalesiana;
    }
    
    //descripcion_ben,numero_ben,id_lug
    @WebMethod(operationName = "insertarUsuario")
    public int insertarUsuario(@WebParam(name = "periodo")String periodo, @WebParam(name = "estado") boolean estado){
        
        int n=0;
        Cls_con obj = new Cls_con();
        String sql = "insert into tb_periodo (periodo, estado_periodo)values('"+periodo+"',"+estado+")";
        String error="";
        
        try {
            error=obj.Ejecutar(sql);
            
        } catch (Exception e) {
            n=0;
        }
        
        if(error.equals("Datos insertados")){
            n = 1;
        }else{
            n=0;
        }
        
        return n;
    }
    //descripcion_ben,numero_ben,id_lug
    @WebMethod(operationName = "insertarBeneficiario")
    public int insertarBeneficiario(@WebParam(name = "descripcion")String descripcion, 
            @WebParam(name = "numero_ben") int numero_ben,
            @WebParam(name = "id_lug") int id_lug){        
        int n=0;
        System.out.println(descripcion+numero_ben+id_lug);
        Cls_con obj = new Cls_con();
        String sql = "insert into tb_beneficiario (descripcion_ben,numero_ben,id_lug,id_eben,estado_ben) values ('"
					+ descripcion
					+ "',"
					+ numero_ben
					+ ","
					+ id_lug
					+ ",1,true);";
        String error="";
        
        try {
            error=obj.Ejecutar(sql);
            
        } catch (Exception e) {
            n=0;
        }
        
        if(error.equals("Datos insertados")){
            n = 1;
        }else{
            n=0;
        }
        
        return n;
    }
    
    
    @WebMethod(operationName = "listTipoColaborador")
    @WebResult(name="colaboradores")
    public List<TipoCol> listTipoColaborador(){
        List<TipoCol> colaboradores = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
        String sql = "SELECT id_tcol,descripcion_tcol,estado_tcol FROM tb_tipocolaborador;";
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                
                TipoCol colaborador = new TipoCol(rs.getInt(1),
                rs.getString(2),
                rs.getBoolean(3));
                colaboradores.add(colaborador);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return colaboradores;
    }
    
    @WebMethod(operationName = "insertarTipoColaborador")
    public int insertarTipoColaborador(@WebParam(name = "descripcion")String descripcion){
        
        int n=0;
        Cls_con obj = new Cls_con();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +descripcion);
        //Insertar el nombre y el estado = true
        String sql = "insert into tb_tipocolaborador (descripcion_tcol,estado_tcol) values ('"+ descripcion + "',true);";
        String error="";
        
        try {
            error=obj.Ejecutar(sql);
            
        } catch (Exception e) {
            n=0;
        }
        
        if(error.equals("Datos insertados")){
            n = 1;
        }else{
            n=0;
        }
        return n;
    }
    
       @WebMethod(operationName = "insertarColaborador")
    public int insertarColaborador(@WebParam(name = "idlug")int idlug,
            @WebParam(name = "cantcolabob")int cantcolabob,
            @WebParam(name = "idTipoCol")int idTipoCol){
        
        int n=0;
        Cls_con obj = new Cls_con();
        System.out.println("insertarColaboradorxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +idlug);
        //Insertar el nombre y el estado = true
        String sql = "insert into tb_colaborador (numero_col,id_lug,id_tcol,estado_col) values ("
					+ cantcolabob + "," + idlug + "," + idTipoCol
					+ ",true);";
        String error="";
        
        try {
            error=obj.Ejecutar(sql);
            
        } catch (Exception e) {
            n=0;
        }
        
        if(error.equals("Datos insertados")){
            n = 1;
        }else{
            n=0;
        }
        return n;
    }
    
    
    
    
    
    
    
     @WebMethod(operationName = "insertarLugar")
    public int insertarLugar(@WebParam(name = "nombreLugar")String nombreLugar,
            @WebParam(name = "descripcion")String descripcion,
            @WebParam(name = "responsable")String responsable,
            @WebParam(name = "direccion")String direccion,
            @WebParam(name = "telefono")String telefono,
            @WebParam(name = "idobra")int idobra){
        
        int n=0;
        Cls_con obj = new Cls_con();
        System.out.println("insertarColaboradorxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +idobra+" "+nombreLugar);
        //Insertar el nombre y el estado = true
      String sql = "insert into tb_lugar (nombre_lug,descripcion_lug,responsable_lug,direccion_lug,telefono_lug,id_obr,id_elug,estado_lug) values ('"
					+ nombreLugar
					+ "','"
					+ descripcion
					+ "','"
					+ responsable
					+ "','"
					+ direccion
					+ "','"
					+ telefono
					+ "',"
					+ idobra
					+ ",1,true);";
        String error="";
        
        try {
            error=obj.Ejecutar(sql);
            
        } catch (Exception e) {
            n=0;
        }
        
        if(error.equals("Datos insertados")){
            n = 1;
        }else{
            n=0;
        }
        return n;
    }
    
     @WebMethod(operationName = "listColaboradores")
    @WebResult(name="colaboradoresSalesiana")
    public List<ColaboradorSalesiana> listColaboradores(){
        List<ColaboradorSalesiana> colaboradoresSalesiana = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
        String sql = "Select distinct tcol.*, lg.nombre_lug, ttcol.descripcion_tcol, lg.id_obr, obr.id_cas "
				+" from tb_colaborador tcol, tb_lugar lg, tb_tipocolaborador ttcol, tb_obrasalesiana obr ,tb_casasalesiana cs "
				+" where estado_col=true "
				+" and tcol.id_tcol=ttcol.id_tcol "
				+" and tcol.id_lug=lg.id_lug "
				+" and lg.id_obr=obr.id_obr "
				+" and cs.id_cas=cs.id_cas; ";
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                ColaboradorSalesiana colab = new ColaboradorSalesiana(
                rs.getInt(3),
                rs.getBoolean(2),
                rs.getString(4),
                rs.getString(6)
                );
                colaboradoresSalesiana.add(colab);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return colaboradoresSalesiana;
    }
    
    
    
    //LUGAR LISTAR
    @WebMethod(operationName = "listLugares")
    @WebResult(name="lugares")
    public List<Lugar> listLugares(){
        List<Lugar> lugares = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
      String sql= " select  l.id_lug,l.id_obr,l.id_elug,l.nombre_lug,l.descripcion_lug,l.responsable_lug,l.direccion_lug,l.telefono_lug,l.coordenada_lug,l.estado_lug,os.denominacion_obr, cs.id_cas,cs.nombre_cas from tb_lugar l,tb_casasalesiana cs,tb_obrasalesiana os "
				+" where l.id_obr=os.id_obr "
				+" and cs.id_cas=os.id_cas and estado_lug=true order by 1,2,3";
        
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                Lugar objLugar = new Lugar(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5));
                lugares.add(objLugar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lugares;
    }
    
    
    //LISTAR OBRA SALESIANA
    @WebMethod(operationName = "listObras")
    @WebResult(name="obras")
    public List<ObraSalesiana> listObras(){
        List<ObraSalesiana> obras = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
    String sql = "Select obr.*, ca.nombre_cas, tobr.descripcion_tobr from tb_obraSalesiana obr ,tb_casasalesiana ca, tb_tipoobra tobr "
                + " where estado_obr=true "
                + " and  obr.id_cas = ca.id_cas "
                + "  and  obr.id_tobr = tobr.id_tobr; ";
        
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                ObraSalesiana objObra = new ObraSalesiana(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6));
                obras.add(objObra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obras;
    }
    
    
    
    
    
     @WebMethod(operationName = "listCasas")
    @WebResult(name="casas")
    public List<CasaDTO> listCasas(){
        
        List<CasaDTO> casas = new ArrayList<>();
        Cls_con obj = new Cls_con();
        ResultSet rs = null;
        String sql = "Select * from tb_casasalesiana";
        
        try {
            rs = obj.Consulta(sql);
            while(rs.next()){
                
                CasaDTO casa = new CasaDTO(
                rs.getInt(1),
                rs.getString(2));
                casas.add(casa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return casas;
    }
    
    
    // i n s e r t a r INSERTAR SECCION
    @WebMethod(operationName = "insertarCasaSalesiana")
    public int insertarCasaSalesiana(@WebParam(name = "nombrecasa")String nombrecasa,
            @WebParam(name = "dircasa")String dircasa,
            @WebParam(name = "telcasa")String telcasa,
            @WebParam(name = "directorcasa")String directorcasa,
            @WebParam(name = "cortocasa")String cortocasa,
            @WebParam(name = "correo")String correo){
        
        int n=0;
        Cls_con obj = new Cls_con();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +nombrecasa);
        //Insertar el nombre y el estado = true
        String sql = "insert into tb_casasalesiana (nombre_cas,direccion_cas,telefono_cas,correo_cas,director_cas,nombrecorto_cas,estado_cas) values ('"
					+ nombrecasa
					+ "','"
					+ dircasa
					+ "','"
					+ telcasa
					+ "','"
                                        + correo
                                        + "','"
					+ directorcasa
					+ "','"
					+ cortocasa + "',true);";
        String error="";
        
        try {
            error=obj.Ejecutar(sql);
            
        } catch (Exception e) {
            n=0;
        }
        
        if(error.equals("Datos insertados")){
            n = 1;
        }else{
            n=0;
        }
        return n;
    }
}
