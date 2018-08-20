package com.lukedowell.betbot.actor

import akka.actor.{Actor, Props}

object ChallongeScrapingActor {
  def props: Props = Props[ChallongeScrapingActor]
}

class ChallongeScrapingActor extends Actor {
  override def receive: Receive = ???
}