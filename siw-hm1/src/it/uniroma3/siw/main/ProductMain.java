package it.uniroma3.siw.main;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.siw.model.Allievo;
import it.uniroma3.siw.model.Corso;
import it.uniroma3.siw.model.Docente;

public class ProductMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("homework1");
		EntityManager em = emf.createEntityManager();
		LocalDate date=LocalDate.of(2020, Month.JANUARY, 8);
		LocalDate myDate2 = LocalDate.of(2014, 2, 14);
		LocalDate myDate3 = LocalDate.of(2015, 2, 14);
		Allievo allievo=new Allievo("Ted","Bonga",date,"Roma","546569","ted.bonga@stud.uniroma3.it");
		Corso siw=new Corso("siw", myDate2, "4");
		Docente docente=new Docente("idk", "fu", myDate3, "roma", "lol");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(allievo);
		em.persist(siw);
		em.persist(docente);
		docente.setCorso(siw);
		tx.commit();
		em.close();
		emf.close();
	}
}
















