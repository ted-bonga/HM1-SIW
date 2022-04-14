package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;

@Entity

public class Allievo{

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
	private String numeroMatricola;
	
	@Column
	private String email;
	


	public Allievo(String name,String cognome,LocalDate dateOfBirth,String luogoDiNascita,String numeroMatricola,String email) {
		this.name = name;
		this.cognome=cognome;
		this.dateOfBirth=dateOfBirth;
		this.luogoDiNascita=luogoDiNascita;
		this.numeroMatricola=numeroMatricola;
		this.email=email;
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






	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Allievo");
		sb.append("{id=").append(id);
		sb.append(", name='").append(name);
		sb.append(",cognome='").append(cognome);
		sb.append(",dataDiNascita='").append(dateOfBirth);
		sb.append(",luogoDiNascita='").append(luogoDiNascita);
		sb.append(",numeroMatricola='").append(numeroMatricola);
		sb.append(",email='").append(email);
		sb.append("}\n");
		return sb.toString();
	}
}

