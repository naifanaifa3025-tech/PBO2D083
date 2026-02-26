/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EliteBook
 */
public class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }
        public static void main(String[] args) {
        Person person1 = new Person("Siti Naifah", 19, "Bangkalan");
        person1.displayInfo();
    }
}

