//import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class myChecker_test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        myCheckerLexer lexer = new myCheckerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        myCheckerParser parser = new myCheckerParser(tokens);
        parser.translationUnit();
    }
}
