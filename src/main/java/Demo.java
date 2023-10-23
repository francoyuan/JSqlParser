import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

public class Demo {
    public static void main(String[] args) throws JSQLParserException {
        Statement parse = CCJSqlParserUtil.parse("select a->c,d from b");
        System.out.println(parse);

    }
}
