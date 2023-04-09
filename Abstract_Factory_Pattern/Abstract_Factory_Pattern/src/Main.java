public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Factory_Producer factoryProducer = new Factory_Producer();

        Car_Factory carFactory = factoryProducer.getFactory("Toyota");

        Car_Factory carHondaFactory = factoryProducer.getFactory("Honda");

        Car car1 = carFactory.getCar("Camry");
        car1.createCar();

        Car car2 = carFactory.getCar("Corolla");
        car2.createCar();

        Car car3 = carHondaFactory.getCar("Civic");
        car3.createCar();

        Car car4 = carHondaFactory.getCar("City");
        car4.createCar();




    }
}