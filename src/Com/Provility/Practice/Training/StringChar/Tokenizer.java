package Com.Provility.Practice.Training.StringChar;
import java.util.StringTokenizer;
public class Tokenizer {
    public static void main(String[] args) {
        String myStr = " This: is : the : Java : Code : String : Tokenizer : Tariq";
        String myDelim = ":";
        boolean returnDelim = false;
        StringTokenizer st = new StringTokenizer(myStr,myDelim,returnDelim);
        int count = st.countTokens();
        System.out.println("Number of Token : " + count);
        for(int i= 0;i<count;i++)
            System.out.println("Token are [" +i+"] : " + st.nextToken());
        while (st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
    }
}
