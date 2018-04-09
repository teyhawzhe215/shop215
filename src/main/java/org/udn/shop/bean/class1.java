package org.udn.shop.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table (name="class")
public class class1 {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	private String classcode;
	
	@Column(name="class")
	private String classs;
	
	public class1() {
		
	}

	public class1(String id, String classcode, String classs) {
		super();
		this.id = id;
		this.classcode = classcode;
		this.classs = classs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClasscode() {
		return classcode;
	}

	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
	
	@Override
	public String toString(){
		
		return String.format(
                "class1[id=%d, classcode='%s', classs='%s']",
                id, classcode, classs);
	
	}
	
}
