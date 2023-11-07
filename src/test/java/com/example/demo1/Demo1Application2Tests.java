package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;

@SpringBootTest
class Demo1Application2Tests {

    @Test
    void contextLoads() throws IOException {
        String sqlPath = "villa_web_application2.sql";
        StringBuilder replace=new StringBuilder();
        replace.append("hahahahaha2222222");
        FileWriter writer = new FileWriter(sqlPath);
        writer.write(replace.toString());
        writer.close();
    }

    @Test
    void contextLoads2() throws IOException {
        String sqlPath = "villa_web_application3.sql";
        StringBuilder replace=new StringBuilder();
        replace.append("hahahahaha333333");
        FileWriter writer = new FileWriter(sqlPath);
        writer.write(replace.toString());
        writer.close();
    }

}
