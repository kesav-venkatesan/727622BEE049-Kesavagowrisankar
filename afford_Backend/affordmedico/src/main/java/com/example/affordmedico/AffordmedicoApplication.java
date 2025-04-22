package com.example.affordmedico;

import com.example.affordmedico.Entity.User;
import com.example.affordmedico.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AffordmedicoApplication implements CommandLineRunner {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {

//        List<User> data = List.of(
//                new User(1, "John Doe"),
//                new User(10, "Helen Moore"),
//                new User(11, "Ivy Taylor"),
//                new User(12, "Jack Anderson"),
//                new User(13, "Kathy Thomas"),
//                new User(14, "Liam Jackson"),
//                new User(15, "Mona Harris"),
//                new User(16, "Nathan Clark"),
//                new User(17, "Olivia Lewis"),
//                new User(18, "Paul Walker"),
//                new User(19, "Quinn Scott"),
//                new User(2, "Jane Doe"),
//                new User(20, "Rachel Young"),
//                new User(3, "Alice Smith"),
//                new User(4, "Bob Johnson"),
//                new User(5, "Charlie Brown"),
//                new User(6, "Diana White"),
//                new User(7, "Edward Davis"),
//                new User(8, "Fiona Miller"),
//                new User(9, "George Wilson")
//        );
//
//
//        userRepo.saveAll(data);
    }

    public static void main(String[] args) {
        SpringApplication.run(AffordmedicoApplication.class, args);
    }

}
