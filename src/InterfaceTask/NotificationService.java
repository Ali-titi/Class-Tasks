package InterfaceTask;

public interface NotificationService {
    void sendNotification(String message);
    default void priority(String priority){
        System.out.print("the default message");
    }
}
