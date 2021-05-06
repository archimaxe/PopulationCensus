import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
/*
Из коллеции объектов Person необходимо:

Найти количество несовершеннолетних (т.е. людей младше 18 лет).
Получить список фамилий призывников (т.е. мужчин от 18 и до 27 лет).
Получить отсортированный по фамилии список потенциально работоспособных людей с высшим образованием в выборке
(т.е. людей с высшим образованием от 18 до 60 лет для женщин и до 65 лет для мужчин).
 */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> firstNames = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    firstNames.get(new Random().nextInt(firstNames.size())),
                    new Random().nextInt(100),
            Sex.values()[new Random().nextInt(Sex.values().length)],
            Education.values()[new Random().nextInt(Education.values().length)]));
        }

         persons.stream()
                .filter(s -> s.getAge()  < 18)
                .count();

        persons.stream()
                .flatMap(s -> Stream.of())
                .collect(Collectors.toList());

        persons.stream()
                .filter(s -> s.getAge() >= 18)
                .filter(s -> (s.getSex() == Sex.WOMEN && s.getAge() < 60) || (s.getSex() == Sex.MAN && s.getAge() < 65))
                .filter(s -> s.getEducation() == Education.HIGHER)
                .collect(Collectors.toList());
    }
}
