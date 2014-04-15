package banco.transacao;

import java.math.BigDecimal;
import java.util.Date;

import banco.conta.Conta;

import transacao.TransacaoAbstrata;
import util.TransactionExecutionException;

public abstract class TransacaoBancariaAbstrata extends TransacaoAbstrata implements TransacaoBancaria{
	private Conta origem;
	private Conta destino;
	private BigDecimal valor = new BigDecimal(0);

	public TransacaoBancariaAbstrata(Date data,Conta origem,Conta destino,BigDecimal valor) {
		super(data);
		// TODO Auto-generated constructor stub
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}
	
	public TransacaoBancariaAbstrata(Date data,Conta origem,BigDecimal valor){
		super(data);
		this.origem = origem;
		this.valor = valor;
	}
	

	@Override
	public  void executarEfetivamente() throws TransactionExecutionException{ 
	
		// TODO Auto-generated method st
	}
	
	/* (non-Javadoc)
	 * @see banco.transacao.TransacaoBancaria#getOrigem()
	 */
	@Override
	public Conta getOrigem(){
		return this.origem;
	}
	
	/* (non-Javadoc)
	 * @see banco.transacao.TransacaoBancaria#getDestino()
	 */
	@Override
	public Conta getDestino(){
		return this.destino;
	}
	
	/* (non-Javadoc)
	 * @see banco.transacao.TransacaoBancaria#getValor()
	 */
	@Override
	public BigDecimal getValor(){
		return this.valor;
	}

}
