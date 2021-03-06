package com.stats.baseballStatsWS.service;

import com.google.gson.Gson;
import com.stats.baseballStatsWS.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PlayerFileService {

    @Autowired
    private RestTemplate restTemplate;

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

    public HitterDataDto getHitterData(String profileUrl, String year, String mlbSeason, String opponentId) throws FileNotFoundException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/susanabarnwell/Documents/baseballStatsWS/playerProfileJson.json"));
        PlayerObjectDto player = new Gson().fromJson(br, PlayerObjectDto.class);

        HitterDataDto hitterDataDto = new HitterDataDto();
        List<SeasonDto> seasonDtos = getSeasonList(player, year, mlbSeason);
        List<SeasonDto> hitterProfileSeasons = getSeasonList(player, year, mlbSeason);

        hitterDataDto.setName(player.getPlayer().getFull_name());
        hitterDataDto.setRisp(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getHit_risp()/seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getAb_risp());
        hitterDataDto.setAvg(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getAvg());
        hitterDataDto.setHr(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOnbase().getHr());
        hitterDataDto.setRbi2Out(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getRbi_2out());
        hitterDataDto.setLeftOnBase(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getLob());
        hitterDataDto.setRbi(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getRbi());
        hitterDataDto.setExtraBaseHit(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getXbh());
        hitterDataDto.setLobRisp2Out(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getLob_risp_2out());
        hitterDataDto.setPitcher_hand(seasonDtos.get(0).getTotals().getSplits().getHitting().getOverall().get(0).getPitcher_hand());
        hitterDataDto.setMonths(seasonDtos.get(0).getTotals().getSplits().getHitting().getOverall().get(0).getMonth());
        hitterDataDto.setHomeAway(seasonDtos.get(0).getTotals().getSplits().getHitting().getOverall().get(0).getHome_away());
        hitterDataDto.setFlyOuts(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getFo());
        hitterDataDto.setFlyOutsIntoDoublePlays(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getFidp());
        hitterDataDto.setFlyBalls(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getFlyball());
        hitterDataDto.setGroundBall(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getGroundball());
        hitterDataDto.setGroundOuts(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getGo());
        hitterDataDto.setGroundedIntoDoublePlay(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getGidp());
        hitterDataDto.setHitsWithRisp(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getHit_risp());
        hitterDataDto.setIsolatedPower(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getIso());
        hitterDataDto.setLineDrive(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getLinedrive());
        hitterDataDto.setLineOut(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getLo());
        hitterDataDto.setLineOutsIntoDoublePlay(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getLidp());
        hitterDataDto.setOnBasePercentage(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getObp());
        hitterDataDto.setPopOuts(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getPo());
        hitterDataDto.setPopUps(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getPopup());
        hitterDataDto.setSluggingPercentage(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getSlg());
        hitterDataDto.setStrikeoutsLooking(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getKlook());
        hitterDataDto.setStrikesLooking(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOutcome().getKlook());
        hitterDataDto.setStrikeoutsSwinging(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOuts().getKswing());
        hitterDataDto.setStrikesSwinging(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOutcome().getKswing());
        hitterDataDto.setWalks(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getBb());
        hitterDataDto.setWalksPerPlateAppearance(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getBbpa());
        hitterDataDto.setAtBats(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getAb());
        hitterDataDto.setHits(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOnbase().getH());
        hitterDataDto.setDoubles(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOnbase().getD());
        hitterDataDto.setTriples(seasonDtos.get(0).getTotals().getStatistics().getHitting().getOverall().getOnbase().getT());

        if (opponentId != null && !Objects.equals(opponentId, "null")) {
            hitterDataDto.setOpponentStats(getOpponentStats(hitterProfileSeasons.get(0).getTotals().getSplits().getHitting().getOverall().get(0).getOpponent(), opponentId));
            if (hitterDataDto.getOpponentStats().size() > 0) {
                hitterDataDto.setOpponentName(hitterDataDto.getOpponentStats().get(0).getName());
            }
        }

        hitterDataDto.setLinkForBrooksBaseball(getLinkFromBrooksBaseball(player.getPlayer().getFull_name()));
        return hitterDataDto;
    }

    public String getLinkFromBrooksBaseball(String fullName) {
        List<MlbPlayer> player = null;
        String playerId = null;
        String mlbUrl = "https://statsapi.mlb.com/api/v1/sports/1/players?fields=people,fullName,lastName,nameSlug";
        MlbPeople mlbPeople = restTemplate.getForObject(mlbUrl, MlbPeople.class);

        if (mlbPeople != null) {
            player = mlbPeople.getPeople()
                    .stream()
                    .filter(mlbPlayer -> mlbPlayer.getFullName().split(" ")[0].equalsIgnoreCase(fullName.split(" ")[0])
                            && mlbPlayer.getFullName().split(" ")[1].equalsIgnoreCase(fullName.split(" ")[1]))
                    .collect(Collectors.toList());

            String[] playerNameSlug = player.get(0).getNameSlug().split("-");
            playerId = playerNameSlug[playerNameSlug.length-1];
        }
        return "http://www.brooksbaseball.net/h_profile.php?player=" + playerId + "&time=month&startDate=01/01/2019&endDate=01/01/2020";
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
