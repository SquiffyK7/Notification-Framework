import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.Queue;

public class NotificationSink extends UnicastRemoteObject implements NotificationSinkInterface {

    private Queue<Notification> notifications;

    public NotificationSink() throws RemoteException {
        notifications = new LinkedList<>();
    }

    public void register(NotificationSource NSource) {
        NSource.addSink(this);
    }

    public void postNotification(Notification notification) {
        notifications.add(notification);
    }

    public Notification receive() {
        return notifications.remove();
    }

}
