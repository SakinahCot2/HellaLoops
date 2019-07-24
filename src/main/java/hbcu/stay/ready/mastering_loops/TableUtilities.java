package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return  "  1 |  2 |  3 |  4 |\n" +
                "  2 |  4 |  6 |  8 |\n" +
                "  3 |  6 |  9 | 12 |\n" +
                "  4 |  8 | 12 | 16 |";
    }

    public static String getLargeMultiplicationTable() {
        return  "  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |\n" +
                "  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |\n" +
                "  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |\n" +
                "  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |\n" +
                "  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |\n" +
                "  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |\n" +
                "  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |\n" +
                "  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |\n" +
                "  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |\n" +
                " 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |\n";
    }

    public static String getMultiplicationTable(int tableSize) {
        String grid = "";

        for (int g = 1; g <= tableSize; g++) {
            int i = g;
            for (int j = 0; j < tableSize; j++) {
                int length = String.valueOf(i).length();
                if (length == 1) {
                    grid += "  " + i + " |";
                    i += g;
                } else if (length == 2) {
                    grid += " " + i + " |";
                    i += g;
                } else if (length == 3) {
                    grid += "" + i + " |";
                    i += g;
                }

            } grid+="\n";
        }
        return grid;

    }
}
