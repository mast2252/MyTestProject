package be.jerem.test;

import org.codehaus.jackson.annotate.JsonProperty;

public class Details
{
	@JsonProperty("result")
	public Result result;


	@Override
	public String toString()
	{
		return "details : \n" + result.toString();
	}
}
