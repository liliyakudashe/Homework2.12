import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    Map<String, String> telephoneDirectory = new HashMap<>();
    public static void main(String[] args) {
        Map<String, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("Гарри Поттер", "85621456977");
        telephoneDirectory.put("Рональд Уизли", "854213657");
        telephoneDirectory.put("Гермиона Грейнджер", "54221548792");
        telephoneDirectory.put("Джини Уизли", "8564215779");
        telephoneDirectory.put("Невил Долгопупс", "8795321459");
        telephoneDirectory.put("Альбус Дамблдор", "54231586877");
        telephoneDirectory.put("Северус Снейп", "541258795665");
        telephoneDirectory.put("Том Редл", "2546987531");
        telephoneDirectory.put("Драко Малфой", "5421369772");
        telephoneDirectory.put("Минерва Макгонгл", "5548796321");
        telephoneDirectory.put("Римус Люпин", "546987265");
        telephoneDirectory.put("Сириус Блэк", "4587961235");
        telephoneDirectory.put("Питэр Пэтигрю", "587964253");
        telephoneDirectory.put("Джеймс Поттер", "896645212");
        telephoneDirectory.put("Лили Поттер", "5468755126");



        System.out.println(telephoneDirectory);




    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return Objects.equals(telephoneDirectory, main.telephoneDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneDirectory);
    }

}