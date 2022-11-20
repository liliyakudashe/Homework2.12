import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Directory {
    private final Map<String, String> telephoneDirectory = new HashMap<>();

    public void addTelephone(String name, String telephone){
        telephoneDirectory.put(name, telephone);
    }

    public Set<Map.Entry<String,String>>  entries (){
        return telephoneDirectory.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(telephoneDirectory, directory.telephoneDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneDirectory);
    }
}
