package com.enterprise.spring.jpa.postgresql.model;

import javax.persistence.*;

@Entity
@Table(name = "table", schema = "sample")
public class SampleTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	public SampleTable() {

	}

	public SampleTable(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SampleTable [id=" + id + ", name=" + name + "]";
	}

}
