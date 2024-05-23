package br.mackenzie.webapp.livro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import br.mackenzie.webapp.editora.Editora;
import br.mackenzie.webapp.security.model.DAOUser;
@Entity
@Table(name="livro")
public class Livro {

	@Id @GeneratedValue
	private long id;
	private String titulo;
	private String ano;
	private String autor;
  private String genero;

	@ManyToOne
	private DAOUser usuario;

	@ManyToOne
	private Editora editora;
		
	public Livro() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public DAOUser getDAOUser() {
		return usuario;
	}

	public void setDAOUser(DAOUser usuario) {
		this.usuario = usuario;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
