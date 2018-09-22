package Simple_RMI_common;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemoInput extends UnicastRemoteObject implements RMIDemo {
	private static final long serialVersionUID = 1L;
	protected RMIDemoInput() throws RemoteException {
		super();
	}
	public String doCommunicate(String name) throws RemoteException {
		return "\nServer says: Hi " + name + "\n";
	}
}


