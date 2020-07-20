import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

class ResponseCodeCheck
{

    public static void main (String args[]) throws IOException
    {

        URL url = new URL("http://vix.digital");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int code = connection.getResponseCode();
        System.out.println("Response code of the object is "+code);
        if (code==200)
        {
            System.out.println("OK");
        }
    }
}
