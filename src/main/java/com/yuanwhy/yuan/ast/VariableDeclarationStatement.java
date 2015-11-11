package com.yuanwhy.yuan.ast;

import com.yuanwhy.yuan.token.Literal;

/**
 * Created by why on 2015/11/11.
 */
public class VariableDeclarationStatement extends Statement{
    private String name;
    private Literal initializer;
}
