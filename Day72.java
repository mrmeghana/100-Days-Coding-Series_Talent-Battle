import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Day72
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st=new StringBuilder();
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++)
        {
            String s[]=br.readLine().split(" ");
            if(s[0].equals("+"))
            {
                int start=Integer.parseInt(s[1]);
                String sub=s[2];
                st.insert(start, sub);
            }
            else
            {
                int start=Integer.parseInt(s[1])-1;
                int last=Integer.parseInt(s[2])-1;
                String subt=st.substring(start, start+last+1);
                System.out.println(subt);
            }
        }
    }
}