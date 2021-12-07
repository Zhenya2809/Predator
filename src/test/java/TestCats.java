import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCats {


    @Test
    void shouldCreateCat() {
        Cats murzik = new Cats("плямистый", 6.5, "Бенгальский");
        String breed = murzik.getBreed();
        double weight = murzik.getWeight();
        String color = murzik.getColor();
        Assertions.assertEquals(breed, "Бенгальский");
        Assertions.assertEquals(weight, 6.5);
        Assertions.assertEquals(color, "плямистый");
    }

    @Test
    void testEqualsCats() {
        Cats murzik = new Cats("плямистый", 6.5, "Бенгальский");
        Cats tuzik = new Cats("серый", 15.5, "Мейн-кун");
        Cats barsik = new Cats("черный", 17.5, "Мейн-кун");
        Cats vanya = new Cats("рыжий", 5.2, "Рєгдолл");

        //true
        Assertions.assertEquals(tuzik, barsik);
        Assertions.assertTrue(tuzik.equals(barsik));
        //false
        Assertions.assertFalse(vanya.equals(murzik));
        Assertions.assertFalse(murzik.equals(tuzik));
    }

    @Test
    void testWhatCatDoing() {
        Cats tuzik = new Cats("серый", 15.5, "Мейн-кун");

        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.MONDAY), "сплю");
        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.WEDNESDAY), "сплю");
        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.FRIDAY), "сплю");

        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.TUESDAY), "охочусь!");
        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.THURSDAY), "охочусь!");
        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.SATURDAY), "охочусь!");

        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.SUNDAY), "делаю ТЫГЫДик!");

        Assertions.assertEquals(tuzik.whatCatDoing(DayOfWeek.INDEFINITE_DAY), "лижу яйца");

    }
}
