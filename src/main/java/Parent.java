import java.util.ArrayList;

public class Parent implements Human {
    private String name;
    ArrayList<Child> children = new ArrayList<>();

    public Parent(String name) {
        this.name = name;
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    @Override
    public void printName() {
        System.out.println(Parent.class.getName() + " | " + this.name);

        for (Child child: children) {
            child.printName();
        }
    }
}
