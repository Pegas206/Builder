import java.util.OptionalInt;

public class Person {
    protected String name;
    protected String surname;
    protected int age = -1;
    protected String city;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (hasAge()) {
            return OptionalInt.of(age);
        } else {
            return OptionalInt.empty();
        }
    }

    public String getCity() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setAge(0)
                .setCity(city)
                .setSurname(surname);
    }

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + age + " " + city;
    }

}
