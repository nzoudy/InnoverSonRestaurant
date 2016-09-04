package fr.dotwiz.restauapi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class Entree implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refEntree;
	
	private String nomEntree;
	
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="ref_entree_menu")
	private Menu menu;

	public Entree() {
	}
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Integer getRefEntree() {
		return refEntree;
	}

	public void setRefEntree(Integer refEntree) {
		this.refEntree = refEntree;
	}

	public String getNomEntree() {
		return nomEntree;
	}

	public void setNomEntree(String nomEntree) {
		this.nomEntree = nomEntree;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
		
}
