import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyService extends Remote {
    String performOperation(String input) throws RemoteException;
}
