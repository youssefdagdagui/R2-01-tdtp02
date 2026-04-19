class Exercice4 {

    public static void main(String[] args) {

        String phrase = new String("Ceci est une phrase;");

        boolean condition1 = phrase.endsWith(".");
        boolean condition2 = phrase.endsWith(";");

        System.out.println("Result for point: " + condition1);
        System.out.println("Result for semicolon: " + condition2);
    }
}