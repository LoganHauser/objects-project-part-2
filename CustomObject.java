public class CustomObject {

    //Create 3 attributes
    String attribute1;
    int attribute2;
    int attribute3;
    
    //Constructor
    public CustomObject(String attribute1, int attribute2, int attribute3) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    //Behavior that changes an attribute
    public void changeAttribute2(int number) {
        attribute2 = number;
    }

    //Behavior that prints all attributes
    public void printAttributes() {
        System.out.println();
        System.out.println("attribute1: " + attribute1);
        System.out.println("attribute2: " + attribute2);
        System.out.println("attribute3: " + attribute3);
    }
}
