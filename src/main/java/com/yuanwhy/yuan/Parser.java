package com.yuanwhy.yuan;

import com.yuanwhy.yuan.ast.AST;
import com.yuanwhy.yuan.ast.Block;
import com.yuanwhy.yuan.ast.Statement;
import com.yuanwhy.yuan.ast.VariableDeclarationStatement;
import com.yuanwhy.yuan.token.Token;

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

    public void parse() {
        Block block = new Block();
        List<Statement> statementList = block.getStatements();
        Statement statement;
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i).getType() == TokenType.Identifier) {
                if (tokens.get(i + 1).getText().equals("=")) {
                    statement = new VariableDeclarationStatement();
                }
            } else {

            }
        }
    }

    public AST getAST() {
        return ast;
    }
}
