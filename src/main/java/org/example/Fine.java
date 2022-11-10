package org.example;

import java.util.Objects;

public class Fine {

    private final int id;
    private static int count = 0;
    private TypeOfFine typeOfFine;

    public Fine(TypeOfFine typeOfFine) {
        this.id = ++count;
        this.typeOfFine = typeOfFine;
    }

    public int getId() {
        return id;
    }

    public TypeOfFine getTypeOfFine() {
        return typeOfFine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fine)) return false;
        Fine fine = (Fine) o;
        return id == fine.id && typeOfFine == fine.typeOfFine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeOfFine);
    }

    @Override
    public String toString() {
        return "Fine{" +
                "id=" + id +
                ", typeOfFine=" + typeOfFine +
                '}';
    }
}

enum TypeOfFine {
    IncorrectParkingFine(100), SpeedingFine(200);
    private final int price;

    TypeOfFine(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return name() +
                " price=" + price +
                '}';
    }
}
