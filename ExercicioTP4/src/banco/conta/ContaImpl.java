package banco.conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.text.rtf.RTFEditorKit;

public class ContaImpl implements Conta {
	private Pessoa correntista;
	private Collection<Pessoa> secundarios;
	private String numero;
	private BigDecimal saldo = new BigDecimal(0);
	
	
	
	public ContaImpl(Pessoa coPessoa,String numero){
		this.correntista = coPessoa;
		this.secundarios = new ArrayList<Pessoa>();
		this.numero = numero;
		
	}
	/* (non-Javadoc)
	 * @see banco.conta.Conta#getCorrentista()
	 */
	@Override
	public Pessoa getCorrentista(){
		return correntista;
	}
	
	/* (non-Javadoc)
	 * @see banco.conta.Conta#creditar(java.math.BigDecimal)
	 */
	@Override
	public void creditar(BigDecimal valor){
		if(valor != null){
			this.saldo = this.saldo.add(valor);
		
		}
	}
	
	/* (non-Javadoc)
	 * @see banco.conta.Conta#debitar(java.math.BigDecimal)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see banco.conta.Conta#getSaldo()
	 */
	@Override
	public BigDecimal getSaldo(){
		return this.saldo;
	}
	
	/* (non-Javadoc)
	 * @see banco.conta.Conta#getSecundarios()
	 */
	@Override
	public Iterator<Pessoa> getDependentes(){
		return Collections.unmodifiableCollection(this.secundarios).iterator();
	}
	
	/* (non-Javadoc)
	 * @see banco.conta.Conta#adcionarSecundario(banco.conta.Pessoa)
	 */
	@Override
	public void adcionarDependente(Pessoa dependente){
		if(!this.secundarios.contains(dependente)){
			secundarios.add(dependente);
		}
	}
	
	/* (non-Javadoc)
	 * @see banco.conta.Conta#removerSecundario(banco.conta.Pessoa)
	 */
	@Override
	public void removerDependente(Pessoa dependente){
		if(this.secundarios.contains(dependente)){
			secundarios.remove(dependente);
		}
	}

}
