package com.yuanwhy.yuan;

import com.yuanwhy.yuan.ast.AST;
import com.yuanwhy.yuan.ast.Block;
import com.yuanwhy.yuan.ast.Statement;

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
        Block block = new Block();
        List<Statement> statementList = block.getStatements();
        Statement statement;
        for (Token token : tokens) {
            
        }
    }

    public AST getAST() {
        return ast;
    }
}
