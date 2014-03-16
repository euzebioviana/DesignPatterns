package util;

import transacao.Transacao;

public class TransactionExecutionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Transacao fonte;
	
	
	public TransactionExecutionException(String msg, Transacao fonte){
		super(msg);
		this.fonte = fonte;
	}


	public Transacao getFonte() {
		return fonte;
	}


	public void setFonte(Transacao fonte) {
		this.fonte = fonte;
	}

}
