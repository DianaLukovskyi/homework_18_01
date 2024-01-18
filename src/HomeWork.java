import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork {
    public static int
    countName(List<String> nameList, String selectedName ) {
        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String name : nameList) {
            nameCountMap.put(name, nameCountMap.getOrDefault(selectedName, 0)+1 );

        }
        return nameCountMap.getOrDefault(selectedName, 0);
    }

}
