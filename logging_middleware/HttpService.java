import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
class HttpService
{
    public static String post( String apiUrl, String jsonBody)
    {
        try{

            URL url=new URL(apiUrl);
            HttpURLConnection connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Authorization","Bearer " + Constants.ACCESS_TOKEN);
            connection.setDoOutput(true);
            OutputStream outputStream=connection.getOutputStream();
            outputStream.write(jsonBody.getBytes());
            outputStream.flush();
            outputStream.close();
            int responseCode=connection.getResponseCode();
            BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response=new StringBuilder();
            while ((line = reader.readLine())!= null) 
            {
                response.append(line);
            }
            reader.close();
            return "STATUS : "
                    + responseCode
                    + "\nRESPONSE : "
                    + response.toString();
        }
        catch (Exception e) 
        {
            return "ERROR : "
                    + e.getMessage();
        }
    }
}
