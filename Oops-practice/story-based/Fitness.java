interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Activity data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Steps and calories logged.");
    }

    public void generateReport() {
        System.out.println("Fitness report generated.");
    }

    public void sendAlert() {
        System.out.println("Workout reminder sent.");
    }
}

public class Fitness {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}