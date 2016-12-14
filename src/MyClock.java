public class MyClock implements Runnable {

    private NotificationSource notificationSource;

    public MyClock(NotificationSource notificationSource) {
        this.notificationSource = notificationSource;
    }

    public void run() {

        while(true) {
            try { Thread.sleep(1000); }
            catch (Exception e) { System.out.println(e); }

            Notification message = new Notification();
            message.setMessage("A second has elasped");
            notificationSource.notifySinks(message);
            System.out.println("Message posted");
        }

    }

}
