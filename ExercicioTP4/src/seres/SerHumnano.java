package seres;

public class SerHumnano {
	
	private String primeiroNome;
	private String segundoNome;
	private String cpf;
	
	
	public SerHumnano(String primeiroNome,String segundoNome,String cpf){
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.cpf = cpf;
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getSegundoNome() {
		return segundoNome;
	}


	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
