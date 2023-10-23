/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2023 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

public class Demo {
    public static void main(String[] args) throws JSQLParserException {
        Statement parse = CCJSqlParserUtil.parse("select a->c,d from b");
        System.out.println(parse);

    }
}
