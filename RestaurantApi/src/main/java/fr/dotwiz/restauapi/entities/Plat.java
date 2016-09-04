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

	private String namePlat;

	private double price;
	
	@ManyToOne
	@JoinColumn(name="FK_refPlat")
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

	public String getNamePlat() {
		return namePlat;
	}

	public void setNamePlat(String namePlat) {
		this.namePlat = namePlat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
		
}
