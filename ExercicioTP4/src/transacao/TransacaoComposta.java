package transacao;

import java.util.Iterator;

public interface TransacaoComposta extends Transacao{
	
	public void adcionarTransacao(Transacao filha);
	public void removerTransacao(Transacao filha);
    public Iterator<Transacao> getTransacoesFilhas();

}
