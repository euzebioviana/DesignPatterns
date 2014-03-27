package banco.conta;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;

public interface Conta {

	public abstract Pessoa getCorrentista();

	public abstract void creditar(BigDecimal valor);

	public abstract void debitar(BigDecimal valor);

	public abstract BigDecimal getSaldo();

	public abstract Iterator<Pessoa> getDependentes();

	public abstract void adcionarDependente(Pessoa dependente);

	public abstract void removerDependente(Pessoa dependente);

}