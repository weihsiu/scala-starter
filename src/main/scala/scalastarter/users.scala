package scalastarter

import upickle._

object Users {

  case class Address(street: String, city: String, country: String)
  case class User(name: String, address: Address)

  def toJson(user: User): String = write(user)
  def fromJson(json: String): User = read[User](json)
}