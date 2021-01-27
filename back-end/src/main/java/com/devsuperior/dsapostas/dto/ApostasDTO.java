package com.devsuperior.dsapostas.dto;

import java.io.Serializable;

import com.devsuperior.dsapostas.entities.Apostas;

public class ApostasDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer hunch1;
	private Integer hunch2;
	private Integer hunch3;
	private Integer hunch4;
	private Integer hunch5;
	
	public ApostasDTO() {
		super();
	}

	public ApostasDTO(Long id, Integer hunch1, Integer hunch2, Integer hunch3, Integer hunch4, Integer hunch5) {
		super();
		this.id = id;
		this.hunch1 = hunch1;
		this.hunch2 = hunch2;
		this.hunch3 = hunch3;
		this.hunch4 = hunch4;
		this.hunch5 = hunch5;
	}
	
	public ApostasDTO(Apostas entity) {
		super();
		this.id = entity.getId();
		this.hunch1 = entity.getHunch1();
		this.hunch2 = entity.getHunch2();
		this.hunch3 = entity.getHunch3();
		this.hunch4 = entity.getHunch4();
		this.hunch5 = entity.getHunch5();
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

}
