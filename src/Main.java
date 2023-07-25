public class Main {
    public static void main(String[] args) {
        int[] int_array = new int[10_000];

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
