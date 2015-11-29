public class StringWords {

    public enum State {
        inspace, inword, stop
    }

    public enum Space {
        whitespace, other
    }

    private String word;

    private int whiteSpaceCursor;
    private int wordCursor;

    private int nextCounter;
    private int leftCounter;

    public StringWords(String word) {
        if (word == null){
            throw new NullPointerException("Argument is null");
        }
        this.word = word;
    }

    public StringWords(StringWords stringWords) {
        this.whiteSpaceCursor = stringWords.getWhiteSpaceCursor();
        this.wordCursor = stringWords.getWordCursor();
    }

    public String next() {

        for (int i = 0; i < word.length(); i++){
            System.out.println(!Character.isWhitespace(i) + " " + word.charAt(i));
        }

        return null;
    }

    public int remaining() {
        return leftCounter;
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int getWhiteSpaceCursor() {
        return whiteSpaceCursor;
    }

    public void setWhiteSpaceCursor(int whiteSpaceCursor) {
        this.whiteSpaceCursor = whiteSpaceCursor;
    }

    public int getWordCursor() {
        return wordCursor;
    }

    public void setWordCursor(int wordCursor) {
        this.wordCursor = wordCursor;
    }

}
