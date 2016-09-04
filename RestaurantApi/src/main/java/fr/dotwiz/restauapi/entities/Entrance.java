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
public class Entrance implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refEntrance;
	
	private String nameEntrance;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name="FK_refEntrance")
	private Menu menu;
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Entrance() {
	}

	public Integer getRefEntrance() {
		return refEntrance;
	}

	public void setRefEntrance(Integer refEntrance) {
		this.refEntrance = refEntrance;
	}

	public String getNameEntrance() {
		return nameEntrance;
	}

	public void setNameEntrance(String nameEntrance) {
		this.nameEntrance = nameEntrance;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
		
}
