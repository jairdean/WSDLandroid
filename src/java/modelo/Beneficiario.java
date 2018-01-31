package modelo;

import java.io.Serializable;

public class Beneficiario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8986968563604633653L;
	private int idben;
	private int ideben;
	private String descben;
	private String numben;
	private int idlug;
	private boolean est_ben;
	private String descEben;
	private String nomLug;
	private int idCas;
	private int idObr;
        
        
	
	public Beneficiario(int idb,String db,String nb, int idl,int ideb,boolean eb){
		super();
		this.idben=idb;
		this.descben=db;
		this.numben=nb;
		this.idlug=idl;
		this.ideben=ideb;
		this.est_ben=eb;
	}
	
	public Beneficiario(int idb,String db,String nb, int idl,int ideb,boolean eb,String descEben,String nomLug,int idObr, int idCas){
		super();
		this.idben=idb;
		this.descben=db;
		this.numben=nb;
		this.idlug=idl;
		this.ideben=ideb;
		this.est_ben=eb;
		this.descEben=descEben;
		this.nomLug=nomLug;
		this.idObr=idObr;
		this.idCas=idCas;
		
	}
	

	public boolean isEst_ben() {
		return est_ben;
	}

	public void setEst_ben(boolean est_ben) {
		this.est_ben = est_ben;
	}

	public int getIdben() {
		return idben;
	}

	public void setIdben(int idben) {
		this.idben = idben;
	}

	public String getDescben() {
		return descben;
	}

	public void setDescben(String descben) {
		this.descben = descben;
	}

	public String getNumben() {
		return numben;
	}

	public void setNumben(String numben) {
		this.numben = numben;
	}

	public int getIdeben() {
		return ideben;
	}

	public void setIdeben(int ideben) {
		this.ideben = ideben;
	}

	public int getIdlug() {
		return idlug;
	}

	public void setIdlug(int idlug) {
		this.idlug = idlug;
	}

	public String getDescEben() {
		return descEben;
	}

	public void setDescEben(String descEben) {
		this.descEben = descEben;
	}

	public String getNomLug() {
		return nomLug;
	}

	public void setNomLug(String nomLug) {
		this.nomLug = nomLug;
	}

	public int getIdCas() {
		return idCas;
	}

	public void setIdCas(int idCas) {
		this.idCas = idCas;
	}

	public int getIdObr() {
		return idObr;
	}

	public void setIdObr(int idObr) {
		this.idObr = idObr;
	}


	
	

	
}