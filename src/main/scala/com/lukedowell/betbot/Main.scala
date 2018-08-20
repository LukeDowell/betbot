package com.lukedowell.betbot

import akka.actor._
import com.lukedowell.betbot.actor.{ChallongeActor, TwitchActor}

object Main extends App {

  val system: ActorSystem = ActorSystem("betbot")

  val twitchSupervisorRef = system.actorOf(TwitchActor.props)
  val challongeSupervisorRef = system.actorOf(ChallongeActor.props)
}
