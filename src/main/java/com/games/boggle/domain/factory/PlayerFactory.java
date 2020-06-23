package com.games.boggle.domain.factory;

import com.games.boggle.domain.Player;
import com.games.boggle.domain.realization.ComputerPlayer;
import com.games.boggle.domain.realization.HumanPlayer;

public class PlayerFactory {
	public static final int COMPUTER = 1;
	public static final int HUMAN    = 2;
	
	public static final Player createPlayer(int playerType, String playerName) {
		Player retval = new ComputerPlayer(playerName);
		
		if(playerType == PlayerFactory.HUMAN) {
			retval = new HumanPlayer(playerName);
		}
		
		return retval;
	}

}
