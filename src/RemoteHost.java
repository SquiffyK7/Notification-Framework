import java.rmi.Naming;

public class RemoteHost {

    public static void main(String[] args) {
        try {
            NotificationSource notificationSource = new NotificationSource();

            MyClock clock = new MyClock(notificationSource);

            Thread clockThread = new Thread(clock);
            clockThread.start();

            NotificationSink notificationSink = new NotificationSink();
            Naming.rebind("notificationSink", notificationSink);
            System.out.println("Notification sink ready");

            notificationSink.register(notificationSource);


        } catch(Exception e) { System.out.println(e); }

    }
}
