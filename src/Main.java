public class Main {
    public static void main(String[] args) {
        int[] int_array = new int[10_000];
        int prim_zahl = 12;
        Integer obj_zahl = 12;
        Double dzahl = 3.4;

        Object[] alles_mögliche = new Object[200];

        alles_mögliche[0] = obj_zahl;
        alles_mögliche[1] = "Hallo";
        alles_mögliche[2] = dzahl;
        alles_mögliche[3] = prim_zahl; // implizite Konvertierung
        System.out.println( alles_mögliche[3].getClass().getName() );
        System.out.println( Double.MAX_VALUE );

        long zeit = System.nanoTime();
        String ausgabeString = new String("[");
        for (int i = 0; i < int_array.length; i++) {
            if (i > 0) ausgabeString += ", ";
            ausgabeString += int_array[i];
        }
        ausgabeString += "]";
        zeit = (System.nanoTime() - zeit) / 1000;
        System.out.println("Konkatination benötigt " + zeit + "µs");

        // 1. Alternative
        zeit = System.nanoTime();
        StringBuffer ausgabeBuffer = new StringBuffer("[");
        for (int i = 0; i < int_array.length; i++) {
            if (i > 0) ausgabeBuffer.append(", ");
            ausgabeBuffer.append(int_array[i]);
        }
        ausgabeBuffer.append("]");
        zeit = (System.nanoTime() - zeit) / 1000;
        System.out.println("StringBuffer benötigt  " + zeit + "µs");

        System.out.println("Sind beide Strings gleich? " +
                (ausgabeString.equals(ausgabeBuffer.toString())));

        // 2. Alternative
        zeit = System.nanoTime();
        StringBuilder ausgabeBuilder = new StringBuilder("[");
        for (int i = 0; i < int_array.length; i++) {
            if (i > 0) ausgabeBuilder.append(", ");
            ausgabeBuilder.append(int_array[i]);
        }
        ausgabeBuilder.append("]");
        zeit = (System.nanoTime() - zeit) / 1000;
        System.out.println("StringBuilder benötigt " + zeit + "µs");

        System.out.println("Sind beide Strings gleich? " +
                (ausgabeString.equals(ausgabeBuilder.toString())));

//        System.out.println("ausgabeString: " + ausgabeString);

    }
}
