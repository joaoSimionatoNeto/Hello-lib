package br.mackenzie.webapp.security.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import br.mackenzie.webapp.livro.Livro;
import java.util.List;

@Entity
@Table(name = "usuario")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;
	private String nome;
	private String telefone;

	@OneToMany(mappedBy = "usuario")
	private List<Livro> livros;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String n){
		this.nome = n;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setTelefone(String t){
		this.telefone = t;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public long getId(){
		return id;
	}

}