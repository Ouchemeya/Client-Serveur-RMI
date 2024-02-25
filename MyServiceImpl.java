import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyServiceImpl extends UnicastRemoteObject implements MyService {

    protected MyServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String performOperation(String input) throws RemoteException {
        // Ajoutez votre logique métier ici
        return "Serveur RMI : " + input;
    }

    public static void main(String[] args) {
        try {
            // Créez un registre RMI sur le port par défaut (1099)
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            
            // Créez une instance du service
            MyService myService = new MyServiceImpl();

            // Enregistrez le service avec le nom "MyService"
            java.rmi.Naming.rebind("MyService", myService);

            System.out.println("Serveur RMI prêt...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
