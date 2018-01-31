package modelo;

import java.io.Serializable;


public class ObraSalesiana implements Serializable {
        private static final long serialVersionUID = -8986968563604633653L;
	private int id_tobr;
	private int id_cas;
	private String denomincaion;
	private String camposervicio_obr;
        private String productos_obr;
        private String horario_obr;
	private String informacion_obr;
        private String pathicon;
        private String nombrecorto_obr;
        private String paginaweb_obr;        
	private boolean estado_obr;

    public ObraSalesiana(String denomincaion, String camposervicio_obr, String productos_obr, String horario_obr, String informacion_obr, String paginaweb_obr) {
        super();
        this.denomincaion = denomincaion;
        this.camposervicio_obr = camposervicio_obr;
        this.productos_obr = productos_obr;
        this.horario_obr = horario_obr;
        this.informacion_obr = informacion_obr;
        this.paginaweb_obr = paginaweb_obr;
    }

        
        
    public int getId_tobr() {
        return id_tobr;
    }

    public void setId_tobr(int id_tobr) {
        this.id_tobr = id_tobr;
    }

    public int getId_cas() {
        return id_cas;
    }

    public void setId_cas(int id_cas) {
        this.id_cas = id_cas;
    }

    public String getDenomincaion() {
        return denomincaion;
    }

    public void setDenomincaion(String denomincaion) {
        this.denomincaion = denomincaion;
    }

    public String getCamposervicio_obr() {
        return camposervicio_obr;
    }

    public void setCamposervicio_obr(String camposervicio_obr) {
        this.camposervicio_obr = camposervicio_obr;
    }

    public String getProductos_obr() {
        return productos_obr;
    }

    public void setProductos_obr(String productos_obr) {
        this.productos_obr = productos_obr;
    }

    public String getHorario_obr() {
        return horario_obr;
    }

    public void setHorario_obr(String horario_obr) {
        this.horario_obr = horario_obr;
    }

    public String getInformacion_obr() {
        return informacion_obr;
    }

    public void setInformacion_obr(String informacion_obr) {
        this.informacion_obr = informacion_obr;
    }

    public String getPathicon() {
        return pathicon;
    }

    public void setPathicon(String pathicon) {
        this.pathicon = pathicon;
    }

    public String getNombrecorto_obr() {
        return nombrecorto_obr;
    }

    public void setNombrecorto_obr(String nombrecorto_obr) {
        this.nombrecorto_obr = nombrecorto_obr;
    }

    public String getPaginaweb_obr() {
        return paginaweb_obr;
    }

    public void setPaginaweb_obr(String paginaweb_obr) {
        this.paginaweb_obr = paginaweb_obr;
    }

    public boolean isEstado_obr() {
        return estado_obr;
    }

    public void setEstado_obr(boolean estado_obr) {
        this.estado_obr = estado_obr;
    }
	

    
}
