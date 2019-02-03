package exo08;

import java.util.function.Supplier;

public class Ligature {
    Supplier<String> strangeMethod(int value) {
        if (value <= 0 && value != 10 || value == 20) {
            return () -> "";
        }
        return null;
    }
}