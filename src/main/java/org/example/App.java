package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        Fine fine1 = new Fine(TypeOfFine.SpeedingFine);
        Fine fine2 = new Fine(TypeOfFine.IncorrectParkingFine);
        Fine fine3 = new Fine(TypeOfFine.SpeedingFine);
        Fine fine4 = new Fine(TypeOfFine.IncorrectParkingFine);

        List<Human> list = new ArrayList<>();

        Human human1 = new Human("Руслан", "Губа", "Дніпро");
        Human human2 = new Human("Сергій", "Акусок", "Київ");
        Human human3 = new Human("Владислав", "Сергієнко", "Львів");

        Base base = new Base();
//        base.addHuman(human1);
//        base.print();
//        base.addHuman(human2);
//        base.print();
//        base.addFine(human2, fine1);
//        base.addFine(human2, fine1);
//        base.addFine(human2, fine2);
//        base.addFine(human2, fine4);
//        base.addFine(human2, fine3);
//        base.print();
//        base.printFineOfId(3);
//
//        base.printFineOfType(TypeOfFine.IncorrectParkingFine);
//
//        base.printFineOfCity("Київ");
//        System.out.println("-------------");
//        base.print();
//        base.removeFine(fine1);
//        base.print();
//
//        base.removeHuman(human3);
//        base.print();
//
//        base.addHuman(human1);
//        base.print();
//        base.addHuman(human3);
//        base.print();
//        base.addHuman(human3);
//        base.print();


    }
}
