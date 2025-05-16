package lab.assignment.afterrefactoring;

public class Capuccino extends CoffeeMakerTemplate {

    @override
    protected void addIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @override
    protected void finalTouch(){
        System.out.println("Top with milk foam");
    }
}