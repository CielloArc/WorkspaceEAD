package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_TECNICO")
@SequenceGenerator(name="seqTecnico", sequenceName="SQ_T_TECNICO", allocationSize=1) 
public class Tecnico {
	
	@Id
	@GeneratedValue(generator="seqTecnico",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_TECNICO")
	private int codigo;
	
	@Column(name="NM_TECNICO")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_CONTRATACAO")
	private Calendar dataContratacao;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_TIME")
	private Time time;
	
	public Tecnico(){super();}
	
	public Tecnico(String nome, Calendar dataContratacao, byte[] foto) {
		super();
		setNome(nome);
		setDataContratacao(dataContratacao);
		setFoto(foto);
	}	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
}
