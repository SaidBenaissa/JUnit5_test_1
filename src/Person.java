public class Person {
    private String name;
    private boolean happy = true;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithPerson() {
        happy = true;
    }
}
