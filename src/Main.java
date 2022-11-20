import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Directory directory = new Directory();
        directory.addTelephone("Гарри Поттер", "85621456977");
        directory.addTelephone("Рональд Уизли", "854213657");
        directory.addTelephone("Гермиона Грейнджер", "54221548792");
        directory.addTelephone("Джини Уизли", "8564215779");
        directory.addTelephone("Невил Долгопупс", "8795321459");
        directory.addTelephone("Альбус Дамблдор", "54231586877");
        directory.addTelephone("Северус Снейп", "541258795665");
        directory.addTelephone("Том Редл", "2546987531");
        directory.addTelephone("Драко Малфой", "5421369772");
        directory.addTelephone("Минерва Макгонгл", "5548796321");
        directory.addTelephone("Римус Люпин", "546987265");
        directory.addTelephone("Сириус Блэк", "4587961235");
        directory.addTelephone("Питэр Пэтигрю", "587964253");
        directory.addTelephone("Джеймс Поттер", "896645212");
        directory.addTelephone("Лили Поттер", "5468755126");

        System.out.println( directory.entries());






    }


}