package be.jerem.test;


import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class TestReadJson
{
	public static void main(String[] args) throws IOException
	{

		String url = "https://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/?key=8957943EDAA5973F0176A11C48DD8B05&match_id=413654773";
		ObjectMapper mapper = new ObjectMapper();
		Details details = mapper.readValue(new URL(url), Details.class);

		System.out.println(details.toString());
	}
}
