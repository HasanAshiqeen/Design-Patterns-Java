public class Honda extends Car_Factory{
    @Override
    public Car getCar(String type) {
        if(type == "Civic"){
            return new Civic();
        }
        else if (type == "City") {
            return new City();
        }
        else {
        return null;
        }
    }
}
