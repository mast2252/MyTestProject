package be.jerem.test;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Player
{
	@JsonProperty("account_id")
	Long account_id;
	@JsonProperty("player_slot")
	Integer player_slot;
	@JsonProperty("hero_id")
	Integer hero_id;
	@JsonProperty("item_0")
	Integer item_0;
	@JsonProperty("item_1")
	Integer item_1;
	@JsonProperty("item_2")
	Integer item_2;
	@JsonProperty("item_3")
	Integer item_3;
	@JsonProperty("item_4")
	Integer item_4;
	@JsonProperty("item_5")
	Integer item_5;

	@JsonProperty("kills")
	Integer kills;
	@JsonProperty("deaths")
	Integer deaths;
	@JsonProperty("assists")
	Integer assists;

	@JsonProperty("leaver_status")
	Integer leaver_status;
	@JsonProperty("gold")
	Integer gold;
	@JsonProperty("last_hits")
	Integer last_hits;
	@JsonProperty("denies")
	Integer denies;
	@JsonProperty("gold_per_min")
	Integer gold_per_min;
	@JsonProperty("xp_per_min")
	Integer xp_per_min;
	@JsonProperty("gold_spent")
	Integer gold_spent;
	@JsonProperty("hero_damage")
	Integer hero_damage;
	@JsonProperty("tower_damage")
	Integer tower_damage;
	@JsonProperty("hero_healing")
	Integer hero_healing;
	@JsonProperty("level")
	Integer level;

	@JsonProperty("ability_upgrades")
	List<AbilityUpgrade> ability_upgrades;

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(account_id);
		sb.append("\n#>>>player_slot : ");
		sb.append(player_slot);
		sb.append("\n#>>>hero_id : ");
		sb.append(hero_id);
		sb.append("\n#>>>item_0 : ");
		sb.append(item_0);
		sb.append("\n#>>>item_1 : ");
		sb.append(item_1);
		sb.append("\n#>>>item_2 : ");
		sb.append(item_2);
		sb.append("\n#>>>item_3 : ");
		sb.append(item_3);
		sb.append("\n#>>>item_4 : ");
		sb.append(item_4);
		sb.append("\n#>>>item_5 : ");
		sb.append(item_5);
		sb.append("\n#>>>kills : ");
		sb.append(kills);
		sb.append("\n#>>>deaths : ");
		sb.append(deaths);
		sb.append("\n#>>>assists : ");
		sb.append(assists);
		sb.append("\n#>>>leaver_status : ");
		sb.append(leaver_status);
		sb.append("\n#>>>gold : ");
		sb.append(gold);
		sb.append("\n#>>>last_hits : ");
		sb.append(last_hits);
		sb.append("\n#>>>denies : ");
		sb.append(denies);
		sb.append("\n#>>>gold_per_min : ");
		sb.append(gold_per_min);
		sb.append("\n#>>>xp_per_min : ");
		sb.append(xp_per_min);
		sb.append("\n#>>>gold_spent : ");
		sb.append(gold_spent);
		sb.append("\n#>>>hero_damage : ");
		sb.append(hero_damage);
		sb.append("\n#>>>tower_damage : ");
		sb.append(tower_damage);
		sb.append("\n#>>>hero_healing : ");
		sb.append(hero_healing);
		sb.append("\n#>>>level : ");
		sb.append(level);

		return sb.toString();
	}
}
