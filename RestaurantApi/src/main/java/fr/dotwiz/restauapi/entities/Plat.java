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
@Table(name="PLAT")
public class Plat implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refPlat;

	private String nomPlat;

	private double prix;

	@ManyToOne
	@JoinColumn(name="ref_plat_menu")
	private Menu menu;
	
	public Plat() {
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Integer getRefPlat() {
		return refPlat;
	}

	public void setRefPlat(Integer refPlat) {
		this.refPlat = refPlat;
	}

	public String getNomPlat() {
		return nomPlat;
	}

	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
		
}
