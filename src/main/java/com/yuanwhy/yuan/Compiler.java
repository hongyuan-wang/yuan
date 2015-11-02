package com.yuanwhy.yuan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by why on 2015/10/30.
 */
public class Compiler {
    public static void main(String[] args) throws IOException{
        String sourcePath = "sample.yuan";
        Lexer lexer = new Lexer(ClassLoader.getSystemResource(sourcePath).getPath());
        List<Token> tokens = lexer.getTokens();
        System.out.println(tokens);
    }
}
