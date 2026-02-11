package InterfaceTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your device ID: ");
        String deviceId = scanner.nextLine();

        System.out.print("Enter priority message: ");
        String messagePriority = scanner.nextLine();

        System.out.print("Enter message to send: ");
        String message = scanner.nextLine();


        NotificationService nt = new PushNotification(deviceId);

        nt.sendNotification(message);
        nt.priority(messagePriority);

        scanner.close();
    }
}
