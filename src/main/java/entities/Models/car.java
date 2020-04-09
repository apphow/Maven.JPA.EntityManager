package entities.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//https://dzone.com/articles/all-jpa-annotations-mapping-annotations
//https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-part-two-crud/
@Entity(name = "car")
@Table(name = "car")
class Car {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany()
    private Set<Car> make = new HashSet<Car>();

    private String model;
    private int year;
    private String color;
    private int vin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Car> getMake() {
        return make;
    }

    public void setMake(Set<Car> make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public Car() {
    }
}

