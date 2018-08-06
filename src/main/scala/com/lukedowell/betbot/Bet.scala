package com.lukedowell.betbot

/**
  * A single bet placed by a user
  * @param owner The user that placed the bet
  * @param target The target on which this bet is placed
  * @param amount The amount the bet is for
  */
case class Bet(owner: String, target: String, amount: Int)