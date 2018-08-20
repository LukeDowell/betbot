package com.lukedowell.betbot.service

import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{HttpRequest, HttpResponse, StatusCodes}

import scala.concurrent.Future

/**
  * https://api.challonge.com/v1
  */
object Challonge {

  /* The root url for challonge's api */
  val baseUrl = "https://api.challonge.com/v1"

  def getTournamentById(id: String): Future[Option[Any]] =
    Http().singleRequest(HttpRequest(uri = s"$baseUrl/tournaments/$id.json")) map {
      case response @ HttpResponse(StatusCodes.OK, _, _, _) =>
        println(s"GET - tournamentById response=$response")
        Some(response)
      case _ => None
    }

}
