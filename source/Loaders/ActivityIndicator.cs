namespace Loaders
{

    public class ActivityIndicator
    {
        public static void Main(string[] args)
        {
            String spinner = "―\\|/";

            for (int x = 0; x < 101; x++)
            {
                Console.WriteLine("\r Progresso: " + spinner.charAt(x % spinner.length()) + " " + x + "%");
                Thread.sleep(40);
            }
        }
    }

}
