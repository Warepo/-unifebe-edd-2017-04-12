package loaders;

public class ProgressBar
{
    public static void main(String[] args) throws Exception
    {
        // String progressFill = "█";
        // String progressSemi = "▓";
        // String progressNull = "▒";
        // String bar = "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒";

        String progressFill = "=";
        String progressSemi = ">";
        String progressNull = "-";
        String bar = "--------------------------------------------------";

        String baring = bar;

        for (int x = 0; x <= bar.length(); x++)
        {
            // if (x % 2 != 0) continue;

            baring = ProgressBar.replaceCharAt(ProgressBar.replaceCharAt(baring, x, progressFill), x + 1, progressSemi);

            System.out.print("\r [ " + baring  + " ] " + x + "%");

            Thread.sleep(60);
        }
    }

    private static String replaceCharAt(String s, int pos, String c)
    {
        return s.substring(0, pos) + c + s.substring(pos + 1);
    }
}
