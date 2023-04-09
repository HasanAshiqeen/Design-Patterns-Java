public class Factory_Producer {

    public Car_Factory getFactory(String factoryType){

        if (factoryType == "Toyota"){
            return new Toyota();
        }
        else if (factoryType == "Honda") {
            return new Honda();
        }
        else {
        return null;
        }
    }
}