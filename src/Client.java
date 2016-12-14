import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {

            NotificationSinkInterface NSink = (NotificationSinkInterface) Naming.lookup("rmi://localhost/notificationSink");
            System.out.println("Notification sink ready");

            Notification notification = NSink.receive();
            while(true) {
                if(notification!=null) {
                    System.out.println(notification.getMessage());
                }
                notification = NSink.receive();
            }

        } catch(Exception e) { System.out.println(e); }
    }

}
