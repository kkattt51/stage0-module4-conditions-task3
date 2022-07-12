package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 'A' || symbol == 'a' || symbol == 'B' || symbol == 'b' || symbol == 'C' || symbol == 'c' ||
                symbol == 'D' || symbol == 'd' || symbol == 'E' || symbol == 'e' || symbol == 'F' || symbol == 'f' ||
                symbol == 'G' || symbol == 'g' || symbol == 'H' || symbol == 'h' || symbol == 'I' || symbol == 'i' ||
                symbol == 'J' || symbol == 'j' || symbol == 'K' || symbol == 'k' || symbol == 'L' || symbol == 'l' ||
                symbol == 'M' || symbol == 'm' || symbol == 'N' || symbol == 'n' || symbol == 'O' || symbol == 'o' ||
                symbol == 'P' || symbol == 'p' || symbol == 'Q' || symbol == 'q' || symbol == 'R' || symbol == 'r' ||
                symbol == 'S' || symbol == 's' || symbol == 'T' || symbol == 't' || symbol == 'U' || symbol == 'u' ||
                symbol == 'V' || symbol == 'v' || symbol == 'W' || symbol == 'w' || symbol == 'X' || symbol == 'x' ||
                symbol == 'Y' || symbol == 'y' || symbol == 'Z' || symbol == 'z') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
