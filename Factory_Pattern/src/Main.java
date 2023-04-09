public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CarFactory carFactory = new CarFactory();
        Car car = carFactory.GetCar("Corolla");
        car.CreateCar();

        car = carFactory.GetCar("Prius");
        car.CreateCar();

        car = carFactory.GetCar("Camry");
        car.CreateCar();





    }
}