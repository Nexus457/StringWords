public class StringWordsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringWords stringWords = new StringWords(" Abra ka\tdabra\n\n");
        System.out.println(stringWords.remaining());
        System.out.println(stringWords.next());
        System.out.println(stringWords.remaining());
        System.out.println(stringWords.next());
        System.out.println(stringWords.remaining());
        System.out.println(stringWords.next());
        System.out.println(stringWords.remaining());
        System.out.println(stringWords.next());
        System.out.println(stringWords.remaining());
    }

}