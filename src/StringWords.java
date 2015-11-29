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

    private int cursorPosition;

    private int wordCounter;
    private int leftCounter;

    private State automat;

    public StringWords(String word) {
        if (word == null) {
            throw new NullPointerException("Argument is null");
        }
        this.word = word;
    }

    // Kopierkonstruktor
    public StringWords(StringWords stringWords) {
        this.whiteSpaceCursor = stringWords.getWhiteSpaceCursor();
        this.wordCursor = stringWords.getWordCursor();
    }

    public String next() {
        int wordStart = 0;
        int wordEnd = 0;

        automat = State.inspace;

        while (cursorPosition == 0 || automat == State.stop) {
            Character c = word.charAt(wordCursor);
            if (!Character.isWhitespace(c) && automat == State.inspace) {
                wordStart = cursorPosition;
                if (Character.isWhitespace(c) && automat == State.inword) {
                    wordEnd = cursorPosition;
                }
            }
            if (!Character.isWhitespace(c)){
                automat = State.inword;
            }else {
                automat = State.inspace;
            }
            cursorPosition++;
        }

        if (){

        } else if ()


        for (int i = 0; i < word.length(); i++) {
            if (!Character.isWhitespace(i)) {

            }
        }

        return null;
    }

    public int remaining() {
        wordCounter = 0;
        int tmpCursor = cursorPosition;
        automat = State.inspace;

        for (int i = 0; i < word.length(); i++) {

        }


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
