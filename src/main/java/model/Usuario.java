package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	@Id
	@Column(name = "cod_usua")
	private int codigo; // cod_usua
	
	@Column(name = "nom")
	private String nomnbre;
	
	@Column(name = "ape_usua")
	private String apellido;
	
	@Column(name = "usr_usua")
	private String usuario;
	
	@Column(name = "cla_usua")
	private String clave;
	
	@Column(name = "fna_usua")
	private String fchnacim;
	
	@Column(name = "idtipo")
	private int tipo;
	
	@Column(name = "est_usua")
	private int estado;
	 
	// to String
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nomnbre=" + nomnbre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + ", fchnacim=" + fchnacim + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
	// Constructor

	public Usuario(int codigo, String nomnbre, String apellido, String usuario, String clave, String fchnacim, int tipo,
			int estado) {
		super();
		this.codigo = codigo;
		this.nomnbre = nomnbre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fchnacim = fchnacim;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	// constructor vacio
	public Usuario() {
		super();
	}


	// set y  get
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomnbre() {
		return nomnbre;
	}
	public void setNomnbre(String nomnbre) {
		this.nomnbre = nomnbre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFchnacim() {
		return fchnacim;
	}
	public void setFchnacim(String fchnacim) {
		this.fchnacim = fchnacim;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
