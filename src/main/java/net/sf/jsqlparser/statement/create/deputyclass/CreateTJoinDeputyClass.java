/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2023 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */

package net.sf.jsqlparser.statement.create.deputyclass;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;
import net.sf.jsqlparser.statement.select.Select;

//TODO TMDB
//createTJoinDeputyClass类，javacc解析之后可以生成一个这样的类，之后对这个类进行解析，具体写法参考createdeputyclass
//需要完成get set， 重写tostring
public class CreateTJoinDeputyClass implements Statement {

    private Table deputyClass;
    private Select select;
    private boolean orReplace = false;


    @Override
    public void accept(StatementVisitor statementVisitor) {
        statementVisitor.visit(this);
    }

    public Table getDeputyClass() {
        return deputyClass;
    }

    public void setDeputyClass(Table deputyClass) {
        this.deputyClass = deputyClass;
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }


    public boolean isOrReplace() {
        return orReplace;
    }

    public void setOrReplace(boolean orReplace) {
        this.orReplace = orReplace;
    }
    @Override
    public String toString() {
        StringBuilder sql = new StringBuilder("CREATE ");
        if (isOrReplace()) {
            sql.append("OR REPLACE ");
        }
        sql.append("TJoinDeputyClass ");
        sql.append(deputyClass);
        sql.append(" AS ").append(select);
        return sql.toString();
    }



}
