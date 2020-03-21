import java.util.Random;

public class CountSimb {
    char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    void countSim (final char simb, final String str) {

        int lengthStr = str.length();

        long count = str.chars()
                .mapToObj(c -> (char) c)
                .filter(e -> e.equals(simb))
                .count();

        float procent = (float) (count * 100) / lengthStr;
        System.out.println("Символ: "+ simb + " встречается " + count
                + " раз , в процентах: " + procent + " %");
    }

    void mathCount (String str) {
        for (char c : array) {
            countSim(c, str);
        }
    }
}
