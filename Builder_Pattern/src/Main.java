public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost : "+ nonVegMeal.getCost());



    }
}