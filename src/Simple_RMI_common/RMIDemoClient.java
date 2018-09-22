package Simple_RMI_common;
import java.rmi.Naming;

public class RMIDemoClient {
	public static void main(String[] args) throws Exception {
		// The two input parameters are the name of the server
		// (in this case, just use "localhost") and the name of
		// the client accessing the server
		if (args.length == 2) {
			// This enables the client to communicate with the server
			String url = new String ("rmi://" + args[0] + "/RMIDemo");
			
			// This casts whatever comes back to the interface as RMIDemo
			// type
			RMIDemo rMIDemo = (RMIDemo)Naming.lookup(url);
			
			// Pass the name of the client into the method RMIDemoInput
			String serverReply = rMIDemo.doCommunicate(args[1]);
			
			// Prints out what came back from the server
			System.out.println("Server Reply: " + serverReply);
		} else {
			// First argument is server name, echoed back from server
			// If no argument, this is the error message that prints out
			System.err.println("Usage: RMIDemoClient <server> <name>");
		}
		
		
		
	}
}
