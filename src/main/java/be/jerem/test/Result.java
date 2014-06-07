package be.jerem.test;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Result
{
	@JsonProperty("players")
	List<Player> players;
	@JsonProperty("radiant_win")
	Boolean radiant_win;
	@JsonProperty("duration")
	Integer duration;
	@JsonProperty("start_time")
	Long start_time;
	@JsonProperty("match_id")
	Long match_id;
	@JsonProperty("match_seq_num")
	Long match_seq_num;
	@JsonProperty("tower_status_radiant")
	Long tower_status_radiant;
	@JsonProperty("tower_status_dire")
	Long tower_status_dire;
	@JsonProperty("barracks_status_radiant")
	Long barracks_status_radiant;
	@JsonProperty("barracks_status_dire")
	Long barracks_status_dire;

	@JsonProperty("cluster")
	Integer cluster;
	@JsonProperty("first_blood_time")
	Integer first_blood_time;
	@JsonProperty("lobby_type")
	Integer lobby_type;
	@JsonProperty("human_players")
	Integer human_players;
	@JsonProperty("leagueid")
	Integer leagueid;
	@JsonProperty("positive_votes")
	Integer positive_votes;
	@JsonProperty("negative_votes")
	Integer negative_votes;
	@JsonProperty("game_mode")
	Integer game_mode;


	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("#result : \n");
		sb.append("#> players :");
		int i = 1;
		for (Player player : players)
		{
			sb.append("\n#>> ");
			sb.append("player ");
			sb.append(i);
			sb.append(" :");
			sb.append(player);
			i++;
		}
		sb.append("\n#> radiant_win : ");
		sb.append(radiant_win);
		sb.append("\n#> duration : ");
		sb.append(duration);
		sb.append("\n#> start_time : ");
		sb.append(start_time);
		sb.append("\n#> match_id : ");
		sb.append(match_id);
		sb.append("\n#> match_seq_num : ");
		sb.append(match_seq_num);
		sb.append("\n#> tower_status_radiant : ");
		sb.append(tower_status_radiant);
		sb.append("\n#> tower_status_dire : ");
		sb.append(tower_status_dire);
		sb.append("\n#> barracks_status_radiant : ");
		sb.append(barracks_status_radiant);
		sb.append("\n#> barracks_status_dire : ");
		sb.append(barracks_status_dire);
		sb.append("\n#> cluster : ");
		sb.append(cluster);
		sb.append("\n#> first_blood_time : ");
		sb.append(first_blood_time);
		sb.append("\n#> lobby_type : ");
		sb.append(lobby_type);
		sb.append("\n#> human_players : ");
		sb.append(human_players);
		sb.append("\n#> leagueid : ");
		sb.append(leagueid);
		sb.append("\n#> positive_votes : ");
		sb.append(positive_votes);
		sb.append("\n#> negative_votes : ");
		sb.append(negative_votes);
		sb.append("\n#> game_mode : ");
		sb.append(game_mode);


		return sb.toString();
	}
}
