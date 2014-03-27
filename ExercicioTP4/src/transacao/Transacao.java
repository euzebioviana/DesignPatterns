package transacao;

import java.util.Date;

import util.TransactionExecutionException;



public interface  Transacao  {
    
	public Date getDate();
	
	public void execute();
	
	public void executar() throws TransactionExecutionException;
	public TransacaoComposta getTransacoComposta();

}
