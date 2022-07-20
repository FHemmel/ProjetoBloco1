package br.com.jvsangue;

public class Usuario {

	private String nome;
	private int idade;
	private long cpf;
	private int genero;
	private String endereco;
	private int regiao;
	private String usuario;
	private String senha;
	
	public Usuario(String nome, int idade, long cpf, int genero, String endereco, int regiao, String usuario,
			String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
		this.endereco = endereco;
		this.regiao = regiao;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getRegiao() {
		return regiao;
	}
	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}