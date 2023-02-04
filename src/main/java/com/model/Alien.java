package com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String color;
	@ManyToMany(mappedBy="alien",fetch=FetchType.EAGER)
	private Collection<Labtop> lap = new ArrayList<Labtop>();
public Collection<Labtop> getLap() {
		return lap;
	}
	public void setLap(Collection<Labtop> lap) {
		this.lap = lap;
	}
	//	@ManyToMany(mappedBy="alien")
//	private List<Labtop> laptop = new ArrayList<Labtop>();
//	public List<Labtop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Labtop> laptop) {
//		this.laptop = laptop;
//	}
	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
