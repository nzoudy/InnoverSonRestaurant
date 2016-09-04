package fr.dotwiz.restauapi.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MENU")
public class Menu implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refMenu;
	
	private String nomDuMenu;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@ManyToOne
	@JoinColumn(name="id_restaurant")
	private Restaurant restaurant;
	
	@OneToMany(mappedBy="menu", fetch=FetchType.LAZY)
	private Collection<Entree> entrees;
	
	@OneToMany(mappedBy="menu", fetch=FetchType.LAZY)
	private Collection<Plat> plats;
	
	@OneToMany(mappedBy="menu", fetch=FetchType.LAZY)
	private Collection<Dessert> desserts;

	public Menu() {
	}

	public Integer getRefMenu() {
		return refMenu;
	}

	public void setRefMenu(Integer refMenu) {
		this.refMenu = refMenu;
	}

	public String getNomDuMenu() {
		return nomDuMenu;
	}

	public void setNomDuMenu(String nomDuMenu) {
		this.nomDuMenu = nomDuMenu;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Collection<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(Collection<Entree> entrees) {
		this.entrees = entrees;
	}

	public Collection<Plat> getPlats() {
		return plats;
	}

	public void setPlats(Collection<Plat> plats) {
		this.plats = plats;
	}

	public Collection<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(Collection<Dessert> desserts) {
		this.desserts = desserts;
	}

	
}
