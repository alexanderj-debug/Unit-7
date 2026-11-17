public class Computer implements Device {
    boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Hello World!");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Goodbye World!");
    }

    public void type(String message) {
        if (isOn) {
        System.out.println(message);
        }
    }

    public static void main(String [] args) {
        Computer laptop = new Computer();
        laptop.type("asdfgjm");
        laptop.turnOn();
        laptop.type("asdfgjm");
        laptop.turnOff();
    }
}