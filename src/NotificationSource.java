import java.rmi.RemoteException;
import java.util.HashSet;
import java.util.Set;

public class NotificationSource {

    Set<NotificationSink> sinks;

    public NotificationSource() throws RemoteException{
        super();
        this.sinks = new HashSet<>();
    }

    public void notifySinks(Notification notification) {
        for(NotificationSink sink : sinks) {
            sink.postNotification(notification);
            System.out.println(sinks.size());
        }
    }

    public void addSink(NotificationSink sink) {
        this.sinks.add(sink);
    }

}
