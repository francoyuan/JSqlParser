/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2023 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression;/*
 * className:Arrow
 * Package:net.sf.jsqlparser.expression
 * Description:
 * @Author: xyl
 * @Create:2023/10/17 - 14:54
 * @Version:v1
 */

import net.sf.jsqlparser.parser.ASTNodeAccessImpl;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SelectItemVisitor;

import java.util.List;

public class ArrowExpression extends ASTNodeAccessImpl implements Expression{
    private List<Expression> chain;

    public ArrowExpression(List<Expression> chain) {

        this.chain = chain;
    }

    public ArrowExpression(){}

    public void setChain(List<Expression> chain) {
        this.chain = chain;
    }

    public List<Expression> getChain(){
        return chain;
    }


    public List<Expression> add(Expression expression){
        this.chain.add(expression);
        return this.chain;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < chain.size()-1; i++) {
            sb.append(chain.get(i).toString()).append("->");
        }
        sb.append(chain.get(chain.size()-1));
        return sb.toString();
    }

    @Override
    public void accept(ExpressionVisitor expressionVisitor) {

    }

}
