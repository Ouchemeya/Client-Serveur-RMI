import java.rmi.Naming;

public class MyClient {

    public static void main(String[] args) {
        try {
            // Récupérez la référence distante du service
            MyService myService = (MyService) Naming.lookup("rmi://localhost/MyService");

            // Appelez une méthode distante
            String result = myService.performOperation("Hello from Client");

            System.out.println("Résultat du serveur RMI : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
