import java.io.InputStreamReader;
import java.io.Reader;
class Rei {
    public static void main(String[] arg) throws ParseException {
	final Reader r = new InputStreamReader(System.in);
	final Parser parser = new Parser(r);
	final double tree = parser.start();
	  System.out.println(tree);
	}
}