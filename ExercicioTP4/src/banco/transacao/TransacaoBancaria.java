package banco.transacao;

import java.math.BigDecimal;

import banco.conta.Conta;

public interface TransacaoBancaria {

	public abstract Conta getOrigem();

	public abstract Conta getDestino();

	public abstract BigDecimal getValor();

}