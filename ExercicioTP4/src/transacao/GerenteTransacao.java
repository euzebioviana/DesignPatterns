package transacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class GerenteTransacao {
	private List<Transacao> aExecutar = new ArrayList<Transacao>();
	private List<Transacao> aExecutadas = new ArrayList<Transacao>();
	private List<Transacao> nExecutadas = new ArrayList<Transacao>();
	
	//construtor da Classe GerenteTransação
	public GerenteTransacao(){
		
	}
	
	public void executarTransacoes(){

		
	}
	
	public void registrarTransacoesAExecutar(Transacao transacao){
	   if(!(this.aExecutar).contains(transacao)){
		   this.aExecutar.add(transacao);
	   }else{
		   throw new RuntimeException();
			   
		   }
		
	}
	
	public void desregistrarTransacoesAExecutar(Transacao transacao){
		this.aExecutar.remove(transacao);
		
	}
	
	public Iterator<Transacao> getTransacoesExecutadas(){
		return Collections.unmodifiableList(this.aExecutadas).iterator();
	}
	
	public Iterator<Transacao> getTransacoesAExecutar(){
		return Collections.unmodifiableList(this.aExecutar).iterator();
	}
	
	public Iterator<Transacao> getTransacoesNaoExecutadas(){
		return Collections.unmodifiableList(this.nExecutadas).iterator();
	}

}
