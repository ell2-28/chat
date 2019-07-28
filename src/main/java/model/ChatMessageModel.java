package model;

public class ChatMessageModel {

    private String text;

    public ChatMessageModel() {
    }

    public ChatMessageModel(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "{" +
                ",\"text\":\"" + text + '\"' +
                '}';
    }
}