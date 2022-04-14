package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import java.sql.Date;

import javax.persistence.Column;

@Entity
@NamedQuery(name = "findAllCourse", query = "SELECT p FROM Corso p")
public class Corso{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;


	@Column
	private Date dataInizio;

	@Column
	private String durataInMesi;
	
	public Corso() {
	}

	public Corso(String name,Date dataInizio, String durataInMesi) {
		this.name = name;
		this.dataInizio=dataInizio;
		this.durataInMesi=durataInMesi;
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
		sb.append("Product");
		sb.append("{id=").append(id);
		sb.append(", name='").append(name);
		sb.append("}\n");
		return sb.toString();
	}
}

