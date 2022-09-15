package com.tests;


import com.github.javafaker.Faker;
import com.pojo.Person;
import com.pojo.PersonBuilder;

public class BuilderPatternTest {

    public static void main(String[] args) {
//        Employee employee = new Employee().setName("kk").setAddress("add1");

//        Employee employeObj = EmployeeBuilder.builder()
//                .setName("Kk")
//                .and()
//                .setAddress("Bangalore")
//                .with()
//                .setId("123").build();

//        Student studentObject = Student.builder().setName("Kkk").setId("456").setAddress("Add2").build();


//        PlayerLombok playerObject = PlayerLombok.builder()
//                .setId(generateRandomId())
//                .setName("Kkkk")
//                .setSport("Fb")
//                .perform();


        Person pObject = new PersonBuilder().builder(
                $ -> {
                    $.name = "Abc";
                    $.id = generateRandomId();
                    $.lovesCofee = true;

                }
        ).build();
        System.out.println(pObject);
    }

    public static String generateRandomId() {
        return String.valueOf(new Faker().number().digits(3));
//                .randomDouble(4, -1, -10));
    }
}
