package lab.assignment.afterrefactoring;

public class Mocha extends CoffeeMakerTemplate {

    @override
    protected void addIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @override
    protected void finalTouch(){
        System.out.println("Adding sugar");
    }
}