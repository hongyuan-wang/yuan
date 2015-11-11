package com.yuanwhy.yuan;

import com.yuanwhy.yuan.token.Token;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by why on 2015/10/30.
 */
public class Lexer {

    private String sourcePath;
    private LineNumberReader reader;

    public Lexer(String sourcePath) {
        this.sourcePath = sourcePath;
        try {
            reader = new LineNumberReader(new FileReader(sourcePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Token> getTokens() throws IOException{
        List<Token> tokens = new ArrayList<Token>();
        while (reader.ready()) {
            String line = reader.readLine();
            Token token = null;
            StringBuilder stringBuilder = null;
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == '/' && line.charAt(i+1) == '/') {
                    break;
                }
                if(line.charAt(i) == ' ') {
                    if(token != null) {
                        token.setText(stringBuilder.toString());
                        token.setLineNumber(reader.getLineNumber());
                        tokens.add(token);
                        token = null;
                        stringBuilder = null;
                    }
                } else {
                    if (token != null) {
                        stringBuilder.append(line.charAt(i));
                    } else {
                        token = new Token();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(line.charAt(i));
                    }
                }
            }
            if(token!=null) {
                token.setText(stringBuilder.toString());
                token.setLineNumber(reader.getLineNumber());
                tokens.add(token);
            }

            //EOL as delimiter token
            tokens.add(Token.EOL);
        }
        tokens.add(Token.EOF);
        return tokens;
    }
}
