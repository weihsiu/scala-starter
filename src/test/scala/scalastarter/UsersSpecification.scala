package scalastarter

class UsersSpecification extends org.specs2.mutable.Specification {
  import Users._
  "Users object should serialize User to/from json correctly" >> {
    val user = User("Walter Chang", Address("123 Ho-Ping E. Rd.", "Taipei", "Taiwan"))
    fromJson(toJson(user)) must_== user
  }
}