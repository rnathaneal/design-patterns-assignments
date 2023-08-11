package designpattern.builder;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 11:31:11 PM
 * To change this template use File | Settings | File Templates.
 */

class PersonBuilder {
    private String name;
    private int id;
    private String city;
    private String country;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder country(String country) {
        this.country = country;
        return this;
    }

    public Person build() {
        return new Person(name, id, city, country);
    }

}

public class Person {
    private String name;
    private int id;
    private String city;
    private String country;

    public Person(String name, int id, String city, String country) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
