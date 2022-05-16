public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Oanta Diana");
        parent.addChild(new Child("Oanta Vasile"));
        parent.addChild(new Child("Oanta Valeria"));
        parent.addChild(new Child("Oanta Victor"));

        parent.printName();
    }
}
