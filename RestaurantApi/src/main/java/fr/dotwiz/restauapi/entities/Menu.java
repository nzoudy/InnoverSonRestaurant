package fr.dotwiz.restauapi.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class Menu implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refMenu;
	
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
