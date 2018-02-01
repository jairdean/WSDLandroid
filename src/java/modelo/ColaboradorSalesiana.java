/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 
 */
public class ColaboradorSalesiana {
    private static final long serialVersionUID = -8986968563604633653L;
	private int id_col;
	private int id_lug;
        private int id_tcol;
        private int numero_col;
	private boolean est_col;
	private String nomb_lug;
	private String desc_tcol;
	private int idObr;
        private int idCas;

    public ColaboradorSalesiana(int numero_col, boolean est_col, String nomb_lug, String desc_tcol) {
        super();
        this.numero_col = numero_col;
        this.est_col = est_col;
        this.nomb_lug = nomb_lug;
        this.desc_tcol = desc_tcol;
    }

        
        
    public int getId_col() {
        return id_col;
    }

    public void setId_col(int id_col) {
        this.id_col = id_col;
    }

    public int getId_lug() {
        return id_lug;
    }

    public void setId_lug(int id_lug) {
        this.id_lug = id_lug;
    }

    public int getId_tcol() {
        return id_tcol;
    }

    public void setId_tcol(int id_tcol) {
        this.id_tcol = id_tcol;
    }

    public int getNumero_col() {
        return numero_col;
    }

    public void setNumero_col(int numero_col) {
        this.numero_col = numero_col;
    }

    public boolean isEst_col() {
        return est_col;
    }

    public void setEst_col(boolean est_col) {
        this.est_col = est_col;
    }

    public String getNomb_lug() {
        return nomb_lug;
    }

    public void setNomb_lug(String nomb_lug) {
        this.nomb_lug = nomb_lug;
    }

    public String getDesc_tcol() {
        return desc_tcol;
    }

    public void setDesc_tcol(String desc_tcol) {
        this.desc_tcol = desc_tcol;
    }

    public int getIdObr() {
        return idObr;
    }

    public void setIdObr(int idObr) {
        this.idObr = idObr;
    }

    public int getIdCas() {
        return idCas;
    }

    public void setIdCas(int idCas) {
        this.idCas = idCas;
    }
	
        
        
    
}
