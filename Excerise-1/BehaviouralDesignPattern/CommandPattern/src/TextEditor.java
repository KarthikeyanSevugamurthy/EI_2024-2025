package src;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String text) {
        this.text.append(text);
        System.out.println("Text after write: " + this.text);
    }

    public void undoWrite(int length) {
        int start = text.length() - length;
        if (start < 0) start = 0; // Handle cases where undo length is greater than current text length
        text.delete(start, text.length());
        System.out.println("Text after undo: " + this.text);
    }

    public String getText() {
        return text.toString();
    }
}

