package transacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import transacao.Transacao;


import util.TransactionExecutionException;

public class TransacaoCompostaImplementation extends TransacaoAbstrata implements TransacaoComposta{
	private List<Transacao> filhas;

	protected TransacaoCompostaImplementation(Date data) {
		super(data);
		this.filhas = new ArrayList<Transacao>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TransacaoComposta getTransacoComposta() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void adcionarTransacao(Transacao filha) {
		// TODO Auto-generated method stub
		//verifica se não contém a transação e adciona a transação
		if(filha.getDate().after(getDate())){
			throw new RuntimeException();
		}
		if(!this.filhas.contains(filha)){
			this.filhas.add(filha);
		}
		
	}

	@Override
	public void removerTransacao(Transacao filha) {
		// TODO Auto-generated method stub
		//verifica se contém a transação e remove a transação
		if(this.filhas.contains(filha)){
			this.filhas.remove(filha);
		}
		
	}

	@Override
	public Iterator<Transacao> getTransacoesFilhas() {
		// TODO Auto-generated method stub
		return Collections.unmodifiableList(this.filhas).iterator();
	}

	@Override
	public void executarEfetivamente() throws TransactionExecutionException {
		// TODO Auto-generated method stub
		for(Transacao transacao:filhas){
			transacao.executar();
		}
		
	}

}
