import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class EntrevistaEmbaracosa {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word;

    while((word = br.readLine()) != null) {
      boolean hasRepeated = false;
      for(int i=0; i <= word.length() - 1; i++) {
        if( word.substring(0, i).endsWith(word.substring(i)) ) {
          System.out.println(word.substring(0, i));
          hasRepeated = true;
        }
      }
      if(!hasRepeated) {
        System.out.println(word);
      }
    }
  }
}
