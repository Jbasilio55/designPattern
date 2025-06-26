package Document;

public class DocumentState {
    private final String content;
    private final String fontName;
    private final double fontSize;

    public DocumentState(String content, String fontName, double fontSize){
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public double getFontSize() {
        return fontSize;
    }
}
