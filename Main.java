public class Main {

    public static void main(String[] args) {

        //Create 3 objects
        CustomObject object1 = new CustomObject("1", 2, 3);
        CustomObject object2 = new CustomObject("4", 5, 6);
        CustomObject object3 = new CustomObject("7", 8, 9);
        
        //Change attributes
        object1.attribute1 = "2";
        object2.attribute2 = 6;
        object3.attribute3 = 10;

        //Use object behaviors
        object1.behavior(3);
        object1.behavior(7);
        object1.behavior(11);
    }
}
