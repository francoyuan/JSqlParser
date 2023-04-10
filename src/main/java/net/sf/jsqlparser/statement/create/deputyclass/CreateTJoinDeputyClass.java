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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.StatementVisitor;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
//TODO TMDB
//createTJoinDeputyClass类，javacc解析之后可以生成一个这样的类，之后对这个类进行解析，具体写法参考createdeputyclass
//需要完成get set， 重写tostring
public class CreateTJoinDeputyClass implements Statement {

    private Table deputyClass;
    private Select select;


    @Override
    public void accept(StatementVisitor statementVisitor) {
//
    }



}
