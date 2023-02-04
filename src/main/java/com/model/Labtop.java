package com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Labtop {
	@Id
	private int id;
	private String name;
	@ManyToMany
	private Collection<Alien> alien = new ArrayList<Alien>();

	public Collection<Alien> getAlien() {
		return alien;
	}
	public void setAlien(Collection<Alien> alien) {
		this.alien = alien;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Labtop [id=" + id + ", name=" + name + ", alien=" + alien + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
