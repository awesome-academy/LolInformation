package com.test.lolinformation.data.repository

import com.test.lolinformation.data.local.model.*
import com.test.lolinformation.data.remote.api.ApiService

class MatchRepositoryImp(
    private val apiService: ApiService
) : MatchRepository {

    override suspend fun getLeagueByName(name: List<String>): List<League> =
        apiService.getLeagueByName(name)

    override suspend fun getSeriesByLeague(leagueId: Int, year: Int): List<Series> =
        apiService.getSeriesByLeague(leagueId, year)

    override suspend fun getMatchBySerie(
        serieId: Int,
        page: Int,
        perPage: Int
    ): List<Match> = apiService.getMatchesBySerie(serieId, page, perPage)

    override suspend fun getTeamBySerie(serieId: Int, page: Int, perPage: Int): List<Team> =
        apiService.getTeamBySerie(serieId, page, perPage)

    override suspend fun getPlayerBySerie(
        serieId: Int,
        page: Int,
        perPage: Int
    ): List<Player> = apiService.getPlayerBySerie(serieId, page, perPage)

    override suspend fun getPlayerByTeam(teamId: Int): List<Player> =
        apiService.getPlayerByTeam(teamId)
}
