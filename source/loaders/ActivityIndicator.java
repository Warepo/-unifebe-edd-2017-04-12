package loaders;

public class ActivityIndicator
{
    public static void main() throws Exception
    {
        String spinner = "―\\|/";

        for (int x = 0; x < 101; x++)
        {
            System.out.print("\r Progresso: " + spinner.charAt(x % spinner.length())  + " " + x + "%");
            Thread.sleep(40);
        }
    }
}
