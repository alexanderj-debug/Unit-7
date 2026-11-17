public class LightSwitch implements Device {
     boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Light on!");
    }  public void turnOff() {
        isOn = false;
        System.out.println("Light off!");
    }

    public static void main (String[] args) {
         LightSwitch light = new LightSwitch();
        light.turnOn();
        System.out.println(light.isOn);
        light.turnOff();
        System.out.println(light.isOn);
    }
        
    }

