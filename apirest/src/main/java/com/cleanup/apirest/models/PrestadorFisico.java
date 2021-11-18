package com.cleanup.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRESTADORFISICO")
public class PrestadorFisico implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_prestadorfisico;
	
	private String nome_prestadorfisico;
	private String sexo_prestadorfisico;
	private String cpf_prestadorfisico;
	
	public long getId_prestadorfisico() {
		return id_prestadorfisico;
	}
	public void setId_prestadorfisico(long id_prestadorfisico) {
		this.id_prestadorfisico = id_prestadorfisico;
	}
	public String getNome_prestadorfisico() {
		return nome_prestadorfisico;
	}
	public void setNome_prestadorfisico(String nome_prestadorfisico) {
		this.nome_prestadorfisico = nome_prestadorfisico;
	}
	public String getSexo_prestadorfisico() {
		return sexo_prestadorfisico;
	}
	public void setSexo_prestadorfisico(String sexo_prestadorfisico) {
		this.sexo_prestadorfisico = sexo_prestadorfisico;
	}
	public String getCpf_prestadorfisico() {
		return cpf_prestadorfisico;
	}
	public void setCpf_prestadorfisico(String cpf_prestadorfisico) {
		this.cpf_prestadorfisico = cpf_prestadorfisico;
	}
	
	
}
