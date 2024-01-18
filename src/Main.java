import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> names = List.of( "Tom","John", "Eva", "Sara", "Tom", "Liza", "Anna","Tom");
        String selected = "Tom";


        int result = HomeWork.countName(names, selected);
        System.out.println("Name:" + selected + " on the list  = " + result);


    }
}

