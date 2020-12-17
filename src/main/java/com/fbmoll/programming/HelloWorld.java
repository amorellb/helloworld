package com.fbmoll.programming;

import com.fbmoll.programming.abstractWord.Hire;
import com.fbmoll.programming.abstractWord.Home;
import com.fbmoll.programming.abstractWord.Place;
import com.fbmoll.programming.data.*;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    // main + Tab
    public static void main(String[] args) {
        Person teacher = new Person(); // Para importar la clase: Control + Espacio y luego Tabulador (sobre el nombre de la clase)
        teacher.setAge(12);
        teacher.setName("Pepito");
        teacher.setSurname("Yuhu");
        teacher.legs = 5;
        Student std = new Student(); // Para importar la clase: Control + Espacio y luego Tabulador (sobre el nombre de la clase)
        Teacher tchr = new Teacher(); // Para importar la clase: Control + Espacio y luego Tabulador (sobre el nombre de la clase)

        Home home = new Home(); // Creamos una variable home de tipo Home
        home.setSqrtMeters(400);
        home.setPrice(300000.00);
        home.setLocation("Mallorca");
        home.setTemperature("10ºC");

        Hire hire = new Hire(); // Creamos una variable hire de tipo Hire
        hire.setSqrtMeters(200);
        hire.setPrice(120.50);
        hire.setLocation("New York");
        hire.setTemperature("50ºF");

        Place place = new Home();
        List<Place> list = new ArrayList<>();
        // Añadimos valores al array
        list.add(home);
        list.add(hire);
        list.add(place);

        // Iteramos sobre la lista list e inprimimos su contenido por pantalla.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //sout + Tab
        System.out.println("Hello World");
    }
}
