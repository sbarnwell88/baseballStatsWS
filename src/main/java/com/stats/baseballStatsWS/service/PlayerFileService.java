package com.stats.baseballStatsWS.service;

import com.google.gson.Gson;
import com.stats.baseballStatsWS.dto.*;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerFileService {

    public PitcherDataDto getPitcherData(String pitchMetricsUrl, String profileUrl, String year, String mlbSeason, String opponentId) throws FileNotFoundException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/susanabarnwell/Documents/baseballStatsWS/player.json"));
        PlayerObjectDto player = new Gson().fromJson(br, PlayerObjectDto.class);

        System.out.println("before delay");
        Thread.sleep(5000);
        System.out.println("after delay");

        // other api/json call
        BufferedReader br2 = new BufferedReader(new FileReader("/Users/susanabarnwell/Documents/baseballStatsWS/pitcherProfile.json"));
        PlayerObjectDto playerProfile = new Gson().fromJson(br2, PlayerObjectDto.class);

        PitcherDataDto pitcherDataDto = new PitcherDataDto();
        List<SeasonDto> seasonDtos = getSeasonList(player, year, mlbSeason);
        List<SeasonDto> pitcherProfileSeasons = getSeasonList(playerProfile, year, mlbSeason);

        pitcherDataDto.setName(player.getPlayer().getFull_name());
        pitcherDataDto.setPitchCount(getPitchCount(seasonDtos));
        pitcherDataDto.setPitchTypes(seasonDtos.get(0).getTotals().getStatistics().getPitch_metrics().getPitch_types());
        pitcherDataDto.setHitterHand(pitcherProfileSeasons.get(0).getTotals().getSplits().getPitching().getOverall().get(0).getHitter_hand());
        pitcherDataDto.setHomeAway(pitcherProfileSeasons.get(0).getTotals().getSplits().getPitching().getOverall().get(0).getHome_away());
        pitcherDataDto.setLastStarts(pitcherProfileSeasons.get(0).getTotals().getSplits().getPitching().getOverall().get(0).getLast_starts());
        pitcherDataDto.setOverallStats(pitcherProfileSeasons.get(0).getTotals().getStatistics().getPitching().getOverall());
        pitcherDataDto.setMonths(pitcherProfileSeasons.get(0).getTotals().getSplits().getPitching().getOverall().get(0).getMonth());

        if (!opponentId.equals("null")) {
            pitcherDataDto.setOpponentStats(getOpponentStats(pitcherProfileSeasons.get(0).getTotals().getSplits().getPitching().getOverall().get(0).getOpponent(), opponentId));
            if (pitcherDataDto.getOpponentStats().size() > 0) {
                pitcherDataDto.setOpponentName(pitcherDataDto.getOpponentStats().get(0).getName());
            }
        }

        return pitcherDataDto;
    }

    public List<SeasonDto> getSeasonList(PlayerObjectDto player, String year, String mlbSeason) {
        return player.getPlayer().getSeasons()
                .stream()
                .filter(season -> season.getYear() == Integer.parseInt(year) && season.getType().equalsIgnoreCase(mlbSeason))
                .collect(Collectors.toList());
    }

    public List<OpponentSplitsDto> getOpponentStats(List<OpponentSplitsDto> opponents, String opponentId) {
        return opponents
                .stream()
                .filter(team -> team.getId().equals(opponentId))
                .collect(Collectors.toList());
    }

    public int getPitchCount(List<SeasonDto> seasonDtos) {
        return seasonDtos.get(0).getTotals().getStatistics().getPitch_metrics().getOverall().getCount();
    }
}
