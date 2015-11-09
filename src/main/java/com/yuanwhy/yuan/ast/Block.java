package com.yuanwhy.yuan.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by why on 2015/11/9.
 */
public class Block extends Statement {
    private List<Statement> statements = new ArrayList<Statement>();

    public List<Statement> getStatements() {
        return statements;
    }
}
