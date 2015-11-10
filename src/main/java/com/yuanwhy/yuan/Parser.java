package com.yuanwhy.yuan;

import com.yuanwhy.yuan.ast.AST;

import java.util.List;

/**
 * Created by why on 2015/11/9.
 */
public class Parser {
    private List<Token> tokens;
    private AST ast;

    public void readTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public void parse(){

    }

    public AST getAST() {
        return ast;
    }
}
