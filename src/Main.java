import lexer.Lexer;
import parser.Parser;
import tool.Tool;

public class Main {
	public static void main(String[] args) {
		//TODO �������ô��������
		String text=Tool.reader("data/test.txt");
		//System.out.println(text);
		Lexer lex=new Lexer(text);
		Parser parser=new Parser(lex);
		parser.program();
	}
}
