import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "logowanie_dane")
    public static Object[][] logowanie_dane() {
        return new Object[][]{
                {"xxx", "xxx"}
        };
    }


    public String[][] oceny_test(){
        String[][] podglad = {{"5,0", "Bazy danych w elektroenergetyce Wykład"}, {"4,0", "Metody komputerowe badań urządzeń Wykład"}, {"3,5", "Metody komputerowe badań urządzeń Lab"}, {"4,0", "Metody komputerowe badań urządzeń Projekt"}, {"5,0", "Podstawy sterowania w elektroenergetyce Wykład"}, {"4,0", "Podstawy sterowania w elektroenergetyce Lab"}, {"5,0", "Praca pzrejściowa Wykład"}, {"4,0", "Etyka nowych technologii Wykład"}, {"4,5", "Multimedialne techniki prezentacji Wykład"}, {"5,0", "Multimedialne techniki prezentacji Projekt"}, {"3,0", "Akwizycja i transmisja danych Wykład"}, {"5,0", "Akwizycja i transmisja danych Projekt"}, {"4,5", "Podstawy elektroenergetykiWykład"}};
        return  podglad;
    }


}
