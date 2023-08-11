package com.MKHLSS.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> FindAllStudents() {
        return List.of(
                new Student(
                        "Mohamed",
                        "MOUKHL",
                        LocalDate.now(),
                        "mohamed@gmail.com",
                        20

                ),

                new Student(
                        "Ahmed2",
                        "MOUKHL",
                        LocalDate.now(),
                        "ahmed@gmail.com",
                        26

                )
        );
    }
}
