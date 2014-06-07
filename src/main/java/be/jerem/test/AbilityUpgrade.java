package be.jerem.test;

import org.codehaus.jackson.annotate.JsonProperty;

public class AbilityUpgrade
{

	@JsonProperty("ability")
	Integer ability;
	@JsonProperty("time")
	Integer time;
	@JsonProperty("level")
	Integer level;
}
