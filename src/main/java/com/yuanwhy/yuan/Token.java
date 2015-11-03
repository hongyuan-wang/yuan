package com.yuanwhy.yuan;

import java.util.regex.Pattern;

/**
 * Created by why on 2015/10/27.
 */
public class Token {
    private TokenType type;
    private int lineNumber;
    private String text;

    public static final Token EOF = new Token(TokenType.Identifier, -1, null);
    public static final Token EOL = new Token(TokenType.Identifier, "\\n");

    public Token() {
    }

    public Token(TokenType type, String text) {
        this.type = type;
        this.text = text;
    }

    public Token(TokenType type, int lineNumber, String text) {
        this.type = type;
        this.lineNumber = lineNumber;
        this.text = text;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public TokenType getType() {
        if(type == null && text != null) {
            if(Pattern.matches("[0-9]+", text)) {
                type = TokenType.Number;
            } else {
                type = TokenType.Identifier;
            }
        }
        return type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "Token{" +
                "type=" + type +
                ", lineNumber=" + lineNumber +
                ", text='" + text + '\'' +
                '}';
    }
}
