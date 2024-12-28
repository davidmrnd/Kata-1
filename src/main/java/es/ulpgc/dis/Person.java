package es.ulpgc.dis;

import java.time.LocalDate;
import java.util.StringJoiner;

public record Person(String name, LocalDate birthday) {

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("birthday=" + birthday)
                .add("age=" + getAge())
                .toString();
    }
}
