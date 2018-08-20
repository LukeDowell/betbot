package com.lukedowell.betbot.model

/**
  * Represents a user of betbot, someone who can place bets
  * @param id The identifier of the user
  * @param balance The user's balance
  */
case class User(id: String, balance: Int) {
  def +(amt: Int) = User(id, balance + amt)
  def -(amt: Int) = User(id, balance - amt)
}
