/**
 * PascalCase clases
 * camelCase atributos
 */

package com.fbmoll.programming.data;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private Person parent;
    public Integer legs;

    // Control + N
    // Después Getter and Setter y añadimos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }
}
