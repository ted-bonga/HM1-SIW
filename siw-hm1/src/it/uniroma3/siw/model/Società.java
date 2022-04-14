package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import java.sql.Date;

import javax.persistence.Column;

@Entity

public class Società{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String ragioneSociale;


	@Column
	private String indirizzo;
	
	@Column 
	private String numeroCivico;
	
	@Column 
	private String comune;
	
	@Column 
	private String cap;
	
	@Column 
	private String provincia;
	
	@Column
	private String numeroDiTelefono;
	






	public Società(Long id, String ragioneSociale, String indirizzo, String numeroCivico, String comune, String cap,
			String provincia, String numeroDiTelefono) {
		this.id = id;
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.numeroCivico = numeroCivico;
		this.comune = comune;
		this.cap = cap;
		this.provincia = provincia;
		this.numeroDiTelefono = numeroDiTelefono;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Azienda [id=" + id + ", ragioneSociale=" + ragioneSociale + ", indirizzo=" + indirizzo
				+ ", numeroCivico=" + numeroCivico + ", comune=" + comune + ", cap=" + cap + ", provincia=" + provincia
				+ ", numeroDiTelefono=" + numeroDiTelefono + "]";
	}









}

