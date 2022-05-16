package com.borges.diario_eletronico.domain.dtos;

import java.io.Serializable;

import com.borges.diario_eletronico.domain.Turma;

public class TurmaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer ano_letivo;
	private Integer sala;
	private Integer serieNivelSubnivel;
	private String nomeSerieNivelSubnivel;
	
	public TurmaDTO() {
		super();
	}
	
	public TurmaDTO(Turma obj) {
		super();
		this.id = obj.getId();
		this.ano_letivo = obj.getAno_letivo();
		this.sala = obj.getSala();
		this.serieNivelSubnivel = obj.getSerieNivelSubnivel().getId();
		this.nomeSerieNivelSubnivel = obj.getSerieNivelSubnivel().getDescricao();
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno_letivo() {
		return ano_letivo;
	}

	public void setAno_letivo(Integer ano_letivo) {
		this.ano_letivo = ano_letivo;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public Integer getSerieNivelSubnivel() {
		return serieNivelSubnivel;
	}

	public void setSerieNivelSubnivel(Integer serieNivelSubnivel) {
		this.serieNivelSubnivel = serieNivelSubnivel;
	}

	public String getNomeSerieNivelSubnivel() {
		return nomeSerieNivelSubnivel;
	}

	public void setNomeSerieNivelSubnivel(String nomeSerieNivelSubnivel) {
		this.nomeSerieNivelSubnivel = nomeSerieNivelSubnivel;
	}

}
