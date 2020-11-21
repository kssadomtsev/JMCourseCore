package main.java.Task11;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }
}
