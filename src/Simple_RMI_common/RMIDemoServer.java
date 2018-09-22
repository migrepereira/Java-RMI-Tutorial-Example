// Server

package Simple_RMI_common;
import java.rmi.Naming;


public class RMIDemoServer {
	public static void main(String [] args) throws Exception {
		// Instantiates RMIDemoInput class
		RMIDemoInput rMIDemoInput = new RMIDemoInput();
		
		//Binds it to RMI register/ is how we talk to client side
		Naming.rebind("RMIDemo", rMIDemoInput);
		System.out.println("RMIDemo object is now bound to the name 'RMIDemo' and can now be referenced...");
	}
}
