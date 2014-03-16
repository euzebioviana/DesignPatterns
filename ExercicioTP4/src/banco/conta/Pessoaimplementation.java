package banco.conta;


import seres.SerHumnano;

public class Pessoaimplementation implements Pessoa {

	private SerHumnano serHumnano;

	
	//construtor
	public Pessoaimplementation(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		
		String[] nomes = this.separarNome(nome);
		String primeiroNome = nomes[0];
		String segundoNome = nomes[1];

		this.serHumnano = new SerHumnano(primeiroNome, segundoNome, cpf);
		
	}
	
	private String[] separarNome(String nome){
		
		String[] nomeSeparado = new String[2];
		String[] nomes = nome.split(" ");
		nomeSeparado[0] = nomes[0];
		
		for(int i=1;i<nomes.length;i++){
			nomeSeparado[1] += nomes[i].concat(" ");
		}
		
		return nomeSeparado;
	}
	
	/* (non-Javadoc)
	 * @see banco.conta.Pessoa#getNome()
	 */
	@Override
	public String getNome() {
		
		String nomeCompleto = serHumnano.getPrimeiroNome() + " " + serHumnano.getSegundoNome();
		return nomeCompleto;

	}

	/* (non-Javadoc)
	 * @see banco.conta.Pessoa#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		String[] nomes = this.separarNome(nome);
		String primeiroNome = nomes[0];
		String segundoNome = nomes[1];
		
		serHumnano.setPrimeiroNome(primeiroNome);
		serHumnano.setSegundoNome(segundoNome);
	}

}
