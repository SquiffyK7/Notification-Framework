import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NotificationSinkInterface extends Remote {

    Notification receive() throws RemoteException;
    void register(NotificationSource notificationSource) throws RemoteException;


}
