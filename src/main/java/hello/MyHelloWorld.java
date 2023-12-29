package hello;

import org.joda.time.LocalTime;

public class MyHelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);

        Learner learner = new Learner();
        System.out.println(learner.sayHello());
    }
}
