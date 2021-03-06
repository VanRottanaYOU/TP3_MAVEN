package fr.codevalle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mairie")

public class Mairie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
