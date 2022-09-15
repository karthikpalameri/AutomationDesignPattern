package com.pojo;

import java.util.function.Consumer;

public class PersonBuilder {
    public String name;
    public String address;
    public String id;
    public boolean lovesCofee;


    public PersonBuilder builder(Consumer<PersonBuilder> personBuilder) {
        personBuilder.accept(this);
        return this;
    }

    public Person build() {
        return new Person(name, address, id, lovesCofee);
    }
}
