package fr.dotwiz.restauapi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DESSERT")
public class Dessert implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refDessert;

	private String nomDessert;

	private double price;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@ManyToOne
	@JoinColumn(name="ref_dessert_menu")
	private Menu menu;
	
	public Dessert() {
	}

	public Integer getRefDessert() {
		return refDessert;
	}

	public void setRefDessert(Integer refDessert) {
		this.refDessert = refDessert;
	}

	public String getNomDessert() {
		return nomDessert;
	}

	public void setNomDessert(String nomDessert) {
		this.nomDessert = nomDessert;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
}
