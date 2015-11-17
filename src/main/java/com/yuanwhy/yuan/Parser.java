package com.yuanwhy.yuan;

import com.yuanwhy.yuan.ast.ASTNode;
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
    private Block root;

    public Parser() {
        root = new Block();
    }
    public void readTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public void parse() {
        doParse(root, tokens);
    }

    //recursive parsing
    private void doParse(Block root, List<Token> tokens) {
        List<Statement> statementList = root.getStatements();
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

    public ASTNode getAST() {
        return root;
    }
}
