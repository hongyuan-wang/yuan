package com.yuanwhy.yuan;

/**
 * Created by why on 2015/10/30.
 */
public class Lexer {

    private  String sourcePath;

    public Lexer(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public boolean hasNext() {
        return false;
    }
    public  Token getToken() {
        return Token.EOF;
    }
}
