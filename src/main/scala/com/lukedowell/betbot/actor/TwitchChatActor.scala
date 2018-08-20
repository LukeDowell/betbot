package com.lukedowell.betbot.actor

import akka.actor.{Actor, Props}

object TwitchChatActor {
  def props: Props = Props[TwitchChatActor]
}

class TwitchChatActor extends Actor {
  override def receive: Receive = ???
}
