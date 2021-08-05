package com.turkoglu.builderjungle;

public class Main {

    public static void main(String[] args) {
        PreMasterStudent preMasterStudent = PreMasterStudent.builder()
                .age(30)
                .name("Google.com")
                .specilisation("IT")
                .school("AlphaBet")
                .subSpecialisation("IT-MBA")
                .build();
        System.out.println(preMasterStudent.toString());

        MasterStudent masterStudent = MasterStudent.builder()
                .age(30)
                .name("Google.com")
                .school("AlphaBet")
                .specilisation("IT")
                .build();
        System.out.println(masterStudent.toString());

        Student student = Student.builder()
                .age(30)
                .school("AlphaBet")
                .name("Google.com")
                .build();
        System.out.println(student.toString());

        People people = People.builder()
                .name("facebook.com")
                .age(20)
                .build();
        System.out.println(people.toString());
    }
}
