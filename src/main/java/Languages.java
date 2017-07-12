
public enum Languages {
    English("English", "en"),
    French("French", "fr"),
    Hebrew("Hebrew", "hr");


    private final String language;
    private final String shortCode;

    Languages(String language, String shortCode) {
        this.language = language;
        this.shortCode = shortCode;

    }

    public String getLanguage() {
        return language;
    }

    public String getShortCode() {
        return shortCode;
    }
}

