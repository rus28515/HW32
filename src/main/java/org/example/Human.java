package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human {
    private String name;
    private String lastName;
    private String city;
    private int id;
    private List<Fine> fines;
    private static int count = 0;

    public Human(String name, String lastName, String city) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        id = ++count;
        fines = new ArrayList<>();
    }

    public List<Fine> getFines() {
        return fines;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addFine (Fine fine){
        boolean b = false;
        for (Fine f:fines){
            if (f.getId()==fine.getId()){
                b= true;
                break;
            }
        }
        if (b==false){
            fines.add(fine);
        }
    }

    public void removeFine (int id){
        int count = 0;
        for (Fine f: fines){
            if (f.getId()==id){
                fines.remove(count);
                break;
            }
            count++;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city=" + city +
                ", id=" + id +
                ", fines=" + fines +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getId() == human.getId() && Objects.equals(getName(), human.getName()) && Objects.equals(getLastName(), human.getLastName()) && Objects.equals(getCity(), human.getCity()) && Objects.equals(getFines(), human.getFines());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getCity(), getId(), getFines());
    }
}
