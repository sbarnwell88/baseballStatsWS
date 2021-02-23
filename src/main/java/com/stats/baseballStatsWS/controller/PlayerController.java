package com.stats.baseballStatsWS.controller;

import com.stats.baseballStatsWS.dto.HitterDataDto;
import com.stats.baseballStatsWS.dto.PitcherDataDto;
import com.stats.baseballStatsWS.service.PlayerFileService;
import com.stats.baseballStatsWS.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

import static com.stats.baseballStatsWS.util.ConstantsUrl.SPORT_RADAR_URL;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private PlayerFileService playerFileService;

    @GetMapping(value = "/pitcherProfile")
    public ResponseEntity<?> getPitcherData(@RequestParam String playerId, @RequestParam String year, @RequestParam String mlbSeason, @RequestParam(required = false) String opponentId) throws FileNotFoundException, InterruptedException {
        String pitchMetricsUrl = SPORT_RADAR_URL + "players/" + playerId + "/pitch_metrics.json?api_key="
                + System.getenv("API_KEY");

        String profileUrl = SPORT_RADAR_URL + "players/" + playerId + "/profile.json?api_key="
                + System.getenv("API_KEY");

        PitcherDataDto pitcherDataDto = playerService.getPitcherData(pitchMetricsUrl, profileUrl, year, mlbSeason, opponentId);
//        PitcherDataDto pitcherDataDto = playerFileService.getPitcherData(pitchMetricsUrl, profileUrl, year, mlbSeason, opponentId);

        return ResponseEntity.ok().body(pitcherDataDto);
    }

    @GetMapping(value = "/hitterProfile")
    public ResponseEntity<?> getHitterData(@RequestParam String playerId, @RequestParam String year, @RequestParam String mlbSeason, @RequestParam(required = false) String opponentId) throws FileNotFoundException, InterruptedException {
        String profileUrl = SPORT_RADAR_URL + "players/" + playerId + "/profile.json?api_key="
                + System.getenv("API_KEY");

        HitterDataDto hitterDataDto = playerService.getHitterData(profileUrl, year, mlbSeason, opponentId);
//        HitterDataDto hitterDataDto = playerFileService.getHitterData(profileUrl, year, mlbSeason, opponentId);

        return ResponseEntity.ok().body(hitterDataDto);
    }
}
