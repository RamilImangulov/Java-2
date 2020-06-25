import java.util.HashMap;


public class Words {

    public static void main(String[] args) {
        String[] fruit = {"apple", "orange", "melon", "apple", "kiwi", "kiwi", "banana", "kiwi", "pear", "mango", "papaya"};
        HashMap<String, Integer> unicalWords = new HashMap<>();
        for (String x : fruit) {
            unicalWords.put(x, unicalWords.getOrDefault(x, 0) + 1);
        }
        System.out.println(unicalWords);
    }

}
