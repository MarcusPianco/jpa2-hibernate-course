package br.ufal.ic.extra;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
 
@Entity
public class Person {
 
    @Id
    @GeneratedValue
    private int id;
 
    private String name;
 
    @ManyToMany(mappedBy="person_id")
    @JoinTable(name = "person_cellphone", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "cellphone_id"))
    private List<CellPhone> cells = new ArrayList<CellPhone>();

	public int getId() {
		return id;
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

	public List<CellPhone> getCells() {
		return cells;
	}

	public void setCells(List<CellPhone> cells) {
		this.cells = cells;
	}
 
   
}