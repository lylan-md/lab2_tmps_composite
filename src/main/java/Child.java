public class Child implements Human {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(Child.class.getName() + " | " + this.name);
    }
}
