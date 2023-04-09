public class Toyota extends Car_Factory{
    @Override
    public Car getCar(String type) {
        if(type == "Corolla"){
            return new Corolla();
        }
        else if (type == "Camry") {
            return new Camry();
        }
        else {
            return null;
        }
    }
}
