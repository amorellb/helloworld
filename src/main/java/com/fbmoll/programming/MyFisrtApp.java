package com.fbmoll.programming;

import com.fbmoll.programming.data.competition.Player;
import com.fbmoll.programming.data.competition.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyFisrtApp {
    // Creamos una función que nos permita crear equipos.
    private static Team createTeam(String name, String icon, List<Player> players) {
        Team team = new Team();
        team.setName(name);
        team.setIcon(icon);
        team.setPlayerList(players);
        return team;
    }

    public static void main(String[] args) {
        /*Team team = new Team();
        team.setName("Madrid FC");
        team.setIcon("iconCutre.png");
        team.setPlayerList(new ArrayList<>());
        Team teamAlternative = new Team();
        teamAlternative.setName("Mashorca");
        teamAlternative.setIcon("icon.jpg");
        teamAlternative.setPlayerList(new ArrayList<>());*/

        Team madrid = createTeam("Madrid FC", "myIcon.png", new ArrayList<>());
        Team mashorca = createTeam("Mashorca FC", "myIcon2.png", new LinkedList<>());
    }
}
