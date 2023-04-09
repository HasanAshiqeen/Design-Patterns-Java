public class CarFactory {

    public Car GetCar(String type){
        if(type == "Corolla"){
            return new Corolla();
        }
        else if (type == "Camry") {
            return new Camry();
        }

        else if (type == "Prius") {
            return new Prius();
        }

        else {
            return null;
        }

    }
}
