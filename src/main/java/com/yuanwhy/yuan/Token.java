package com.yuanwhy.yuan;

/**
 * Created by why on 2015/10/27.
 */
public class Token {
    private TokenType type;
    private int lineNumber;

    public static final Token EOF = new Token(-1, TokenType.Identifier);
    public static final String EOL = "\\n";

    public Token(int lineNumber, TokenType type) {
        this.lineNumber = lineNumber;
        this.type = type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public TokenType getType() {
        return type;
    }
}
