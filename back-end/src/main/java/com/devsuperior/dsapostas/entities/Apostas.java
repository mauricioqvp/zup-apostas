package com.devsuperior.dsapostas.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tb_apostas")
public class Apostas implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer hunch1;
	private Integer hunch2;
	private Integer hunch3;
	private Integer hunch4;
	private Integer hunch5;
	
	@JsonManagedReference
	@ManyToMany(mappedBy = "aposta")
	private List<Players> player = new ArrayList<>();
	
	public Apostas() {
		
	}

	public Apostas(Long id, Integer hunch1, Integer hunch3, Integer hunch4, Integer hunch5) {
		super();
		this.id = id;
		this.hunch1 = hunch1;
		this.hunch3 = hunch3;
		this.hunch4 = hunch4;
		this.hunch5 = hunch5;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHunch1() {
		return hunch1;
	}

	public void setHunch1(Integer hunch1) {
		this.hunch1 = hunch1;
	}

	public Integer getHunch2() {
		return hunch2;
	}

	public void setHunch2(Integer hunch2) {
		this.hunch2 = hunch2;
	}

	public Integer getHunch3() {
		return hunch3;
	}

	public void setHunch3(Integer hunch3) {
		this.hunch3 = hunch3;
	}

	public Integer getHunch4() {
		return hunch4;
	}

	public void setHunch4(Integer hunch4) {
		this.hunch4 = hunch4;
	}

	public Integer getHunch5() {
		return hunch5;
	}

	public void setHunch5(Integer hunch5) {
		this.hunch5 = hunch5;
	}

	public List<Players> getPlayer() {
		return player;
	}
	
	public void setPlayer(List<Players> player) {
		this.player = player;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apostas other = (Apostas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
