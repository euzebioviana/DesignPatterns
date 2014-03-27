package banco.transacaoimplementation;

import java.math.BigDecimal;
import java.util.Date;

import transacao.TransacaoComposta;
import util.TransactionExecutionException;

import banco.conta.Conta;
import banco.transacao.TransacaoBancariaAbstrata;

public  class Transferencia extends TransacaoBancariaAbstrata{

	protected Transferencia(Date data, Conta origem, Conta destino,
			BigDecimal valor) {
		super(data, origem, destino, valor);
	}
	@Override
	public void executarEfetivamente() throws TransactionExecutionException{
		this.getOrigem().debitar(getValor());
		this.getDestino().creditar(getValor());
		
	}
	@Override
	public TransacaoComposta getTransacoComposta() {
		// TODO Auto-generated method stub
		return null;
	}



}
