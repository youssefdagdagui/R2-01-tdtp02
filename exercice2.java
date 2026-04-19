class Exercice2 {

    public static void main(String[] args) {

        String phrase = new String("Ceci est une chaine de caractere");

        String etape1 = phrase.replace('e', 'u');

        String resultatFinal = etape1.replace('i', 'u');

        System.out.println(resultatFinal);
    }
}