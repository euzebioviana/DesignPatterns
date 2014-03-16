package banco.conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.text.rtf.RTFEditorKit;

public class Conta {
	private Pessoa correntista;
	private Collection<Pessoa> secundarios;
	private String numero;
	private BigDecimal saldo = new BigDecimal(0);
	
	
	
	public Conta(Pessoa coPessoa,String numero){
		this.correntista = coPessoa;
		this.secundarios = new ArrayList<Pessoa>();
		this.numero = numero;
		
	}
	public Pessoa getCorrentista(){
		return correntista;
	}
	
	public void creditar(BigDecimal valor){
		if(valor != null){
			this.saldo = this.saldo.add(valor);
		
		}
	}
	
	public void debitar(BigDecimal valor){
	   if((valor ==null)||(valor.signum()==-1)){
		   System.out.println("Valor não informado ou Valor incorrento...");
		   
	   }else if(this.saldo.compareTo(valor)!=-1){
			this.saldo = this.saldo.subtract(valor);
			System.out.println("Valor debitado...");
		}else{
			System.out.println("Valor informado acima do limite...");
		}
	}
	
	public BigDecimal getSaldo(){
		return this.saldo;
	}
	
	public Collection<Pessoa> getSecundarios(){
		return Collections.unmodifiableCollection(this.secundarios);
	}
	
	public void adcionarSecundario(Pessoa secundario){
		if(!this.secundarios.contains(secundario)){
			secundarios.add(secundario);
		}
	}
	
	public void removerSecundario(Pessoa secundario){
		if(this.secundarios.contains(secundario)){
			secundarios.remove(secundario);
		}
	}

}
