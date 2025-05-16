package lab.assignment.afterrefactoring;

public class Americano extends CoffeeMakerTemplate {

    @override
    protected void addIngredients(){
        System.out.println("Add more hot water");
    }

    @override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }
}