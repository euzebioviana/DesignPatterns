package banco.transacao;

import java.math.BigDecimal;
import java.util.Date;

import banco.conta.Conta;

import transacao.TransacaoAbstrata;

public abstract class TransacaoBancaria extends TransacaoAbstrata{
	private Conta origem;
	private Conta destino;
	private BigDecimal valor = new BigDecimal(0);

	protected TransacaoBancaria(Date data,Conta origem,Conta destino,BigDecimal valor) {
		super(data);
		// TODO Auto-generated constructor stub
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aexecutar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executarEfetivamente() {
		// TODO Auto-generated method stub
		
	}
	
	public Conta getOrigem(){
		return this.origem;
	}
	
	public Conta getDestino(){
		return this.destino;
	}

}
