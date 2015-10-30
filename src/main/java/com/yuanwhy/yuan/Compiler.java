package com.yuanwhy.yuan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by why on 2015/10/30.
 */
public class Compiler {
    public static void main(String[] args) {
        String sourcePath = "sample.yuan";
        Lexer lexer = new Lexer(sourcePath);
        List<Token> tokens = new ArrayList<Token>();
        while(lexer.hasNext()) {
            tokens.add(lexer.getToken());
        }
    }
}
