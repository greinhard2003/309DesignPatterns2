package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.Americano;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.Capuccino;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new Americano();
        coffeeMaker.prepareCoffee();

        System.out.println("********************");

        coffeeMaker = new Capuccino();
        coffeeMaker.prepareCoffee();

        System.out.println("********************");

        coffeeMaker = new Mocha();
        coffeeMaker.prepareCoffee();

    }

}
