public class Main {

    public static void main(String[] args) {

        //Create 3 animal objects
        Animal cat = new Animal("Cat", 4, "gray");
        Animal dog = new Animal("Dog", 7, "brown");
        Animal bird = new Animal("Bird", 3, "yellow");
        
        //Change object attributes
        cat.age = 5;
        dog.age = 8;
        bird.color = "blue";

        //Use object behaviors
        cat.changeAge(2);
        dog.changeAge(1);
        bird.changeAge(3);

        cat.printAttributes();
        dog.printAttributes();
        bird.printAttributes();
    }
}
