package com.springinaction.agr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "springidol.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Performer performer2 = (Performer) ctx.getBean("poeticDuke");
        performer2.perform();
    }
}

