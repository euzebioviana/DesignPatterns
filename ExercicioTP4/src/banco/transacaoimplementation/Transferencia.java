package banco.transacaoimplementation;

import java.math.BigDecimal;
import java.util.Date;

import util.TransactionExecutionException;

import banco.conta.Conta;
import banco.transacao.TransacaoBancaria;

public  class Transferencia extends TransacaoBancaria{

	protected Transferencia(Date data, Conta origem, Conta destino,
			BigDecimal valor) {
		super(data, origem, destino, valor);
	}
	@Override
	public void executarEfetivamente() throws TransactionExecutionException{
		this.getOrigem().debitar(getValor());
		this.getDestino().creditar(getValor());
		
	}



}
