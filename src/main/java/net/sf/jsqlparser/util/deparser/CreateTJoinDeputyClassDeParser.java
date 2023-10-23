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

import net.sf.jsqlparser.statement.create.deputyclass.CreateDeputyClass;
import net.sf.jsqlparser.statement.create.deputyclass.CreateTJoinDeputyClass;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectVisitor;
import net.sf.jsqlparser.statement.select.WithItem;

//TODO TMDB
//因为JSqlParser支持deparser，创建了parser方法之后，还要写一个deparser，参考createDeputyClassDeparser
public class CreateTJoinDeputyClassDeParser extends AbstractDeParser<CreateTJoinDeputyClass> {
    private final SelectVisitor selectVisitor;

    public CreateTJoinDeputyClassDeParser(StringBuilder buffer) {
        super(buffer);
        SelectDeParser selectDeParser = new SelectDeParser();
        selectDeParser.setBuffer(buffer);
        ExpressionDeParser expressionDeParser = new ExpressionDeParser(selectDeParser, buffer);
        selectDeParser.setExpressionVisitor(expressionDeParser);
        selectVisitor = selectDeParser;
    }

    public CreateTJoinDeputyClassDeParser(StringBuilder buffer, SelectVisitor selectVisitor) {
        super(buffer);
        this.selectVisitor = selectVisitor;
    }

    @Override
    @SuppressWarnings({"PMD.CyclomaticComplexity", "PMD.NPathComplexity"})
    public void deParse(CreateTJoinDeputyClass createDeputyClass) {
        buffer.append("CREATE ");
        if (createDeputyClass.isOrReplace()) {
            buffer.append("OR REPLACE ");
        }

        buffer.append("TJoinDeputyClass ").append(createDeputyClass.getDeputyClass().getFullyQualifiedName());

        buffer.append(" AS ");

        Select select = createDeputyClass.getSelect();
        if (select.getWithItemsList() != null) {
            buffer.append("WITH ");
            boolean first = true;
            for (WithItem item : select.getWithItemsList()) {
                if (!first) {
                    buffer.append(", ");
                } else {
                    first = false;
                }

                item.accept(selectVisitor);
            }
            buffer.append(" ");
        }
        createDeputyClass.getSelect().getSelectBody().accept(selectVisitor);
    }
}
