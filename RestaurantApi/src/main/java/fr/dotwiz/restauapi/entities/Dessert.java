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
@Table(name="DESSERT")
public class Dessert implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refDessert;

	private String nameDessert;

	private double price;

	@ManyToOne
	@JoinColumn(name="ref_dessert_menu")
	private Menu menu;
	
	public Dessert() {
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Integer getRefDessert() {
		return refDessert;
	}

	public void setRefDessert(Integer refDessert) {
		this.refDessert = refDessert;
	}

	public String getNameDessert() {
		return nameDessert;
	}

	public void setNameDessert(String nameDessert) {
		this.nameDessert = nameDessert;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
