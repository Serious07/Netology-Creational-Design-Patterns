package Builder;

public class PersonBuilder {
    private String name;
    private String surName;
    private int age = -1;
    private String city = null;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String name) {
        this.surName = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Возраст не может быть меньше нуля!");
        }

        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || name == "") {
            throw new IllegalStateException("В builder.PersonBuilder не установлено имя!");
        }

        if (surName == null || surName == "") {
            throw new IllegalStateException("В builder.PersonBuilder не установлена фамилия!");
        }

        return new Person(name, surName, age, city);
    }
}
