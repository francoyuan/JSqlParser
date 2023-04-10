/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.util.deparser;

import net.sf.jsqlparser.statement.create.deputyclass.CreateTJoinDeputyClass;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectVisitor;
import net.sf.jsqlparser.statement.select.WithItem;

//TODO TMDB
//因为JSqlParser支持deparser，创建了parser方法之后，还要写一个deparser，参考createDeputyClassDeparser
//public class CreateTJoinDeputyClassDeParser extends AbstractDeParser<CreateTJoinDeputyClass> {
//
//
//
//}
