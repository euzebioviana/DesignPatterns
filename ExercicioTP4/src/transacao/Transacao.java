package transacao;

import java.util.Date;



public interface  Transacao {
    
	public Date getDate();
	
	public void execute();
	
	public void aexecutar();

}
