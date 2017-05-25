package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_NAC_LIVRO")
public class Livro {
	@Id
	@Column(name="NR_ISBN", length=60)
	private String isbn;
	
	@Column(name="DS_TITULO", nullable=false, length=200)
	private String titulo;
	
	@Lob
	@Column(name="FL_CAPA")
	private byte[] capa;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_EDITORA")
	private Editora editora;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="T_NAC_AUTOR_LIVRO",
			joinColumns=@JoinColumn(name="NR_ISBN"),
			inverseJoinColumns=@JoinColumn(name="CD_AUTOR"))
	private List<Autor> autores;
	
	
	public Livro(){
		super();
	}
	
	

	public Livro(String isbn, String titulo, byte[] capa, Editora editora) {
		super();
		setIsbn(isbn);
		setTitulo(titulo);
		setCapa(capa);
		setEditora(editora);
	}
	
	public void adicionarAutor(Autor autor){
		autores.add(autor);
	}



	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}	
}
