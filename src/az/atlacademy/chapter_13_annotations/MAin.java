package az.atlacademy.chapter_13_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class MAin {
}

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
@interface LightSource {}

@LightSource class Bulb {
    @LightSource void lightSwitch() {}
    @LightSource private Bulb() {}
}

@interface Music {
    String value() default "violin";
}

@Music
class Orchestra {
    @Music
    Orchestra(){}

    @Music("book")
    void play( @Music String name) {}
}



 @interface Thermometer {
 int minTemp();
 int maxTemp() default 1;
 double[] color();
  String type="t";
 Boolean compact=false;
 }