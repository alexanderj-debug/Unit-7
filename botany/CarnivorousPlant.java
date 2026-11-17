public class CarnivorousPlant extends Plant {
     public void eatInsect() {
        System.out.println("The plant is eating an insect.");
    }

    public CarnivorousPlant(int age, double height, String color) {
        super(age, height, color);
    }
    public static void main(String[] args) {
 CarnivorousPlant venusFlytrap = new CarnivorousPlant(3, 12.0, "light green");
        venusFlytrap.drinkWater();
        venusFlytrap.photosyntesize();
        venusFlytrap.eatInsect();
    }
}
