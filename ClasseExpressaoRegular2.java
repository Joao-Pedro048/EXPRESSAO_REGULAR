import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ClasseExpressaoRegular2 {
    public static void main(String[] args) {
    Pattern p = Pattern.compile("((hi|su)per)mercado");

    Matcher n=p.matcher("supermercado");
    while(n.find()){
        System.out.println(n.group());
    }
}
}