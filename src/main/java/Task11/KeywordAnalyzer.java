package main.java.Task11;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    abstract protected Label getLabel();
    abstract protected String[] getKeywords();
}
