public class Person {
    protected final String name;
    protected final String surName;
    private int age = -1;
    private String city = null;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name, String surName, String city) {
        this.name = name;
        this.surName = surName;
        this.city = city;
    }

    public Person(String name, String surName, int age, String city) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAge(0).
                setSurname(getSurName()).
                setAddress(getCity());
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void SetAddress(String address) {
        city = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}