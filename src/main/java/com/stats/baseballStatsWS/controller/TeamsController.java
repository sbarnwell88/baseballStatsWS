package com.stats.baseballStatsWS.controller;

import com.stats.baseballStatsWS.dto.*;
import com.stats.baseballStatsWS.service.TeamsFileService;
import com.stats.baseballStatsWS.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

import static com.stats.baseballStatsWS.util.ConstantsUrl.SPORT_RADAR_URL;

@RestController
public class TeamsController {

    @Autowired
    private TeamsService teamsService;

    @Autowired
    private TeamsFileService teamsFileService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/teams")
    public ResponseEntity<?> getListOfTeams() throws FileNotFoundException {
        String url = SPORT_RADAR_URL + "games/2019/REG/schedule.json?api_key="
                + System.getenv("API_KEY");

        LeagueScheduleDto leagueScheduleDtos = teamsService.getLeagueSchedule(url);
//        LeagueScheduleDto leagueScheduleDtos = teamsFileService.getLeagueSchedule();

        return ResponseEntity.ok().body(leagueScheduleDtos);
    }

    @GetMapping(value = "/players")
    public ResponseEntity<?> getListOfPlayers(@RequestParam String teamId, @RequestParam String position) throws FileNotFoundException {
        String url = SPORT_RADAR_URL + "teams/" + teamId + "/profile.json?api_key="
                + System.getenv("API_KEY");

        List<PlayerDto> players = teamsService.getTeamRoster(url, position);
//        List<PlayerDto> players = teamsFileService.getTeamRoster(position);

        return ResponseEntity.ok().body(players);
    }

    @GetMapping(value = "/healthCheck")
    public ResponseEntity<?> healthCheck() {

        return ResponseEntity.ok().body("App is up and running!");
    }
}
