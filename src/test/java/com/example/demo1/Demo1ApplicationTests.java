package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() throws IOException {
        String sqlPath = "villa_web_application.sql";
        StringBuilder replace=new StringBuilder();
        replace.append("hahahahaha");
        FileWriter writer = new FileWriter(sqlPath);
        writer.write(replace.toString());
        writer.close();
    }

    @Test
    void contextLoads1() throws IOException {
        String sqlPath = "villa_web_application1.sql";
        StringBuilder replace=new StringBuilder();
        replace.append("hahahahaha");
        FileWriter writer = new FileWriter(sqlPath);
        writer.write(replace.toString());
        writer.close();
    }

}
