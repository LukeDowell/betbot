package com.lukedowell.betbot.actor

import akka.actor.{Actor, Props}

object ChallongeActor {
  def props: Props = Props[ChallongeActor]
}

class ChallongeActor extends Actor {
  override def receive: Receive = ???
}