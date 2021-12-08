public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Car bmw = new Car();
        bmw.speed = 25;
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(125);
        bmw.increaseSpeed(250);
        bmw.decreaseSpeed(25);
        System.out.println("Bmw Hızı : " + bmw.speed);

        Car mercedes = new Car();
        mercedes.speed = 30;
        mercedes.printSpeed();

    }
}
