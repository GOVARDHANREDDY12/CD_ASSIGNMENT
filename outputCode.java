import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> original_array = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> shuffled_array = new ArrayList<>(original_array);
        Collections.shuffle(shuffled_array, new Random());
        System.out.println(shuffled_array);
    }
}

