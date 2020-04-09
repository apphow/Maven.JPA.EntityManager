package entities;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
class employees {
    @Id
    @GeneratedValue()
    int id;

    @Column(name = "Last_Name")
    private String Last_Name;

    @Column(name = "Salary")
    private String salary;

    @Column(name = "Start_Date")
    private int year;

    @Column(name = "Title")
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
}



