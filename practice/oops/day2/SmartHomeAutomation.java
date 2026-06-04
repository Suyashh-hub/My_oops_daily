class SmartDevice {
    private String name;
    private boolean isFullyCharged;

    public SmartDevice(String name) {
        this.name = name;
        this.isFullyCharged = true;
    }

    public String getName() {
        return name;
    }

    public void performAction() {
        System.out.println(name + " is running a diagnostic check.");
    }
}

class SmartSpeaker extends SmartDevice {
    private int volume;

    public SmartSpeaker(String name) {
        super(name);
        this.volume = 5;
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is playing your favorite playlist at volume " + volume + ".");
    }

    public void changeVolume(int newVolume) {
        this.volume = newVolume;
        System.out.println(getName() + " volume updated to " + this.volume + ".");
    }
}

class SmartThermostat extends SmartDevice {
    private int temperature;

    public SmartThermostat(String name) {
        super(name);
        this.temperature = 22;
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is adjusting climate control. Target: " + temperature + "°C.");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println(getName() + " temperature set to " + temp + "°C.");
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        SmartDevice[] homeNetwork = new SmartDevice[3];
        
        homeNetwork[0] = new SmartDevice("Generic Hub");
        homeNetwork[1] = new SmartSpeaker("Living Room Echo");
        homeNetwork[2] = new SmartThermostat("Hallway Nest");

        System.out.println("--- Booting Smart Home Automation ---");
        for (SmartDevice device : homeNetwork) {
            device.performAction();
        }

        System.out.println("\n--- Remote Adjustments ---");
        SmartSpeaker speaker = (SmartSpeaker) homeNetwork[1];
        speaker.changeVolume(8);
    }
}
