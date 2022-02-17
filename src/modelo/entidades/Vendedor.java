package modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	private Date dataAniversario;
	private Double salarioBase;
	
	private Departamento departamento;
	
	public Vendedor() {
	}

	public Vendedor(Integer id, String nome, String email, Date dataAniversario, Double salarioBase,
			Departamento departamento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nome=" + nome + ", email=" + email + ", dataAniversario=" + dataAniversario
				+ ", salarioBase=" + salarioBase + ", departamento=" + departamento + "]";
	}
}
