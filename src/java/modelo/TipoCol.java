package modelo;

import java.io.Serializable;

public class TipoCol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4627717272387956815L;
	private int idtcol;
	private String desctcol;
	private boolean esttcol;	
	
	public TipoCol(int idtc,String detc,boolean etc){
		super();
		this.idtcol=idtc;
		this.desctcol=detc;
		this.esttcol=etc;
	}
	
	public TipoCol(){
		super();
	}

	public boolean isEsttcol() {
		return esttcol;
	}

	public void setEsttcol(boolean esttcol) {
		this.esttcol = esttcol;
	}

	public int getIdtcol() {
		return idtcol;
	}

	public void setIdtcol(int idtcol) {
		this.idtcol = idtcol;
	}

	public String getDesctcol() {
		return desctcol;
	}

	public void setDesctcol(String desctcol) {
		this.desctcol = desctcol;
	}

	
	
}