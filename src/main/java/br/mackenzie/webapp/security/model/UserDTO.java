package br.mackenzie.webapp.security.model;

public class UserDTO {
	private String username;
	private String password;
	private String nome;
	private String telefone;
	
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
}