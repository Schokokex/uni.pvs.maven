package de.uulm.sp.pvs.util.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int player_id;
	private String player_name;
	private int games_played;
	private int games_won;

	// public Player(String name) {
	// 	this.player_name = name;
	// 	this.games_won = 0;
	// 	this.games_played = 0;
	// }

	public String getPlayerName() {
		return player_name;
	}

	public int getPlayerId() {
		return player_id;
	}

	public int getGamesPlayed() {
		return games_played;
	}

	public int getGamesWon() {
		return games_won;
	}

	public void setName(String name) {
		this.player_name = name;
	}
}