package banco.transacaoimplementation;

import java.math.BigDecimal;
import java.util.Date;

import transacao.TransacaoComposta;
import util.TransactionExecutionException;

import banco.conta.Conta;
import banco.transacao.TransacaoBancariaAbstrata;

public class Retirada  extends TransacaoBancariaAbstrata{

	public Retirada(Date data, Conta origem, Conta destino, BigDecimal valor) {
		super(data, origem, null, valor);
	}
	
	@Override
	public  void executarEfetivamente () throws TransactionExecutionException{
		  if(this.getOrigem().getSaldo().compareTo(getValor())==-1){
			  throw new TransactionExecutionException("Saldo Insucifiente", this);
			  
		  }else{
			this.getOrigem().debitar(getValor());
		  }
			
	}

	@Override
	public TransacaoComposta getTransacoComposta() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
