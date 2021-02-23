package com.stats.baseballStatsWS.service;

import com.google.gson.Gson;
import com.stats.baseballStatsWS.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class TeamsFileService {

    public LeagueScheduleDto getLeagueSchedule() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/susanabarnwell/Documents/baseballStatsWS/leagueSchedule.json"));
        return new Gson().fromJson(br, LeagueScheduleDto.class);
    }

    public List<PlayerDto> getTeamRoster(String position) throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("/Users/susanabarnwell/Documents/baseballStatsWS/dodgers.json"));
        TeamDto team = new Gson().fromJson(br, TeamDto.class);
        List<PlayerDto> playersInPosition = null;

        if (position.equals("P") && team != null && team.getPlayers() != null) {
            playersInPosition = team.getPlayers()
                    .stream()
                    .filter(player -> player.getPosition().equals(position))
                    .collect(Collectors.toList());
        } else {
            if (team != null && team.getPlayers() != null) {
                playersInPosition = team.getPlayers()
                        .stream()
                        .filter(player -> !player.getPosition().equals("P"))
                        .collect(Collectors.toList());
            }
        }
        return playersInPosition;
    }
}
