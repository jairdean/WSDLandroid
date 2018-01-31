package modelo;

import java.io.Serializable;


public class Lugar implements Serializable {
   private static final long serialVersionUID = -8986968563604633653L;
	private int id_obr;
	private int id_elug;
	private String nombre_lug;
	private String descripcion_lug;
        private String resp_lug;
        private String dr_lug;
	private String coor_lug;
	private boolean estado_lug;
	private String deno_obra;
	private int idcas;
        private String nombr_cas;

    public Lugar(String nombre_lug, String descripcion_lug, String resp_lug, String dr_lug, String deno_obra) {
        super();
        this.nombre_lug = nombre_lug;
        this.descripcion_lug = descripcion_lug;
        this.resp_lug = resp_lug;
        this.dr_lug = dr_lug;
        this.deno_obra = deno_obra;
    }

        
    public int getId_obr() {
        return id_obr;
    }

    public void setId_obr(int id_obr) {
        this.id_obr = id_obr;
    }

    public int getId_elug() {
        return id_elug;
    }

    public void setId_elug(int id_elug) {
        this.id_elug = id_elug;
    }

    public String getNombre_lug() {
        return nombre_lug;
    }

    public void setNombre_lug(String nombre_lug) {
        this.nombre_lug = nombre_lug;
    }

    public String getDescripcion_lug() {
        return descripcion_lug;
    }

    public void setDescripcion_lug(String descripcion_lug) {
        this.descripcion_lug = descripcion_lug;
    }

    public String getResp_lug() {
        return resp_lug;
    }

    public void setResp_lug(String resp_lug) {
        this.resp_lug = resp_lug;
    }

    public String getDr_lug() {
        return dr_lug;
    }

    public void setDr_lug(String dr_lug) {
        this.dr_lug = dr_lug;
    }

    public String getCoor_lug() {
        return coor_lug;
    }

    public void setCoor_lug(String coor_lug) {
        this.coor_lug = coor_lug;
    }

    public boolean isEstado_lug() {
        return estado_lug;
    }

    public void setEstado_lug(boolean estado_lug) {
        this.estado_lug = estado_lug;
    }

    public String getDeno_obra() {
        return deno_obra;
    }

    public void setDeno_obra(String deno_obra) {
        this.deno_obra = deno_obra;
    }

    public int getIdcas() {
        return idcas;
    }

    public void setIdcas(int idcas) {
        this.idcas = idcas;
    }

    public String getNombr_cas() {
        return nombr_cas;
    }

    public void setNombr_cas(String nombr_cas) {
        this.nombr_cas = nombr_cas;
    }
    
    
    
}
