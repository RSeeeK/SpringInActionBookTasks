package com.springinaction.agr;

//import performers.Performer;
import com.springinaction.agr.other.Course;
import com.springinaction.agr.other.CourseFullEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "springidol.xml");

//        Performer performer = (Performer) ctx.getBean("duke");
//        performer.perform();
//
//        Performer performer2 = (Performer) ctx.getBean("poeticDuke");
//        performer2.perform();
//
//        Performer performer3 = (Performer) ctx.getBean("kenny");
//        performer3.perform();

//        Main main = new Main();
//        Course course = new Course();
//        ctx.publishEvent(new CourseFullEvent(main, course));

//        <bean id="coconut"
//            class="com.springinaction.agr.food.Coconut">
//            <property name="lime" ref="lime" />
//        </bean>
//
//        <lang:jruby id="lime"
//            script-source="classpath:com/springinaction/agr/food/Lime.rb"
//            script-interfaces="com.springinaction.agr.food.Lime" />

    }
}

