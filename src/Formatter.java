import java.util.List;

public class Formatter {
    public static void main(String[] args) {
        List<String[]> films = List.of(
                new String[]{"Транформеры","Майкл Бэй"},
                new String[]{"Аватар","Джеймс Кэмерон"}
        );

        films.stream()
                .map(pair -> formatFilmDirector(pair[0], pair[1]))
                .forEach(System.out::println);
    }

    public static String formatFilmDirector(String film, String director) {
        return "«" + film + "» " + director;
    }
}