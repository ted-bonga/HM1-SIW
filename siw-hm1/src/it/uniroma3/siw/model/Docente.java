package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity

public class Docente{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String cognome;



	@Column
	private LocalDate dateOfBirth;

	@Column
	private String luogoDiNascita;
	
	@Column
	private String partitaIVA;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private Corso corso;
	
	





	public Docente(String name, String cognome, LocalDate dateOfBirth, String luogoDiNascita,
			String partitaIVA) {
		super();

		this.name = name;
		this.cognome = cognome;
		this.dateOfBirth = dateOfBirth;
		this.luogoDiNascita = luogoDiNascita;
		this.partitaIVA = partitaIVA;
	}
	public Corso getCorso() {
		return corso;
	}
	public void setCorso(Corso corso) {
		this.corso = corso;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Docente [id=" + id + ", name=" + name + ", cognome=" + cognome + ", dateOfBirth=" + dateOfBirth
				+ ", luogoDiNascita=" + luogoDiNascita + ", partitaIVA=" + partitaIVA + "]";
	}






}

