package Teste;

import java.math.BigDecimal;

import transacao.GerenteTransacao;
import util.TransactionExecutionException;

import banco.conta.Conta;
import banco.conta.ContaImpl;
import banco.conta.Pessoa;
import banco.conta.Pessoaimplementation;
import banco.transacaoimplementation.Retirada;
import banco.transacaoimplementation.Transferencia;


public class UsaConta {

	/**
	 * @param args
	 * @throws TransactionExecutionException 
	 */
	public static void main(String[] args) throws TransactionExecutionException {
		// TODO Auto-generated method stub
		
		Pessoa euzebio  = new Pessoaimplementation("Euzébio Viana", "133.815.837-60");
		
		Pessoa lucas = new Pessoaimplementation("Lucas Viana","123.456.789-00");
		
		Conta conta = new ContaImpl(euzebio, "7174-4");
		
		Conta conta2 = new ContaImpl(lucas, "1234-5");
		
		conta.creditar(new BigDecimal(1000));
		
		conta2.creditar(new BigDecimal(500));
		
		BigDecimal valor = new BigDecimal(500);
		
		
		Transferencia transferencia = new Transferencia(null, conta, conta2, valor);
		
		Retirada retirada = new Retirada(null, conta2, null, valor);
		
		GerenteTransacao gerenteTransacao = new GerenteTransacao();
		gerenteTransacao.registrarTransacoesAExecutar(transferencia);
		gerenteTransacao.registrarTransacoesAExecutar(retirada);
		
		gerenteTransacao.executar();
		
		System.out.println(conta.getCorrentista().getNome());
		System.out.println(conta.getSaldo());
		
		
		System.out.println(conta2.getCorrentista().getNome());
		System.out.println(conta2.getSaldo());
		
		
		
		
		
		
		

	}

}
