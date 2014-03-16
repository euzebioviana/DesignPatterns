package transacao;

import java.util.Date;

import util.TransactionExecutionException;

public abstract class TransacaoAbstrata implements Transacao{
	boolean executada = false;
	Date date;
	
	
	
	protected  TransacaoAbstrata(Date data){
		this.date = data;
	}
	
	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return this.date;
	}
	
	public final void  executar() throws TransactionExecutionException{
		if(!this.executada()){
			this.executarEfetivamente();
			this.executada = true;
		}
		
	}
	
	public abstract void executarEfetivamente() throws TransactionExecutionException;
	
	public boolean executada(){
		return this.executada;
	}

}
