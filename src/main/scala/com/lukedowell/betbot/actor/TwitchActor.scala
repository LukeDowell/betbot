package com.lukedowell.betbot.actor

import akka.actor.{Actor, Props}

object TwitchActor {
  def props: Props = Props[TwitchActor]
}

class TwitchActor extends Actor {
  override def receive: Receive = ???
}
