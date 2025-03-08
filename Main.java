/*
Ranveer Singh
23070126102
AIML B1
 */
public class Main {
    public static void main(String[] args) {
        RubberDuck rd = new RubberDuck();
        MallardDuck md = new MallardDuck();
        System.out.println("--------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("--------");

        System.out.println("--------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("--------");
    }
}