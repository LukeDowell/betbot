package com.lukedowell.betbot

import scala.language.implicitConversions

trait Command {
  def user: String
  def name: String
  def args: List[String]
}

case class ValidCommand(user: String, name: String, args: List[String]) extends Command

case object InvalidCommand extends Command {
  override def user: String = ""
  override def name: String = ""
  override def args: List[String] = Nil
}

object Command {
  implicit def stringToCommand(s: String): Command = s match {
    case _ => InvalidCommand
  }
}