import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class test {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		//https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=f3e65284bc8e427bfbc793a034bded903d181eaf
		try {
			
			
			con.setRequestMethod("GET");
			//int status = con.getResponseCode();
			BufferedReader in = new BufferedReader(
					  new InputStreamReader(con.getInputStream()));
					String inputLine;
					StringBuffer content = new StringBuffer();
					while ((inputLine = in.readLine()) != null) {
					    content.append(inputLine);
					}
					in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			con.disconnect();
		}
	}

}
