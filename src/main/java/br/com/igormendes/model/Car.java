package br.com.igormendes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private String ano;
	private String portas;
	private String propietario;
	private String telefone;
	
	public Car (int id, String placa,String marca, String modelo, String cor, String ano, String portas, String propietario, String telefone) {
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.portas = portas;
		this.propietario = propietario;
		this.telefone = telefone;
	}
	
	public Car() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String Telefone, String telefone) {
		this.telefone = telefone;
	}
	
}
