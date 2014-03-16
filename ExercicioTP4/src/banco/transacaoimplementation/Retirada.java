package banco.transacaoimplementation;

import java.math.BigDecimal;
import java.util.Date;

import util.TransactionExecutionException;

import banco.conta.Conta;
import banco.transacao.TransacaoBancaria;

public class Retirada  extends TransacaoBancaria{

	protected Retirada(Date data, Conta origem, Conta destino, BigDecimal valor) {
		super(data, origem, null, valor);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void executar(){
		// TODO Auto-generated method stub
	  if(this.getOrigem().getSaldo().compareTo(getValor())==-1){
		  
	  }else{
		this.getOrigem().debitar(getValor());
	  }


}
