package org.example;

import java.util.ArrayList;
import java.util.List;

public class Base {
    List<Human> base;

    public Base() {
        base = new ArrayList<>();
    }



    public List<Human> getBase() {
        return base;
    }

    public void setBase(List<Human> base) {
        this.base = base;
    }

    //Добавление нового человека
    public void addHuman(Human human) {
        boolean b = false;
        for (Human h : base) {
            if (h.equals(human)) {
                b = true;
                break;
            }
        }
        if (b == false) {
            base.add(human);
        }

    }

    //Полная распечатка базы данных.
    public void print() {
        System.out.println(base);
    }

    //Добавление новых штрафов для уже существующей записи.
    public void addFine(Human h, Fine f) {
        for (Human human : base) {
            if (human.getId() == h.getId()) {
                human.addFine(f);
            }
        }
    }

    //Распечатка данных по конкретному коду.
    public void printFineOfId(int id) {
        for (Human h : base) {
            for (Fine f : h.getFines()) {
                if (f.getId() == id) {
                    System.out.println(f);
                }
            }
        }
    }

    //Распечатка данных по конкретному типу штрафа
    public void printFineOfType(TypeOfFine typeOfFine) {
        for (Human h : base) {
            for (Fine f : h.getFines()) {
                if (f.getTypeOfFine() == typeOfFine) {
                    System.out.println(f);
                }
            }
        }
    }

    //Распечатка данных по конкретному городу.
    public void printFineOfCity(String city) {
        for (Human h : base) {
            if (h.getCity().equals(city)) {
                System.out.println(h);
            }
        }
    }

    //Удаление штрафа.
    public void removeFine(Fine fine) {
        for (Human h : base) {
            for (Fine f : h.getFines()) {
                if (f.equals(fine)) {
                    h.removeFine(f.getId());
                    break;
                }
            }
        }
    }

    public void removeHuman(Human human) {
        int count = 0;
        for (Human h : base) {
            if (h.equals(human)) {
                base.remove(count);
                break;
            }
            count++;
        }
    }


}
