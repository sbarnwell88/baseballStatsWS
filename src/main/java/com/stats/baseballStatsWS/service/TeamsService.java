package com.stats.baseballStatsWS.service;

import com.stats.baseballStatsWS.dto.LeagueScheduleDto;
import com.stats.baseballStatsWS.dto.PlayerDto;
import com.stats.baseballStatsWS.dto.TeamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeamsService {

    @Autowired
    private RestTemplate restTemplate;

    public LeagueScheduleDto getLeagueSchedule(String url) {
        return restTemplate.getForObject(url, LeagueScheduleDto.class);
    }

    public List<PlayerDto> getTeamRoster(String url, String position) {
        List<PlayerDto> playersInPosition;
        TeamDto team = restTemplate.getForObject(url, TeamDto.class);

        if (position.equals("P") && team != null && team.getPlayers() != null) {
            playersInPosition = team.getPlayers()
                    .stream()
                    .filter(player -> player.getPosition().equals(position))
                    .collect(Collectors.toList());
        } else {
            playersInPosition = team.getPlayers()
                    .stream()
                    .filter(player -> !player.getPosition().equals(position))
                    .collect(Collectors.toList());
        }
        return playersInPosition;
    }
}
